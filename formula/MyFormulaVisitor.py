from antlr4 import *
from .FormulaParser import FormulaParser
from .FormulaVisitor import FormulaVisitor


class JsonFormulaVisitor(FormulaVisitor):

    # Visit a parse tree produced by FormulaParser#formula.
    def visitFormula(self, ctx:FormulaParser.FormulaContext):
        return self.visit(ctx.group())

    # Visit a parse tree produced by FormulaParser#brktGrp.
    def visitBrktGrp(self, ctx:FormulaParser.BrktGrpContext):
        group = self.visit(ctx.group())
        number = self.visit(ctx.number()) if ctx.number() is not None else 1.
        return (group, number)

    # Visit a parse tree produced by FormulaParser#lstGrp.
    def visitLstGrp(self, ctx:FormulaParser.LstGrpContext):
        return [self.visit(group) for group in ctx.group()]

    # Visit a parse tree produced by FormulaParser#EleNumGrp.
    def visitEleNumGrp(self, ctx:FormulaParser.EleNumGrpContext):
        ELEMENT = ctx.ELEMENT().getText()
        number = self.visit(ctx.number()) if ctx.number() is not None else 1.
        return (ELEMENT, number)

    # Visit a parse tree produced by FormulaParser#Num.
    def visitNum(self, ctx:FormulaParser.NumContext):
        return float(ctx.NUMBER().getText())

    # Visit a parse tree produced by FormulaParser#brktNum.
    def visitBrktNum(self, ctx:FormulaParser.BrktNumContext):
        return self.visit(ctx.number())
    

class FlattenedElementDictFormulaVisitor(FormulaVisitor):

    # Visit a parse tree produced by FormulaParser#formula.
    def visitFormula(self, ctx:FormulaParser.FormulaContext):
        return self.visit(ctx.group())

    # Visit a parse tree produced by FormulaParser#brktGrp.
    def visitBrktGrp(self, ctx:FormulaParser.BrktGrpContext):
        d = self.visit(ctx.group())
        number = self.visit(ctx.number()) if ctx.number() is not None else 1.
        d = {k: v * number for k, v in d.items()}
        return d

    # Visit a parse tree produced by FormulaParser#lstGrp.
    def visitLstGrp(self, ctx:FormulaParser.LstGrpContext):
        d = {}
        for group in ctx.group():
            sub_d = self.visit(group)
            for k, v in sub_d.items():
                d[k] = d.get(k, 0) + v
        return d

    # Visit a parse tree produced by FormulaParser#EleNumGrp.
    def visitEleNumGrp(self, ctx:FormulaParser.EleNumGrpContext):
        ELEMENT = ctx.ELEMENT().getText()
        number = self.visit(ctx.number()) if ctx.number() is not None else 1.
        return {ELEMENT: number}

    # Visit a parse tree produced by FormulaParser#Num.
    def visitNum(self, ctx:FormulaParser.NumContext):
        return float(ctx.NUMBER().getText())


    # Visit a parse tree produced by FormulaParser#brktNum.
    def visitBrktNum(self, ctx:FormulaParser.BrktNumContext):
        return self.visit(ctx.number())