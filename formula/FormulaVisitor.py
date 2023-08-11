# Generated from Formula.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .FormulaParser import FormulaParser
else:
    from FormulaParser import FormulaParser

# This class defines a complete generic visitor for a parse tree produced by FormulaParser.

class FormulaVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by FormulaParser#formula.
    def visitFormula(self, ctx:FormulaParser.FormulaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FormulaParser#brktGrp.
    def visitBrktGrp(self, ctx:FormulaParser.BrktGrpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FormulaParser#lstGrp.
    def visitLstGrp(self, ctx:FormulaParser.LstGrpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FormulaParser#EleNumGrp.
    def visitEleNumGrp(self, ctx:FormulaParser.EleNumGrpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FormulaParser#num.
    def visitNum(self, ctx:FormulaParser.NumContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FormulaParser#brktNum.
    def visitBrktNum(self, ctx:FormulaParser.BrktNumContext):
        return self.visitChildren(ctx)



del FormulaParser