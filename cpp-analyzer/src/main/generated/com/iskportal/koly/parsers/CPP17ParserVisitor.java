// Generated from CPP17Parser.g4 by ANTLR 4.13.2
package com.iskportal.koly.parsers;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CPP17Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CPP17ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(CPP17Parser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(CPP17Parser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#idExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(CPP17Parser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#unqualifiedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedId(CPP17Parser.UnqualifiedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#qualifiedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedId(CPP17Parser.QualifiedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedNameSpecifier(CPP17Parser.NestedNameSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(CPP17Parser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#lambdaIntroducer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaIntroducer(CPP17Parser.LambdaIntroducerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#lambdaCapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaCapture(CPP17Parser.LambdaCaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#captureDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptureDefault(CPP17Parser.CaptureDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#captureList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptureList(CPP17Parser.CaptureListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture(CPP17Parser.CaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#simpleCapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCapture(CPP17Parser.SimpleCaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#initcapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitcapture(CPP17Parser.InitcaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#lambdaDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaDeclarator(CPP17Parser.LambdaDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(CPP17Parser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdOfTheTypeId(CPP17Parser.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CPP17Parser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoDestructorName(CPP17Parser.PseudoDestructorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CPP17Parser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(CPP17Parser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(CPP17Parser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#newPlacement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewPlacement(CPP17Parser.NewPlacementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#newTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewTypeId(CPP17Parser.NewTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#newDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDeclarator(CPP17Parser.NewDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerNewDeclarator(CPP17Parser.NoPointerNewDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#newInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewInitializer(CPP17Parser.NewInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#deleteExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteExpression(CPP17Parser.DeleteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#noExceptExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoExceptExpression(CPP17Parser.NoExceptExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(CPP17Parser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#pointerMemberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerMemberExpression(CPP17Parser.PointerMemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(CPP17Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(CPP17Parser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(CPP17Parser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#shiftOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOperator(CPP17Parser.ShiftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(CPP17Parser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(CPP17Parser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(CPP17Parser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(CPP17Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(CPP17Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(CPP17Parser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(CPP17Parser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(CPP17Parser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(CPP17Parser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(CPP17Parser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CPP17Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(CPP17Parser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CPP17Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(CPP17Parser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(CPP17Parser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(CPP17Parser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#statementSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSeq(CPP17Parser.StatementSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(CPP17Parser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CPP17Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(CPP17Parser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#forInitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitStatement(CPP17Parser.ForInitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRangeDeclaration(CPP17Parser.ForRangeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#forRangeInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRangeInitializer(CPP17Parser.ForRangeInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(CPP17Parser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(CPP17Parser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#declarationseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationseq(CPP17Parser.DeclarationseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CPP17Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#blockDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockDeclaration(CPP17Parser.BlockDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#aliasDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasDeclaration(CPP17Parser.AliasDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#simpleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDeclaration(CPP17Parser.SimpleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(CPP17Parser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#emptyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyDeclaration(CPP17Parser.EmptyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#attributeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDeclaration(CPP17Parser.AttributeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#declSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecifier(CPP17Parser.DeclSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecifierSeq(CPP17Parser.DeclSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(CPP17Parser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(CPP17Parser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(CPP17Parser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(CPP17Parser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingTypeSpecifier(CPP17Parser.TrailingTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifierSeq(CPP17Parser.TypeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingTypeSpecifierSeq(CPP17Parser.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#simpleTypeLengthModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeLengthModifier(CPP17Parser.SimpleTypeLengthModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#simpleTypeSignednessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeSignednessModifier(CPP17Parser.SimpleTypeSignednessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeSpecifier(CPP17Parser.SimpleTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#theTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheTypeName(CPP17Parser.TheTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#decltypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecltypeSpecifier(CPP17Parser.DecltypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElaboratedTypeSpecifier(CPP17Parser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#enumName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumName(CPP17Parser.EnumNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(CPP17Parser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#enumHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumHead(CPP17Parser.EnumHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpaqueEnumDeclaration(CPP17Parser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#enumkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumkey(CPP17Parser.EnumkeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#enumbase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumbase(CPP17Parser.EnumbaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(CPP17Parser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorDefinition(CPP17Parser.EnumeratorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(CPP17Parser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#namespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceName(CPP17Parser.NamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#originalNamespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginalNamespaceName(CPP17Parser.OriginalNamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#namespaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDefinition(CPP17Parser.NamespaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#namespaceAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceAlias(CPP17Parser.NamespaceAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceAliasDefinition(CPP17Parser.NamespaceAliasDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiednamespacespecifier(CPP17Parser.QualifiednamespacespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#usingDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDeclaration(CPP17Parser.UsingDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#usingDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDirective(CPP17Parser.UsingDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#asmDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmDefinition(CPP17Parser.AsmDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#linkageSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkageSpecification(CPP17Parser.LinkageSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifierSeq(CPP17Parser.AttributeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#attributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifier(CPP17Parser.AttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#alignmentspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentspecifier(CPP17Parser.AlignmentspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#attributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeList(CPP17Parser.AttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(CPP17Parser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#attributeNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeNamespace(CPP17Parser.AttributeNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeArgumentClause(CPP17Parser.AttributeArgumentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#balancedTokenSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedTokenSeq(CPP17Parser.BalancedTokenSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#balancedtoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedtoken(CPP17Parser.BalancedtokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(CPP17Parser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(CPP17Parser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(CPP17Parser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#pointerDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerDeclarator(CPP17Parser.PointerDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#noPointerDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerDeclarator(CPP17Parser.NoPointerDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersAndQualifiers(CPP17Parser.ParametersAndQualifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#trailingReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingReturnType(CPP17Parser.TrailingReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#pointerOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerOperator(CPP17Parser.PointerOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#cvqualifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvqualifierseq(CPP17Parser.CvqualifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#cvQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvQualifier(CPP17Parser.CvQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#refqualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefqualifier(CPP17Parser.RefqualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#declaratorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorid(CPP17Parser.DeclaratoridContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#theTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheTypeId(CPP17Parser.TheTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(CPP17Parser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerAbstractDeclarator(CPP17Parser.PointerAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerAbstractDeclarator(CPP17Parser.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractPackDeclarator(CPP17Parser.AbstractPackDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerAbstractPackDeclarator(CPP17Parser.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationClause(CPP17Parser.ParameterDeclarationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationList(CPP17Parser.ParameterDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(CPP17Parser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(CPP17Parser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(CPP17Parser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(CPP17Parser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceOrEqualInitializer(CPP17Parser.BraceOrEqualInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#initializerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerClause(CPP17Parser.InitializerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(CPP17Parser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#bracedInitList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedInitList(CPP17Parser.BracedInitListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(CPP17Parser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#classSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSpecifier(CPP17Parser.ClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#classHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHead(CPP17Parser.ClassHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#classHeadName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeadName(CPP17Parser.ClassHeadNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#classVirtSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVirtSpecifier(CPP17Parser.ClassVirtSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#classKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassKey(CPP17Parser.ClassKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#memberSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberSpecification(CPP17Parser.MemberSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#memberdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberdeclaration(CPP17Parser.MemberdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#memberDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaratorList(CPP17Parser.MemberDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#memberDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarator(CPP17Parser.MemberDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#virtualSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtualSpecifierSeq(CPP17Parser.VirtualSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#virtualSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtualSpecifier(CPP17Parser.VirtualSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#pureSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureSpecifier(CPP17Parser.PureSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#baseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseClause(CPP17Parser.BaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#baseSpecifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseSpecifierList(CPP17Parser.BaseSpecifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#baseSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseSpecifier(CPP17Parser.BaseSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#classOrDeclType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrDeclType(CPP17Parser.ClassOrDeclTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseTypeSpecifier(CPP17Parser.BaseTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#accessSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessSpecifier(CPP17Parser.AccessSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#conversionFunctionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionFunctionId(CPP17Parser.ConversionFunctionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#conversionTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionTypeId(CPP17Parser.ConversionTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#conversionDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionDeclarator(CPP17Parser.ConversionDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#constructorInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorInitializer(CPP17Parser.ConstructorInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#memInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemInitializerList(CPP17Parser.MemInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#memInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemInitializer(CPP17Parser.MemInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#meminitializerid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeminitializerid(CPP17Parser.MeminitializeridContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#operatorFunctionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorFunctionId(CPP17Parser.OperatorFunctionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#literalOperatorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralOperatorId(CPP17Parser.LiteralOperatorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#templateDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDeclaration(CPP17Parser.TemplateDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#templateparameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateparameterList(CPP17Parser.TemplateparameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#templateParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateParameter(CPP17Parser.TemplateParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(CPP17Parser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#simpleTemplateId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTemplateId(CPP17Parser.SimpleTemplateIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#templateId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateId(CPP17Parser.TemplateIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#templateName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateName(CPP17Parser.TemplateNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#templateArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateArgumentList(CPP17Parser.TemplateArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#templateArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateArgument(CPP17Parser.TemplateArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#typeNameSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNameSpecifier(CPP17Parser.TypeNameSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#explicitInstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitInstantiation(CPP17Parser.ExplicitInstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#explicitSpecialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitSpecialization(CPP17Parser.ExplicitSpecializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#tryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryBlock(CPP17Parser.TryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#functionTryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTryBlock(CPP17Parser.FunctionTryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#handlerSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerSeq(CPP17Parser.HandlerSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandler(CPP17Parser.HandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionDeclaration(CPP17Parser.ExceptionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#throwExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowExpression(CPP17Parser.ThrowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#exceptionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionSpecification(CPP17Parser.ExceptionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#dynamicExceptionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicExceptionSpecification(CPP17Parser.DynamicExceptionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#typeIdList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdList(CPP17Parser.TypeIdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#noeExceptSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoeExceptSpecification(CPP17Parser.NoeExceptSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#theOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheOperator(CPP17Parser.TheOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPP17Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CPP17Parser.LiteralContext ctx);
}