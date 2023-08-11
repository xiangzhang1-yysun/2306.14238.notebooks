from antlr4 import *
from .FormulaLexer import FormulaLexer
from .FormulaParser import FormulaParser
from .MyFormulaVisitor import JsonFormulaVisitor, FlattenedElementDictFormulaVisitor
from antlr4.error.ErrorListener import ErrorListener
from antlr4.error.Errors import ParseCancellationException


# ANTLR by default eats all errors and tries to recover from them.
# This is not what we want, so we need to throw an exception when
# an error occurs.
# https://stackoverflow.com/questions/18132078/
class ThrowingErrorListener(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        e2 = ParseCancellationException(f'line {line}: {column} {msg}')
        e2.line = line
        e2.column = column
        raise e2 from e


def parse(formula: str):
    input = InputStream(formula)
    lexer = FormulaLexer(input)
    # https://stackoverflow.com/questions/18132078/
    lexer.removeErrorListeners()
    lexer.addErrorListener(ThrowingErrorListener())
    #
    stream = CommonTokenStream(lexer)
    parser = FormulaParser(stream)
    parser.removeErrorListeners()
    parser.addErrorListener(ThrowingErrorListener())

    tree = parser.formula()

    visitor = FlattenedElementDictFormulaVisitor()
    return visitor.visit(tree)
