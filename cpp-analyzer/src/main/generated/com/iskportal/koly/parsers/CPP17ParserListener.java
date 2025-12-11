// Generated from CPP17Parser.g4 by ANTLR 4.13.2
package com.iskportal.koly.parsers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CPP17Parser}.
 */
public interface CPP17ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(CPP17Parser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(CPP17Parser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CPP17Parser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CPP17Parser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#idExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(CPP17Parser.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#idExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(CPP17Parser.IdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#unqualifiedId}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedId(CPP17Parser.UnqualifiedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#unqualifiedId}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedId(CPP17Parser.UnqualifiedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#qualifiedId}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedId(CPP17Parser.QualifiedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#qualifiedId}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedId(CPP17Parser.QualifiedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterNestedNameSpecifier(CPP17Parser.NestedNameSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitNestedNameSpecifier(CPP17Parser.NestedNameSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(CPP17Parser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(CPP17Parser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#lambdaIntroducer}.
	 * @param ctx the parse tree
	 */
	void enterLambdaIntroducer(CPP17Parser.LambdaIntroducerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#lambdaIntroducer}.
	 * @param ctx the parse tree
	 */
	void exitLambdaIntroducer(CPP17Parser.LambdaIntroducerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#lambdaCapture}.
	 * @param ctx the parse tree
	 */
	void enterLambdaCapture(CPP17Parser.LambdaCaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#lambdaCapture}.
	 * @param ctx the parse tree
	 */
	void exitLambdaCapture(CPP17Parser.LambdaCaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#captureDefault}.
	 * @param ctx the parse tree
	 */
	void enterCaptureDefault(CPP17Parser.CaptureDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#captureDefault}.
	 * @param ctx the parse tree
	 */
	void exitCaptureDefault(CPP17Parser.CaptureDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#captureList}.
	 * @param ctx the parse tree
	 */
	void enterCaptureList(CPP17Parser.CaptureListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#captureList}.
	 * @param ctx the parse tree
	 */
	void exitCaptureList(CPP17Parser.CaptureListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(CPP17Parser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(CPP17Parser.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#simpleCapture}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCapture(CPP17Parser.SimpleCaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#simpleCapture}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCapture(CPP17Parser.SimpleCaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#initcapture}.
	 * @param ctx the parse tree
	 */
	void enterInitcapture(CPP17Parser.InitcaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#initcapture}.
	 * @param ctx the parse tree
	 */
	void exitInitcapture(CPP17Parser.InitcaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#lambdaDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterLambdaDeclarator(CPP17Parser.LambdaDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#lambdaDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitLambdaDeclarator(CPP17Parser.LambdaDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(CPP17Parser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(CPP17Parser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdOfTheTypeId(CPP17Parser.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdOfTheTypeId(CPP17Parser.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CPP17Parser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CPP17Parser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 */
	void enterPseudoDestructorName(CPP17Parser.PseudoDestructorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 */
	void exitPseudoDestructorName(CPP17Parser.PseudoDestructorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CPP17Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CPP17Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(CPP17Parser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(CPP17Parser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(CPP17Parser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(CPP17Parser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#newPlacement}.
	 * @param ctx the parse tree
	 */
	void enterNewPlacement(CPP17Parser.NewPlacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#newPlacement}.
	 * @param ctx the parse tree
	 */
	void exitNewPlacement(CPP17Parser.NewPlacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#newTypeId}.
	 * @param ctx the parse tree
	 */
	void enterNewTypeId(CPP17Parser.NewTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#newTypeId}.
	 * @param ctx the parse tree
	 */
	void exitNewTypeId(CPP17Parser.NewTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewDeclarator(CPP17Parser.NewDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewDeclarator(CPP17Parser.NewDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerNewDeclarator(CPP17Parser.NoPointerNewDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerNewDeclarator(CPP17Parser.NoPointerNewDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#newInitializer}.
	 * @param ctx the parse tree
	 */
	void enterNewInitializer(CPP17Parser.NewInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#newInitializer}.
	 * @param ctx the parse tree
	 */
	void exitNewInitializer(CPP17Parser.NewInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#deleteExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(CPP17Parser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#deleteExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(CPP17Parser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#noExceptExpression}.
	 * @param ctx the parse tree
	 */
	void enterNoExceptExpression(CPP17Parser.NoExceptExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#noExceptExpression}.
	 * @param ctx the parse tree
	 */
	void exitNoExceptExpression(CPP17Parser.NoExceptExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(CPP17Parser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(CPP17Parser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#pointerMemberExpression}.
	 * @param ctx the parse tree
	 */
	void enterPointerMemberExpression(CPP17Parser.PointerMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#pointerMemberExpression}.
	 * @param ctx the parse tree
	 */
	void exitPointerMemberExpression(CPP17Parser.PointerMemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CPP17Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CPP17Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CPP17Parser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CPP17Parser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(CPP17Parser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(CPP17Parser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void enterShiftOperator(CPP17Parser.ShiftOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void exitShiftOperator(CPP17Parser.ShiftOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CPP17Parser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CPP17Parser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CPP17Parser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CPP17Parser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CPP17Parser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CPP17Parser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(CPP17Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(CPP17Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(CPP17Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(CPP17Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(CPP17Parser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(CPP17Parser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(CPP17Parser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(CPP17Parser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CPP17Parser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CPP17Parser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CPP17Parser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CPP17Parser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(CPP17Parser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(CPP17Parser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CPP17Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CPP17Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(CPP17Parser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(CPP17Parser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CPP17Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CPP17Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(CPP17Parser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(CPP17Parser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CPP17Parser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CPP17Parser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CPP17Parser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CPP17Parser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void enterStatementSeq(CPP17Parser.StatementSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void exitStatementSeq(CPP17Parser.StatementSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(CPP17Parser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(CPP17Parser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CPP17Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CPP17Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(CPP17Parser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(CPP17Parser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInitStatement(CPP17Parser.ForInitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInitStatement(CPP17Parser.ForInitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForRangeDeclaration(CPP17Parser.ForRangeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForRangeDeclaration(CPP17Parser.ForRangeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#forRangeInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForRangeInitializer(CPP17Parser.ForRangeInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#forRangeInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForRangeInitializer(CPP17Parser.ForRangeInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(CPP17Parser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(CPP17Parser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(CPP17Parser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(CPP17Parser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationseq(CPP17Parser.DeclarationseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationseq(CPP17Parser.DeclarationseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CPP17Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CPP17Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBlockDeclaration(CPP17Parser.BlockDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBlockDeclaration(CPP17Parser.BlockDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#aliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAliasDeclaration(CPP17Parser.AliasDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#aliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAliasDeclaration(CPP17Parser.AliasDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDeclaration(CPP17Parser.SimpleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDeclaration(CPP17Parser.SimpleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(CPP17Parser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(CPP17Parser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#emptyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmptyDeclaration(CPP17Parser.EmptyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#emptyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmptyDeclaration(CPP17Parser.EmptyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDeclaration(CPP17Parser.AttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDeclaration(CPP17Parser.AttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#declSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclSpecifier(CPP17Parser.DeclSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#declSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclSpecifier(CPP17Parser.DeclSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterDeclSpecifierSeq(CPP17Parser.DeclSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitDeclSpecifierSeq(CPP17Parser.DeclSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(CPP17Parser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(CPP17Parser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(CPP17Parser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(CPP17Parser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(CPP17Parser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(CPP17Parser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(CPP17Parser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(CPP17Parser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTrailingTypeSpecifier(CPP17Parser.TrailingTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTrailingTypeSpecifier(CPP17Parser.TrailingTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifierSeq(CPP17Parser.TypeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifierSeq(CPP17Parser.TypeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterTrailingTypeSpecifierSeq(CPP17Parser.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitTrailingTypeSpecifierSeq(CPP17Parser.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#simpleTypeLengthModifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeLengthModifier(CPP17Parser.SimpleTypeLengthModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#simpleTypeLengthModifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeLengthModifier(CPP17Parser.SimpleTypeLengthModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#simpleTypeSignednessModifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeSignednessModifier(CPP17Parser.SimpleTypeSignednessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#simpleTypeSignednessModifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeSignednessModifier(CPP17Parser.SimpleTypeSignednessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeSpecifier(CPP17Parser.SimpleTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeSpecifier(CPP17Parser.SimpleTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#theTypeName}.
	 * @param ctx the parse tree
	 */
	void enterTheTypeName(CPP17Parser.TheTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#theTypeName}.
	 * @param ctx the parse tree
	 */
	void exitTheTypeName(CPP17Parser.TheTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#decltypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDecltypeSpecifier(CPP17Parser.DecltypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#decltypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDecltypeSpecifier(CPP17Parser.DecltypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterElaboratedTypeSpecifier(CPP17Parser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitElaboratedTypeSpecifier(CPP17Parser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(CPP17Parser.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(CPP17Parser.EnumNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(CPP17Parser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(CPP17Parser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#enumHead}.
	 * @param ctx the parse tree
	 */
	void enterEnumHead(CPP17Parser.EnumHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#enumHead}.
	 * @param ctx the parse tree
	 */
	void exitEnumHead(CPP17Parser.EnumHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOpaqueEnumDeclaration(CPP17Parser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOpaqueEnumDeclaration(CPP17Parser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#enumkey}.
	 * @param ctx the parse tree
	 */
	void enterEnumkey(CPP17Parser.EnumkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#enumkey}.
	 * @param ctx the parse tree
	 */
	void exitEnumkey(CPP17Parser.EnumkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#enumbase}.
	 * @param ctx the parse tree
	 */
	void enterEnumbase(CPP17Parser.EnumbaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#enumbase}.
	 * @param ctx the parse tree
	 */
	void exitEnumbase(CPP17Parser.EnumbaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(CPP17Parser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(CPP17Parser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorDefinition(CPP17Parser.EnumeratorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorDefinition(CPP17Parser.EnumeratorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(CPP17Parser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(CPP17Parser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#namespaceName}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceName(CPP17Parser.NamespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#namespaceName}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceName(CPP17Parser.NamespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#originalNamespaceName}.
	 * @param ctx the parse tree
	 */
	void enterOriginalNamespaceName(CPP17Parser.OriginalNamespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#originalNamespaceName}.
	 * @param ctx the parse tree
	 */
	void exitOriginalNamespaceName(CPP17Parser.OriginalNamespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDefinition(CPP17Parser.NamespaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDefinition(CPP17Parser.NamespaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#namespaceAlias}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceAlias(CPP17Parser.NamespaceAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#namespaceAlias}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceAlias(CPP17Parser.NamespaceAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceAliasDefinition(CPP17Parser.NamespaceAliasDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceAliasDefinition(CPP17Parser.NamespaceAliasDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiednamespacespecifier(CPP17Parser.QualifiednamespacespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiednamespacespecifier(CPP17Parser.QualifiednamespacespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingDeclaration(CPP17Parser.UsingDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingDeclaration(CPP17Parser.UsingDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#usingDirective}.
	 * @param ctx the parse tree
	 */
	void enterUsingDirective(CPP17Parser.UsingDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#usingDirective}.
	 * @param ctx the parse tree
	 */
	void exitUsingDirective(CPP17Parser.UsingDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#asmDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAsmDefinition(CPP17Parser.AsmDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#asmDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAsmDefinition(CPP17Parser.AsmDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#linkageSpecification}.
	 * @param ctx the parse tree
	 */
	void enterLinkageSpecification(CPP17Parser.LinkageSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#linkageSpecification}.
	 * @param ctx the parse tree
	 */
	void exitLinkageSpecification(CPP17Parser.LinkageSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecifierSeq(CPP17Parser.AttributeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecifierSeq(CPP17Parser.AttributeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecifier(CPP17Parser.AttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecifier(CPP17Parser.AttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentspecifier(CPP17Parser.AlignmentspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentspecifier(CPP17Parser.AlignmentspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#attributeList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(CPP17Parser.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#attributeList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(CPP17Parser.AttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(CPP17Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(CPP17Parser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#attributeNamespace}.
	 * @param ctx the parse tree
	 */
	void enterAttributeNamespace(CPP17Parser.AttributeNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#attributeNamespace}.
	 * @param ctx the parse tree
	 */
	void exitAttributeNamespace(CPP17Parser.AttributeNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeArgumentClause(CPP17Parser.AttributeArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeArgumentClause(CPP17Parser.AttributeArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#balancedTokenSeq}.
	 * @param ctx the parse tree
	 */
	void enterBalancedTokenSeq(CPP17Parser.BalancedTokenSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#balancedTokenSeq}.
	 * @param ctx the parse tree
	 */
	void exitBalancedTokenSeq(CPP17Parser.BalancedTokenSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtoken(CPP17Parser.BalancedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtoken(CPP17Parser.BalancedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(CPP17Parser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(CPP17Parser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(CPP17Parser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(CPP17Parser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(CPP17Parser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(CPP17Parser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#pointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPointerDeclarator(CPP17Parser.PointerDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#pointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPointerDeclarator(CPP17Parser.PointerDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#noPointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerDeclarator(CPP17Parser.NoPointerDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#noPointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerDeclarator(CPP17Parser.NoPointerDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParametersAndQualifiers(CPP17Parser.ParametersAndQualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParametersAndQualifiers(CPP17Parser.ParametersAndQualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#trailingReturnType}.
	 * @param ctx the parse tree
	 */
	void enterTrailingReturnType(CPP17Parser.TrailingReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#trailingReturnType}.
	 * @param ctx the parse tree
	 */
	void exitTrailingReturnType(CPP17Parser.TrailingReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#pointerOperator}.
	 * @param ctx the parse tree
	 */
	void enterPointerOperator(CPP17Parser.PointerOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#pointerOperator}.
	 * @param ctx the parse tree
	 */
	void exitPointerOperator(CPP17Parser.PointerOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifierseq(CPP17Parser.CvqualifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifierseq(CPP17Parser.CvqualifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#cvQualifier}.
	 * @param ctx the parse tree
	 */
	void enterCvQualifier(CPP17Parser.CvQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#cvQualifier}.
	 * @param ctx the parse tree
	 */
	void exitCvQualifier(CPP17Parser.CvQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void enterRefqualifier(CPP17Parser.RefqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void exitRefqualifier(CPP17Parser.RefqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorid(CPP17Parser.DeclaratoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorid(CPP17Parser.DeclaratoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#theTypeId}.
	 * @param ctx the parse tree
	 */
	void enterTheTypeId(CPP17Parser.TheTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#theTypeId}.
	 * @param ctx the parse tree
	 */
	void exitTheTypeId(CPP17Parser.TheTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(CPP17Parser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(CPP17Parser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPointerAbstractDeclarator(CPP17Parser.PointerAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPointerAbstractDeclarator(CPP17Parser.PointerAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerAbstractDeclarator(CPP17Parser.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerAbstractDeclarator(CPP17Parser.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractPackDeclarator(CPP17Parser.AbstractPackDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractPackDeclarator(CPP17Parser.AbstractPackDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerAbstractPackDeclarator(CPP17Parser.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerAbstractPackDeclarator(CPP17Parser.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationClause(CPP17Parser.ParameterDeclarationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationClause(CPP17Parser.ParameterDeclarationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationList(CPP17Parser.ParameterDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationList(CPP17Parser.ParameterDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(CPP17Parser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(CPP17Parser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(CPP17Parser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(CPP17Parser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(CPP17Parser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(CPP17Parser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(CPP17Parser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(CPP17Parser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 */
	void enterBraceOrEqualInitializer(CPP17Parser.BraceOrEqualInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 */
	void exitBraceOrEqualInitializer(CPP17Parser.BraceOrEqualInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#initializerClause}.
	 * @param ctx the parse tree
	 */
	void enterInitializerClause(CPP17Parser.InitializerClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#initializerClause}.
	 * @param ctx the parse tree
	 */
	void exitInitializerClause(CPP17Parser.InitializerClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(CPP17Parser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(CPP17Parser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#bracedInitList}.
	 * @param ctx the parse tree
	 */
	void enterBracedInitList(CPP17Parser.BracedInitListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#bracedInitList}.
	 * @param ctx the parse tree
	 */
	void exitBracedInitList(CPP17Parser.BracedInitListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(CPP17Parser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(CPP17Parser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#classSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassSpecifier(CPP17Parser.ClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#classSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassSpecifier(CPP17Parser.ClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#classHead}.
	 * @param ctx the parse tree
	 */
	void enterClassHead(CPP17Parser.ClassHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#classHead}.
	 * @param ctx the parse tree
	 */
	void exitClassHead(CPP17Parser.ClassHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#classHeadName}.
	 * @param ctx the parse tree
	 */
	void enterClassHeadName(CPP17Parser.ClassHeadNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#classHeadName}.
	 * @param ctx the parse tree
	 */
	void exitClassHeadName(CPP17Parser.ClassHeadNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#classVirtSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassVirtSpecifier(CPP17Parser.ClassVirtSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#classVirtSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassVirtSpecifier(CPP17Parser.ClassVirtSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#classKey}.
	 * @param ctx the parse tree
	 */
	void enterClassKey(CPP17Parser.ClassKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#classKey}.
	 * @param ctx the parse tree
	 */
	void exitClassKey(CPP17Parser.ClassKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#memberSpecification}.
	 * @param ctx the parse tree
	 */
	void enterMemberSpecification(CPP17Parser.MemberSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#memberSpecification}.
	 * @param ctx the parse tree
	 */
	void exitMemberSpecification(CPP17Parser.MemberSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaration(CPP17Parser.MemberdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaration(CPP17Parser.MemberdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#memberDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaratorList(CPP17Parser.MemberDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#memberDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaratorList(CPP17Parser.MemberDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#memberDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclarator(CPP17Parser.MemberDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#memberDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclarator(CPP17Parser.MemberDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#virtualSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterVirtualSpecifierSeq(CPP17Parser.VirtualSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#virtualSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitVirtualSpecifierSeq(CPP17Parser.VirtualSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#virtualSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterVirtualSpecifier(CPP17Parser.VirtualSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#virtualSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitVirtualSpecifier(CPP17Parser.VirtualSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#pureSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterPureSpecifier(CPP17Parser.PureSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#pureSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitPureSpecifier(CPP17Parser.PureSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#baseClause}.
	 * @param ctx the parse tree
	 */
	void enterBaseClause(CPP17Parser.BaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#baseClause}.
	 * @param ctx the parse tree
	 */
	void exitBaseClause(CPP17Parser.BaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#baseSpecifierList}.
	 * @param ctx the parse tree
	 */
	void enterBaseSpecifierList(CPP17Parser.BaseSpecifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#baseSpecifierList}.
	 * @param ctx the parse tree
	 */
	void exitBaseSpecifierList(CPP17Parser.BaseSpecifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#baseSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseSpecifier(CPP17Parser.BaseSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#baseSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseSpecifier(CPP17Parser.BaseSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#classOrDeclType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrDeclType(CPP17Parser.ClassOrDeclTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#classOrDeclType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrDeclType(CPP17Parser.ClassOrDeclTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseTypeSpecifier(CPP17Parser.BaseTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseTypeSpecifier(CPP17Parser.BaseTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#accessSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessSpecifier(CPP17Parser.AccessSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#accessSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessSpecifier(CPP17Parser.AccessSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#conversionFunctionId}.
	 * @param ctx the parse tree
	 */
	void enterConversionFunctionId(CPP17Parser.ConversionFunctionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#conversionFunctionId}.
	 * @param ctx the parse tree
	 */
	void exitConversionFunctionId(CPP17Parser.ConversionFunctionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#conversionTypeId}.
	 * @param ctx the parse tree
	 */
	void enterConversionTypeId(CPP17Parser.ConversionTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#conversionTypeId}.
	 * @param ctx the parse tree
	 */
	void exitConversionTypeId(CPP17Parser.ConversionTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#conversionDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConversionDeclarator(CPP17Parser.ConversionDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#conversionDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConversionDeclarator(CPP17Parser.ConversionDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#constructorInitializer}.
	 * @param ctx the parse tree
	 */
	void enterConstructorInitializer(CPP17Parser.ConstructorInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#constructorInitializer}.
	 * @param ctx the parse tree
	 */
	void exitConstructorInitializer(CPP17Parser.ConstructorInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#memInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterMemInitializerList(CPP17Parser.MemInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#memInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitMemInitializerList(CPP17Parser.MemInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#memInitializer}.
	 * @param ctx the parse tree
	 */
	void enterMemInitializer(CPP17Parser.MemInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#memInitializer}.
	 * @param ctx the parse tree
	 */
	void exitMemInitializer(CPP17Parser.MemInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerid(CPP17Parser.MeminitializeridContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerid(CPP17Parser.MeminitializeridContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#operatorFunctionId}.
	 * @param ctx the parse tree
	 */
	void enterOperatorFunctionId(CPP17Parser.OperatorFunctionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#operatorFunctionId}.
	 * @param ctx the parse tree
	 */
	void exitOperatorFunctionId(CPP17Parser.OperatorFunctionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#literalOperatorId}.
	 * @param ctx the parse tree
	 */
	void enterLiteralOperatorId(CPP17Parser.LiteralOperatorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#literalOperatorId}.
	 * @param ctx the parse tree
	 */
	void exitLiteralOperatorId(CPP17Parser.LiteralOperatorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDeclaration(CPP17Parser.TemplateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDeclaration(CPP17Parser.TemplateDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#templateparameterList}.
	 * @param ctx the parse tree
	 */
	void enterTemplateparameterList(CPP17Parser.TemplateparameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#templateparameterList}.
	 * @param ctx the parse tree
	 */
	void exitTemplateparameterList(CPP17Parser.TemplateparameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#templateParameter}.
	 * @param ctx the parse tree
	 */
	void enterTemplateParameter(CPP17Parser.TemplateParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#templateParameter}.
	 * @param ctx the parse tree
	 */
	void exitTemplateParameter(CPP17Parser.TemplateParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(CPP17Parser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(CPP17Parser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#simpleTemplateId}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTemplateId(CPP17Parser.SimpleTemplateIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#simpleTemplateId}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTemplateId(CPP17Parser.SimpleTemplateIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#templateId}.
	 * @param ctx the parse tree
	 */
	void enterTemplateId(CPP17Parser.TemplateIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#templateId}.
	 * @param ctx the parse tree
	 */
	void exitTemplateId(CPP17Parser.TemplateIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#templateName}.
	 * @param ctx the parse tree
	 */
	void enterTemplateName(CPP17Parser.TemplateNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#templateName}.
	 * @param ctx the parse tree
	 */
	void exitTemplateName(CPP17Parser.TemplateNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#templateArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTemplateArgumentList(CPP17Parser.TemplateArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#templateArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTemplateArgumentList(CPP17Parser.TemplateArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#templateArgument}.
	 * @param ctx the parse tree
	 */
	void enterTemplateArgument(CPP17Parser.TemplateArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#templateArgument}.
	 * @param ctx the parse tree
	 */
	void exitTemplateArgument(CPP17Parser.TemplateArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#typeNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeNameSpecifier(CPP17Parser.TypeNameSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#typeNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeNameSpecifier(CPP17Parser.TypeNameSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#explicitInstantiation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitInstantiation(CPP17Parser.ExplicitInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#explicitInstantiation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitInstantiation(CPP17Parser.ExplicitInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#explicitSpecialization}.
	 * @param ctx the parse tree
	 */
	void enterExplicitSpecialization(CPP17Parser.ExplicitSpecializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#explicitSpecialization}.
	 * @param ctx the parse tree
	 */
	void exitExplicitSpecialization(CPP17Parser.ExplicitSpecializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void enterTryBlock(CPP17Parser.TryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void exitTryBlock(CPP17Parser.TryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#functionTryBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTryBlock(CPP17Parser.FunctionTryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#functionTryBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTryBlock(CPP17Parser.FunctionTryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#handlerSeq}.
	 * @param ctx the parse tree
	 */
	void enterHandlerSeq(CPP17Parser.HandlerSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#handlerSeq}.
	 * @param ctx the parse tree
	 */
	void exitHandlerSeq(CPP17Parser.HandlerSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#handler}.
	 * @param ctx the parse tree
	 */
	void enterHandler(CPP17Parser.HandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#handler}.
	 * @param ctx the parse tree
	 */
	void exitHandler(CPP17Parser.HandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExceptionDeclaration(CPP17Parser.ExceptionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExceptionDeclaration(CPP17Parser.ExceptionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#throwExpression}.
	 * @param ctx the parse tree
	 */
	void enterThrowExpression(CPP17Parser.ThrowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#throwExpression}.
	 * @param ctx the parse tree
	 */
	void exitThrowExpression(CPP17Parser.ThrowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#exceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterExceptionSpecification(CPP17Parser.ExceptionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#exceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitExceptionSpecification(CPP17Parser.ExceptionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#dynamicExceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDynamicExceptionSpecification(CPP17Parser.DynamicExceptionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#dynamicExceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDynamicExceptionSpecification(CPP17Parser.DynamicExceptionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#typeIdList}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdList(CPP17Parser.TypeIdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#typeIdList}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdList(CPP17Parser.TypeIdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#noeExceptSpecification}.
	 * @param ctx the parse tree
	 */
	void enterNoeExceptSpecification(CPP17Parser.NoeExceptSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#noeExceptSpecification}.
	 * @param ctx the parse tree
	 */
	void exitNoeExceptSpecification(CPP17Parser.NoeExceptSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#theOperator}.
	 * @param ctx the parse tree
	 */
	void enterTheOperator(CPP17Parser.TheOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#theOperator}.
	 * @param ctx the parse tree
	 */
	void exitTheOperator(CPP17Parser.TheOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPP17Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CPP17Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPP17Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CPP17Parser.LiteralContext ctx);
}