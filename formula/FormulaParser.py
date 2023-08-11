# Generated from Formula.g4 by ANTLR 4.13.0
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,5,37,2,0,7,0,2,1,7,1,2,2,7,2,1,0,1,0,1,0,1,1,1,1,1,1,3,1,13,
        8,1,1,1,1,1,1,1,1,1,3,1,19,8,1,3,1,21,8,1,1,1,1,1,5,1,25,8,1,10,
        1,12,1,28,9,1,1,2,1,2,1,2,1,2,1,2,3,2,35,8,2,1,2,0,1,2,3,0,2,4,0,
        0,38,0,6,1,0,0,0,2,20,1,0,0,0,4,34,1,0,0,0,6,7,3,2,1,0,7,8,5,0,0,
        1,8,1,1,0,0,0,9,10,6,1,-1,0,10,12,5,3,0,0,11,13,3,4,2,0,12,11,1,
        0,0,0,12,13,1,0,0,0,13,21,1,0,0,0,14,15,5,1,0,0,15,16,3,2,1,0,16,
        18,5,2,0,0,17,19,3,4,2,0,18,17,1,0,0,0,18,19,1,0,0,0,19,21,1,0,0,
        0,20,9,1,0,0,0,20,14,1,0,0,0,21,26,1,0,0,0,22,23,10,1,0,0,23,25,
        3,2,1,2,24,22,1,0,0,0,25,28,1,0,0,0,26,24,1,0,0,0,26,27,1,0,0,0,
        27,3,1,0,0,0,28,26,1,0,0,0,29,35,5,4,0,0,30,31,5,1,0,0,31,32,3,4,
        2,0,32,33,5,2,0,0,33,35,1,0,0,0,34,29,1,0,0,0,34,30,1,0,0,0,35,5,
        1,0,0,0,5,12,18,20,26,34
    ]

class FormulaParser ( Parser ):

    grammarFileName = "Formula.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ "<INVALID>", "LBRACKET", "RBRACKET", "ELEMENT", "NUMBER", 
                      "WHITESPACE" ]

    RULE_formula = 0
    RULE_group = 1
    RULE_number = 2

    ruleNames =  [ "formula", "group", "number" ]

    EOF = Token.EOF
    LBRACKET=1
    RBRACKET=2
    ELEMENT=3
    NUMBER=4
    WHITESPACE=5

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.0")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class FormulaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def group(self):
            return self.getTypedRuleContext(FormulaParser.GroupContext,0)


        def EOF(self):
            return self.getToken(FormulaParser.EOF, 0)

        def getRuleIndex(self):
            return FormulaParser.RULE_formula

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFormula" ):
                return visitor.visitFormula(self)
            else:
                return visitor.visitChildren(self)




    def formula(self):

        localctx = FormulaParser.FormulaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_formula)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 6
            self.group(0)
            self.state = 7
            self.match(FormulaParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class GroupContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return FormulaParser.RULE_group

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class BrktGrpContext(GroupContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a FormulaParser.GroupContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def LBRACKET(self):
            return self.getToken(FormulaParser.LBRACKET, 0)
        def group(self):
            return self.getTypedRuleContext(FormulaParser.GroupContext,0)

        def RBRACKET(self):
            return self.getToken(FormulaParser.RBRACKET, 0)
        def number(self):
            return self.getTypedRuleContext(FormulaParser.NumberContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBrktGrp" ):
                return visitor.visitBrktGrp(self)
            else:
                return visitor.visitChildren(self)


    class LstGrpContext(GroupContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a FormulaParser.GroupContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def group(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(FormulaParser.GroupContext)
            else:
                return self.getTypedRuleContext(FormulaParser.GroupContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLstGrp" ):
                return visitor.visitLstGrp(self)
            else:
                return visitor.visitChildren(self)


    class EleNumGrpContext(GroupContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a FormulaParser.GroupContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ELEMENT(self):
            return self.getToken(FormulaParser.ELEMENT, 0)
        def number(self):
            return self.getTypedRuleContext(FormulaParser.NumberContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEleNumGrp" ):
                return visitor.visitEleNumGrp(self)
            else:
                return visitor.visitChildren(self)



    def group(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = FormulaParser.GroupContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 2
        self.enterRecursionRule(localctx, 2, self.RULE_group, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 20
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [3]:
                localctx = FormulaParser.EleNumGrpContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 10
                self.match(FormulaParser.ELEMENT)
                self.state = 12
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
                if la_ == 1:
                    self.state = 11
                    self.number()


                pass
            elif token in [1]:
                localctx = FormulaParser.BrktGrpContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 14
                self.match(FormulaParser.LBRACKET)
                self.state = 15
                self.group(0)
                self.state = 16
                self.match(FormulaParser.RBRACKET)
                self.state = 18
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
                if la_ == 1:
                    self.state = 17
                    self.number()


                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 26
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = FormulaParser.LstGrpContext(self, FormulaParser.GroupContext(self, _parentctx, _parentState))
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_group)
                    self.state = 22
                    if not self.precpred(self._ctx, 1):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 1)")
                    self.state = 23
                    self.group(2) 
                self.state = 28
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class NumberContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return FormulaParser.RULE_number

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class NumContext(NumberContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a FormulaParser.NumberContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NUMBER(self):
            return self.getToken(FormulaParser.NUMBER, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNum" ):
                return visitor.visitNum(self)
            else:
                return visitor.visitChildren(self)


    class BrktNumContext(NumberContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a FormulaParser.NumberContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def LBRACKET(self):
            return self.getToken(FormulaParser.LBRACKET, 0)
        def number(self):
            return self.getTypedRuleContext(FormulaParser.NumberContext,0)

        def RBRACKET(self):
            return self.getToken(FormulaParser.RBRACKET, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBrktNum" ):
                return visitor.visitBrktNum(self)
            else:
                return visitor.visitChildren(self)



    def number(self):

        localctx = FormulaParser.NumberContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_number)
        try:
            self.state = 34
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [4]:
                localctx = FormulaParser.NumContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 29
                self.match(FormulaParser.NUMBER)
                pass
            elif token in [1]:
                localctx = FormulaParser.BrktNumContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 30
                self.match(FormulaParser.LBRACKET)
                self.state = 31
                self.number()
                self.state = 32
                self.match(FormulaParser.RBRACKET)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[1] = self.group_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def group_sempred(self, localctx:GroupContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 1)
         




