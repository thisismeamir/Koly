// Generated from CPP17Parser.g4 by ANTLR 4.13.2
package com.iskportal.koly.parsers;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CPP17Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerLiteral=1, CharacterLiteral=2, FloatingLiteral=3, StringLiteral=4, 
		BooleanLiteral=5, PointerLiteral=6, UserDefinedLiteral=7, MultiLineMacro=8, 
		AsmArea=9, Directive=10, Alignas=11, Alignof=12, Asm=13, Auto=14, Bool=15, 
		Break=16, Case=17, Catch=18, Char=19, Char16=20, Char32=21, Class=22, 
		Const=23, Constexpr=24, Const_cast=25, Continue=26, Decltype=27, Default=28, 
		Delete=29, Do=30, Double=31, Dynamic_cast=32, Else=33, Enum=34, Explicit=35, 
		Export=36, Extern=37, False_=38, Final=39, Float=40, For=41, Friend=42, 
		Goto=43, If=44, Inline=45, Int=46, Long=47, Mutable=48, Namespace=49, 
		New=50, Noexcept=51, Nullptr=52, Operator=53, Override=54, Private=55, 
		Protected=56, Public=57, Register=58, Reinterpret_cast=59, Return=60, 
		Short=61, Signed=62, Sizeof=63, Static=64, Static_assert=65, Static_cast=66, 
		Struct=67, Switch=68, Template=69, This=70, Thread_local=71, Throw=72, 
		True_=73, Try=74, Typedef=75, Typeid_=76, Typename_=77, Union=78, Unsigned=79, 
		Using=80, Virtual=81, Void=82, Volatile=83, Wchar=84, While=85, LeftParen=86, 
		RightParen=87, LeftBracket=88, RightBracket=89, LeftBrace=90, RightBrace=91, 
		Plus=92, Minus=93, Star=94, Div=95, Mod=96, Caret=97, And=98, Or=99, Tilde=100, 
		Not=101, Assign=102, Less=103, Greater=104, PlusAssign=105, MinusAssign=106, 
		StarAssign=107, DivAssign=108, ModAssign=109, XorAssign=110, AndAssign=111, 
		OrAssign=112, LeftShiftAssign=113, RightShiftAssign=114, Equal=115, NotEqual=116, 
		LessEqual=117, GreaterEqual=118, AndAnd=119, OrOr=120, PlusPlus=121, MinusMinus=122, 
		Comma=123, ArrowStar=124, Arrow=125, Question=126, Colon=127, Doublecolon=128, 
		Semi=129, Dot=130, DotStar=131, Ellipsis=132, Identifier=133, DecimalLiteral=134, 
		OctalLiteral=135, HexadecimalLiteral=136, BinaryLiteral=137, Integersuffix=138, 
		UserDefinedIntegerLiteral=139, UserDefinedFloatingLiteral=140, UserDefinedStringLiteral=141, 
		UserDefinedCharacterLiteral=142, Whitespace=143, Newline=144, BlockComment=145, 
		LineComment=146;
	public static final int
		RULE_translationUnit = 0, RULE_primaryExpression = 1, RULE_idExpression = 2, 
		RULE_unqualifiedId = 3, RULE_qualifiedId = 4, RULE_nestedNameSpecifier = 5, 
		RULE_lambdaExpression = 6, RULE_lambdaIntroducer = 7, RULE_lambdaCapture = 8, 
		RULE_captureDefault = 9, RULE_captureList = 10, RULE_capture = 11, RULE_simpleCapture = 12, 
		RULE_initcapture = 13, RULE_lambdaDeclarator = 14, RULE_postfixExpression = 15, 
		RULE_typeIdOfTheTypeId = 16, RULE_expressionList = 17, RULE_pseudoDestructorName = 18, 
		RULE_unaryExpression = 19, RULE_unaryOperator = 20, RULE_newExpression = 21, 
		RULE_newPlacement = 22, RULE_newTypeId = 23, RULE_newDeclarator = 24, 
		RULE_noPointerNewDeclarator = 25, RULE_newInitializer = 26, RULE_deleteExpression = 27, 
		RULE_noExceptExpression = 28, RULE_castExpression = 29, RULE_pointerMemberExpression = 30, 
		RULE_multiplicativeExpression = 31, RULE_additiveExpression = 32, RULE_shiftExpression = 33, 
		RULE_shiftOperator = 34, RULE_relationalExpression = 35, RULE_equalityExpression = 36, 
		RULE_andExpression = 37, RULE_exclusiveOrExpression = 38, RULE_inclusiveOrExpression = 39, 
		RULE_logicalAndExpression = 40, RULE_logicalOrExpression = 41, RULE_conditionalExpression = 42, 
		RULE_assignmentExpression = 43, RULE_assignmentOperator = 44, RULE_expression = 45, 
		RULE_constantExpression = 46, RULE_statement = 47, RULE_labeledStatement = 48, 
		RULE_expressionStatement = 49, RULE_compoundStatement = 50, RULE_statementSeq = 51, 
		RULE_selectionStatement = 52, RULE_condition = 53, RULE_iterationStatement = 54, 
		RULE_forInitStatement = 55, RULE_forRangeDeclaration = 56, RULE_forRangeInitializer = 57, 
		RULE_jumpStatement = 58, RULE_declarationStatement = 59, RULE_declarationseq = 60, 
		RULE_declaration = 61, RULE_blockDeclaration = 62, RULE_aliasDeclaration = 63, 
		RULE_simpleDeclaration = 64, RULE_staticAssertDeclaration = 65, RULE_emptyDeclaration = 66, 
		RULE_attributeDeclaration = 67, RULE_declSpecifier = 68, RULE_declSpecifierSeq = 69, 
		RULE_storageClassSpecifier = 70, RULE_functionSpecifier = 71, RULE_typedefName = 72, 
		RULE_typeSpecifier = 73, RULE_trailingTypeSpecifier = 74, RULE_typeSpecifierSeq = 75, 
		RULE_trailingTypeSpecifierSeq = 76, RULE_simpleTypeLengthModifier = 77, 
		RULE_simpleTypeSignednessModifier = 78, RULE_simpleTypeSpecifier = 79, 
		RULE_theTypeName = 80, RULE_decltypeSpecifier = 81, RULE_elaboratedTypeSpecifier = 82, 
		RULE_enumName = 83, RULE_enumSpecifier = 84, RULE_enumHead = 85, RULE_opaqueEnumDeclaration = 86, 
		RULE_enumkey = 87, RULE_enumbase = 88, RULE_enumeratorList = 89, RULE_enumeratorDefinition = 90, 
		RULE_enumerator = 91, RULE_namespaceName = 92, RULE_originalNamespaceName = 93, 
		RULE_namespaceDefinition = 94, RULE_namespaceAlias = 95, RULE_namespaceAliasDefinition = 96, 
		RULE_qualifiednamespacespecifier = 97, RULE_usingDeclaration = 98, RULE_usingDirective = 99, 
		RULE_asmDefinition = 100, RULE_linkageSpecification = 101, RULE_attributeSpecifierSeq = 102, 
		RULE_attributeSpecifier = 103, RULE_alignmentspecifier = 104, RULE_attributeList = 105, 
		RULE_attribute = 106, RULE_attributeNamespace = 107, RULE_attributeArgumentClause = 108, 
		RULE_balancedTokenSeq = 109, RULE_balancedtoken = 110, RULE_initDeclaratorList = 111, 
		RULE_initDeclarator = 112, RULE_declarator = 113, RULE_pointerDeclarator = 114, 
		RULE_noPointerDeclarator = 115, RULE_parametersAndQualifiers = 116, RULE_trailingReturnType = 117, 
		RULE_pointerOperator = 118, RULE_cvqualifierseq = 119, RULE_cvQualifier = 120, 
		RULE_refqualifier = 121, RULE_declaratorid = 122, RULE_theTypeId = 123, 
		RULE_abstractDeclarator = 124, RULE_pointerAbstractDeclarator = 125, RULE_noPointerAbstractDeclarator = 126, 
		RULE_abstractPackDeclarator = 127, RULE_noPointerAbstractPackDeclarator = 128, 
		RULE_parameterDeclarationClause = 129, RULE_parameterDeclarationList = 130, 
		RULE_parameterDeclaration = 131, RULE_functionDefinition = 132, RULE_functionBody = 133, 
		RULE_initializer = 134, RULE_braceOrEqualInitializer = 135, RULE_initializerClause = 136, 
		RULE_initializerList = 137, RULE_bracedInitList = 138, RULE_className = 139, 
		RULE_classSpecifier = 140, RULE_classHead = 141, RULE_classHeadName = 142, 
		RULE_classVirtSpecifier = 143, RULE_classKey = 144, RULE_memberSpecification = 145, 
		RULE_memberdeclaration = 146, RULE_memberDeclaratorList = 147, RULE_memberDeclarator = 148, 
		RULE_virtualSpecifierSeq = 149, RULE_virtualSpecifier = 150, RULE_pureSpecifier = 151, 
		RULE_baseClause = 152, RULE_baseSpecifierList = 153, RULE_baseSpecifier = 154, 
		RULE_classOrDeclType = 155, RULE_baseTypeSpecifier = 156, RULE_accessSpecifier = 157, 
		RULE_conversionFunctionId = 158, RULE_conversionTypeId = 159, RULE_conversionDeclarator = 160, 
		RULE_constructorInitializer = 161, RULE_memInitializerList = 162, RULE_memInitializer = 163, 
		RULE_meminitializerid = 164, RULE_operatorFunctionId = 165, RULE_literalOperatorId = 166, 
		RULE_templateDeclaration = 167, RULE_templateparameterList = 168, RULE_templateParameter = 169, 
		RULE_typeParameter = 170, RULE_simpleTemplateId = 171, RULE_templateId = 172, 
		RULE_templateName = 173, RULE_templateArgumentList = 174, RULE_templateArgument = 175, 
		RULE_typeNameSpecifier = 176, RULE_explicitInstantiation = 177, RULE_explicitSpecialization = 178, 
		RULE_tryBlock = 179, RULE_functionTryBlock = 180, RULE_handlerSeq = 181, 
		RULE_handler = 182, RULE_exceptionDeclaration = 183, RULE_throwExpression = 184, 
		RULE_exceptionSpecification = 185, RULE_dynamicExceptionSpecification = 186, 
		RULE_typeIdList = 187, RULE_noeExceptSpecification = 188, RULE_theOperator = 189, 
		RULE_literal = 190;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationUnit", "primaryExpression", "idExpression", "unqualifiedId", 
			"qualifiedId", "nestedNameSpecifier", "lambdaExpression", "lambdaIntroducer", 
			"lambdaCapture", "captureDefault", "captureList", "capture", "simpleCapture", 
			"initcapture", "lambdaDeclarator", "postfixExpression", "typeIdOfTheTypeId", 
			"expressionList", "pseudoDestructorName", "unaryExpression", "unaryOperator", 
			"newExpression", "newPlacement", "newTypeId", "newDeclarator", "noPointerNewDeclarator", 
			"newInitializer", "deleteExpression", "noExceptExpression", "castExpression", 
			"pointerMemberExpression", "multiplicativeExpression", "additiveExpression", 
			"shiftExpression", "shiftOperator", "relationalExpression", "equalityExpression", 
			"andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
			"logicalOrExpression", "conditionalExpression", "assignmentExpression", 
			"assignmentOperator", "expression", "constantExpression", "statement", 
			"labeledStatement", "expressionStatement", "compoundStatement", "statementSeq", 
			"selectionStatement", "condition", "iterationStatement", "forInitStatement", 
			"forRangeDeclaration", "forRangeInitializer", "jumpStatement", "declarationStatement", 
			"declarationseq", "declaration", "blockDeclaration", "aliasDeclaration", 
			"simpleDeclaration", "staticAssertDeclaration", "emptyDeclaration", "attributeDeclaration", 
			"declSpecifier", "declSpecifierSeq", "storageClassSpecifier", "functionSpecifier", 
			"typedefName", "typeSpecifier", "trailingTypeSpecifier", "typeSpecifierSeq", 
			"trailingTypeSpecifierSeq", "simpleTypeLengthModifier", "simpleTypeSignednessModifier", 
			"simpleTypeSpecifier", "theTypeName", "decltypeSpecifier", "elaboratedTypeSpecifier", 
			"enumName", "enumSpecifier", "enumHead", "opaqueEnumDeclaration", "enumkey", 
			"enumbase", "enumeratorList", "enumeratorDefinition", "enumerator", "namespaceName", 
			"originalNamespaceName", "namespaceDefinition", "namespaceAlias", "namespaceAliasDefinition", 
			"qualifiednamespacespecifier", "usingDeclaration", "usingDirective", 
			"asmDefinition", "linkageSpecification", "attributeSpecifierSeq", "attributeSpecifier", 
			"alignmentspecifier", "attributeList", "attribute", "attributeNamespace", 
			"attributeArgumentClause", "balancedTokenSeq", "balancedtoken", "initDeclaratorList", 
			"initDeclarator", "declarator", "pointerDeclarator", "noPointerDeclarator", 
			"parametersAndQualifiers", "trailingReturnType", "pointerOperator", "cvqualifierseq", 
			"cvQualifier", "refqualifier", "declaratorid", "theTypeId", "abstractDeclarator", 
			"pointerAbstractDeclarator", "noPointerAbstractDeclarator", "abstractPackDeclarator", 
			"noPointerAbstractPackDeclarator", "parameterDeclarationClause", "parameterDeclarationList", 
			"parameterDeclaration", "functionDefinition", "functionBody", "initializer", 
			"braceOrEqualInitializer", "initializerClause", "initializerList", "bracedInitList", 
			"className", "classSpecifier", "classHead", "classHeadName", "classVirtSpecifier", 
			"classKey", "memberSpecification", "memberdeclaration", "memberDeclaratorList", 
			"memberDeclarator", "virtualSpecifierSeq", "virtualSpecifier", "pureSpecifier", 
			"baseClause", "baseSpecifierList", "baseSpecifier", "classOrDeclType", 
			"baseTypeSpecifier", "accessSpecifier", "conversionFunctionId", "conversionTypeId", 
			"conversionDeclarator", "constructorInitializer", "memInitializerList", 
			"memInitializer", "meminitializerid", "operatorFunctionId", "literalOperatorId", 
			"templateDeclaration", "templateparameterList", "templateParameter", 
			"typeParameter", "simpleTemplateId", "templateId", "templateName", "templateArgumentList", 
			"templateArgument", "typeNameSpecifier", "explicitInstantiation", "explicitSpecialization", 
			"tryBlock", "functionTryBlock", "handlerSeq", "handler", "exceptionDeclaration", 
			"throwExpression", "exceptionSpecification", "dynamicExceptionSpecification", 
			"typeIdList", "noeExceptSpecification", "theOperator", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "'alignas'", 
			"'alignof'", "'asm'", "'auto'", "'bool'", "'break'", "'case'", "'catch'", 
			"'char'", "'char16_t'", "'char32_t'", "'class'", "'const'", "'constexpr'", 
			"'const_cast'", "'continue'", "'decltype'", "'default'", "'delete'", 
			"'do'", "'double'", "'dynamic_cast'", "'else'", "'enum'", "'explicit'", 
			"'export'", "'extern'", "'false'", "'final'", "'float'", "'for'", "'friend'", 
			"'goto'", "'if'", "'inline'", "'int'", "'long'", "'mutable'", "'namespace'", 
			"'new'", "'noexcept'", "'nullptr'", "'operator'", "'override'", "'private'", 
			"'protected'", "'public'", "'register'", "'reinterpret_cast'", "'return'", 
			"'short'", "'signed'", "'sizeof'", "'static'", "'static_assert'", "'static_cast'", 
			"'struct'", "'switch'", "'template'", "'this'", "'thread_local'", "'throw'", 
			"'true'", "'try'", "'typedef'", "'typeid'", "'typename'", "'union'", 
			"'unsigned'", "'using'", "'virtual'", "'void'", "'volatile'", "'wchar_t'", 
			"'while'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'^'", "'&'", "'|'", "'~'", null, "'='", "'<'", "'>'", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<='", 
			"'>>='", "'=='", "'!='", "'<='", "'>='", null, null, "'++'", "'--'", 
			"','", "'->*'", "'->'", "'?'", "':'", "'::'", "';'", "'.'", "'.*'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "CharacterLiteral", "FloatingLiteral", "StringLiteral", 
			"BooleanLiteral", "PointerLiteral", "UserDefinedLiteral", "MultiLineMacro", 
			"AsmArea", "Directive", "Alignas", "Alignof", "Asm", "Auto", "Bool", 
			"Break", "Case", "Catch", "Char", "Char16", "Char32", "Class", "Const", 
			"Constexpr", "Const_cast", "Continue", "Decltype", "Default", "Delete", 
			"Do", "Double", "Dynamic_cast", "Else", "Enum", "Explicit", "Export", 
			"Extern", "False_", "Final", "Float", "For", "Friend", "Goto", "If", 
			"Inline", "Int", "Long", "Mutable", "Namespace", "New", "Noexcept", "Nullptr", 
			"Operator", "Override", "Private", "Protected", "Public", "Register", 
			"Reinterpret_cast", "Return", "Short", "Signed", "Sizeof", "Static", 
			"Static_assert", "Static_cast", "Struct", "Switch", "Template", "This", 
			"Thread_local", "Throw", "True_", "Try", "Typedef", "Typeid_", "Typename_", 
			"Union", "Unsigned", "Using", "Virtual", "Void", "Volatile", "Wchar", 
			"While", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Plus", "Minus", "Star", "Div", "Mod", "Caret", "And", 
			"Or", "Tilde", "Not", "Assign", "Less", "Greater", "PlusAssign", "MinusAssign", 
			"StarAssign", "DivAssign", "ModAssign", "XorAssign", "AndAssign", "OrAssign", 
			"LeftShiftAssign", "RightShiftAssign", "Equal", "NotEqual", "LessEqual", 
			"GreaterEqual", "AndAnd", "OrOr", "PlusPlus", "MinusMinus", "Comma", 
			"ArrowStar", "Arrow", "Question", "Colon", "Doublecolon", "Semi", "Dot", 
			"DotStar", "Ellipsis", "Identifier", "DecimalLiteral", "OctalLiteral", 
			"HexadecimalLiteral", "BinaryLiteral", "Integersuffix", "UserDefinedIntegerLiteral", 
			"UserDefinedFloatingLiteral", "UserDefinedStringLiteral", "UserDefinedCharacterLiteral", 
			"Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CPP17Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPP17Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CPP17Parser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 1543754443169808157L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 459384754220313597L) != 0)) {
				{
				setState(382);
				declarationseq();
				}
			}

			setState(385);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode This() { return getToken(CPP17Parser.This, 0); }
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryExpression);
		try {
			int _alt;
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case PointerLiteral:
			case UserDefinedLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(388); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(387);
						literal();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(390); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				match(LeftParen);
				setState(394);
				expression();
				setState(395);
				match(RightParen);
				}
				break;
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				idExpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(398);
				lambdaExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdExpressionContext extends ParserRuleContext {
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public IdExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterIdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitIdExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitIdExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdExpressionContext idExpression() throws RecognitionException {
		IdExpressionContext _localctx = new IdExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idExpression);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				unqualifiedId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				qualifiedId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnqualifiedIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public OperatorFunctionIdContext operatorFunctionId() {
			return getRuleContext(OperatorFunctionIdContext.class,0);
		}
		public ConversionFunctionIdContext conversionFunctionId() {
			return getRuleContext(ConversionFunctionIdContext.class,0);
		}
		public LiteralOperatorIdContext literalOperatorId() {
			return getRuleContext(LiteralOperatorIdContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(CPP17Parser.Tilde, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public TemplateIdContext templateId() {
			return getRuleContext(TemplateIdContext.class,0);
		}
		public UnqualifiedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterUnqualifiedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitUnqualifiedId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitUnqualifiedId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedIdContext unqualifiedId() throws RecognitionException {
		UnqualifiedIdContext _localctx = new UnqualifiedIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unqualifiedId);
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				operatorFunctionId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				conversionFunctionId();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				literalOperatorId();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(409);
				match(Tilde);
				setState(412);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(410);
					className();
					}
					break;
				case Decltype:
					{
					setState(411);
					decltypeSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(414);
				templateId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedIdContext extends ParserRuleContext {
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP17Parser.Template, 0); }
		public QualifiedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterQualifiedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitQualifiedId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitQualifiedId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdContext qualifiedId() throws RecognitionException {
		QualifiedIdContext _localctx = new QualifiedIdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_qualifiedId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			nestedNameSpecifier(0);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(418);
				match(Template);
				}
			}

			setState(421);
			unqualifiedId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NestedNameSpecifierContext extends ParserRuleContext {
		public TerminalNode Doublecolon() { return getToken(CPP17Parser.Doublecolon, 0); }
		public TheTypeNameContext theTypeName() {
			return getRuleContext(TheTypeNameContext.class,0);
		}
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP17Parser.Template, 0); }
		public NestedNameSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedNameSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterNestedNameSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitNestedNameSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitNestedNameSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedNameSpecifierContext nestedNameSpecifier() throws RecognitionException {
		return nestedNameSpecifier(0);
	}

	private NestedNameSpecifierContext nestedNameSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NestedNameSpecifierContext _localctx = new NestedNameSpecifierContext(_ctx, _parentState);
		NestedNameSpecifierContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_nestedNameSpecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(424);
				theTypeName();
				}
				break;
			case 2:
				{
				setState(425);
				namespaceName();
				}
				break;
			case 3:
				{
				setState(426);
				decltypeSpecifier();
				}
				break;
			}
			setState(429);
			match(Doublecolon);
			}
			_ctx.stop = _input.LT(-1);
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NestedNameSpecifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_nestedNameSpecifier);
					setState(431);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(437);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(432);
						match(Identifier);
						}
						break;
					case 2:
						{
						setState(434);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(433);
							match(Template);
							}
						}

						setState(436);
						simpleTemplateId();
						}
						break;
					}
					setState(439);
					match(Doublecolon);
					}
					} 
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaIntroducerContext lambdaIntroducer() {
			return getRuleContext(LambdaIntroducerContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public LambdaDeclaratorContext lambdaDeclarator() {
			return getRuleContext(LambdaDeclaratorContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lambdaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			lambdaIntroducer();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(446);
				lambdaDeclarator();
				}
			}

			setState(449);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaIntroducerContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CPP17Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP17Parser.RightBracket, 0); }
		public LambdaCaptureContext lambdaCapture() {
			return getRuleContext(LambdaCaptureContext.class,0);
		}
		public LambdaIntroducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaIntroducer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterLambdaIntroducer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitLambdaIntroducer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitLambdaIntroducer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaIntroducerContext lambdaIntroducer() throws RecognitionException {
		LambdaIntroducerContext _localctx = new LambdaIntroducerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambdaIntroducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(LeftBracket);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & -9223372032291373055L) != 0)) {
				{
				setState(452);
				lambdaCapture();
				}
			}

			setState(455);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaCaptureContext extends ParserRuleContext {
		public CaptureListContext captureList() {
			return getRuleContext(CaptureListContext.class,0);
		}
		public CaptureDefaultContext captureDefault() {
			return getRuleContext(CaptureDefaultContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP17Parser.Comma, 0); }
		public LambdaCaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaCapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterLambdaCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitLambdaCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitLambdaCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaCaptureContext lambdaCapture() throws RecognitionException {
		LambdaCaptureContext _localctx = new LambdaCaptureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdaCapture);
		int _la;
		try {
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				captureList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				captureDefault();
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(459);
					match(Comma);
					setState(460);
					captureList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaptureDefaultContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CPP17Parser.And, 0); }
		public TerminalNode Assign() { return getToken(CPP17Parser.Assign, 0); }
		public CaptureDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterCaptureDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitCaptureDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitCaptureDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureDefaultContext captureDefault() throws RecognitionException {
		CaptureDefaultContext _localctx = new CaptureDefaultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_captureDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Assign) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaptureListContext extends ParserRuleContext {
		public List<CaptureContext> capture() {
			return getRuleContexts(CaptureContext.class);
		}
		public CaptureContext capture(int i) {
			return getRuleContext(CaptureContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPP17Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPP17Parser.Comma, i);
		}
		public TerminalNode Ellipsis() { return getToken(CPP17Parser.Ellipsis, 0); }
		public CaptureListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterCaptureList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitCaptureList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitCaptureList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureListContext captureList() throws RecognitionException {
		CaptureListContext _localctx = new CaptureListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_captureList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			capture();
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(468);
				match(Comma);
				setState(469);
				capture();
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(475);
				match(Ellipsis);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaptureContext extends ParserRuleContext {
		public SimpleCaptureContext simpleCapture() {
			return getRuleContext(SimpleCaptureContext.class,0);
		}
		public InitcaptureContext initcapture() {
			return getRuleContext(InitcaptureContext.class,0);
		}
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_capture);
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				simpleCapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				initcapture();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleCaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public TerminalNode And() { return getToken(CPP17Parser.And, 0); }
		public TerminalNode This() { return getToken(CPP17Parser.This, 0); }
		public SimpleCaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterSimpleCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitSimpleCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitSimpleCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleCaptureContext simpleCapture() throws RecognitionException {
		SimpleCaptureContext _localctx = new SimpleCaptureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleCapture);
		int _la;
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(482);
					match(And);
					}
				}

				setState(485);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(This);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitcaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode And() { return getToken(CPP17Parser.And, 0); }
		public InitcaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initcapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterInitcapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitInitcapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitInitcapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitcaptureContext initcapture() throws RecognitionException {
		InitcaptureContext _localctx = new InitcaptureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initcapture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(489);
				match(And);
				}
			}

			setState(492);
			match(Identifier);
			setState(493);
			initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public ParameterDeclarationClauseContext parameterDeclarationClause() {
			return getRuleContext(ParameterDeclarationClauseContext.class,0);
		}
		public TerminalNode Mutable() { return getToken(CPP17Parser.Mutable, 0); }
		public ExceptionSpecificationContext exceptionSpecification() {
			return getRuleContext(ExceptionSpecificationContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TrailingReturnTypeContext trailingReturnType() {
			return getRuleContext(TrailingReturnTypeContext.class,0);
		}
		public LambdaDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterLambdaDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitLambdaDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitLambdaDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaDeclaratorContext lambdaDeclarator() throws RecognitionException {
		LambdaDeclaratorContext _localctx = new LambdaDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lambdaDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(LeftParen);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 1237504995584196377L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 441352763482317789L) != 0)) {
				{
				setState(496);
				parameterDeclarationClause();
				}
			}

			setState(499);
			match(RightParen);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(500);
				match(Mutable);
				}
			}

			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(503);
				exceptionSpecification();
				}
			}

			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(506);
				attributeSpecifierSeq();
				}
			}

			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(509);
				trailingReturnType();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public SimpleTypeSpecifierContext simpleTypeSpecifier() {
			return getRuleContext(SimpleTypeSpecifierContext.class,0);
		}
		public TypeNameSpecifierContext typeNameSpecifier() {
			return getRuleContext(TypeNameSpecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode Less() { return getToken(CPP17Parser.Less, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Greater() { return getToken(CPP17Parser.Greater, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dynamic_cast() { return getToken(CPP17Parser.Dynamic_cast, 0); }
		public TerminalNode Static_cast() { return getToken(CPP17Parser.Static_cast, 0); }
		public TerminalNode Reinterpret_cast() { return getToken(CPP17Parser.Reinterpret_cast, 0); }
		public TerminalNode Const_cast() { return getToken(CPP17Parser.Const_cast, 0); }
		public TypeIdOfTheTypeIdContext typeIdOfTheTypeId() {
			return getRuleContext(TypeIdOfTheTypeIdContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPP17Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP17Parser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(CPP17Parser.Dot, 0); }
		public TerminalNode Arrow() { return getToken(CPP17Parser.Arrow, 0); }
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public PseudoDestructorNameContext pseudoDestructorName() {
			return getRuleContext(PseudoDestructorNameContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP17Parser.Template, 0); }
		public TerminalNode PlusPlus() { return getToken(CPP17Parser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CPP17Parser.MinusMinus, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(513);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(516);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Auto:
				case Bool:
				case Char:
				case Char16:
				case Char32:
				case Decltype:
				case Double:
				case Float:
				case Int:
				case Long:
				case Short:
				case Signed:
				case Unsigned:
				case Void:
				case Wchar:
				case Doublecolon:
				case Identifier:
					{
					setState(514);
					simpleTypeSpecifier();
					}
					break;
				case Typename_:
					{
					setState(515);
					typeNameSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(524);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
					{
					setState(518);
					match(LeftParen);
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1716785145040023298L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4719772474400910417L) != 0) || _la==Identifier) {
						{
						setState(519);
						expressionList();
						}
					}

					setState(522);
					match(RightParen);
					}
					break;
				case LeftBrace:
					{
					setState(523);
					bracedInitList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				{
				setState(526);
				_la = _input.LA(1);
				if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 2216203124865L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(527);
				match(Less);
				setState(528);
				theTypeId();
				setState(529);
				match(Greater);
				setState(530);
				match(LeftParen);
				setState(531);
				expression();
				setState(532);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(534);
				typeIdOfTheTypeId();
				setState(535);
				match(LeftParen);
				setState(538);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(536);
					expression();
					}
					break;
				case 2:
					{
					setState(537);
					theTypeId();
					}
					break;
				}
				setState(540);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(569);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(544);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(545);
						match(LeftBracket);
						setState(548);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IntegerLiteral:
						case CharacterLiteral:
						case FloatingLiteral:
						case StringLiteral:
						case BooleanLiteral:
						case PointerLiteral:
						case UserDefinedLiteral:
						case Alignof:
						case Auto:
						case Bool:
						case Char:
						case Char16:
						case Char32:
						case Const_cast:
						case Decltype:
						case Delete:
						case Double:
						case Dynamic_cast:
						case Float:
						case Int:
						case Long:
						case New:
						case Noexcept:
						case Operator:
						case Reinterpret_cast:
						case Short:
						case Signed:
						case Sizeof:
						case Static_cast:
						case This:
						case Throw:
						case Typeid_:
						case Typename_:
						case Unsigned:
						case Void:
						case Wchar:
						case LeftParen:
						case LeftBracket:
						case Plus:
						case Minus:
						case Star:
						case And:
						case Or:
						case Tilde:
						case Not:
						case PlusPlus:
						case MinusMinus:
						case Doublecolon:
						case Identifier:
							{
							setState(546);
							expression();
							}
							break;
						case LeftBrace:
							{
							setState(547);
							bracedInitList();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(550);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(552);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(553);
						match(LeftParen);
						setState(555);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1716785145040023298L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4719772474400910417L) != 0) || _la==Identifier) {
							{
							setState(554);
							expressionList();
							}
						}

						setState(557);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(558);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(559);
						_la = _input.LA(1);
						if ( !(_la==Arrow || _la==Dot) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(565);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(561);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==Template) {
								{
								setState(560);
								match(Template);
								}
							}

							setState(563);
							idExpression();
							}
							break;
						case 2:
							{
							setState(564);
							pseudoDestructorName();
							}
							break;
						}
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(567);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(568);
						_la = _input.LA(1);
						if ( !(_la==PlusPlus || _la==MinusMinus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeIdOfTheTypeIdContext extends ParserRuleContext {
		public TerminalNode Typeid_() { return getToken(CPP17Parser.Typeid_, 0); }
		public TypeIdOfTheTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdOfTheTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTypeIdOfTheTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTypeIdOfTheTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTypeIdOfTheTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdOfTheTypeIdContext typeIdOfTheTypeId() throws RecognitionException {
		TypeIdOfTheTypeIdContext _localctx = new TypeIdOfTheTypeIdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeIdOfTheTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(Typeid_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			initializerList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoDestructorNameContext extends ParserRuleContext {
		public TerminalNode Tilde() { return getToken(CPP17Parser.Tilde, 0); }
		public List<TheTypeNameContext> theTypeName() {
			return getRuleContexts(TheTypeNameContext.class);
		}
		public TheTypeNameContext theTypeName(int i) {
			return getRuleContext(TheTypeNameContext.class,i);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(CPP17Parser.Doublecolon, 0); }
		public TerminalNode Template() { return getToken(CPP17Parser.Template, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public PseudoDestructorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoDestructorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterPseudoDestructorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitPseudoDestructorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitPseudoDestructorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoDestructorNameContext pseudoDestructorName() throws RecognitionException {
		PseudoDestructorNameContext _localctx = new PseudoDestructorNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pseudoDestructorName);
		int _la;
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(578);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(581);
					theTypeName();
					setState(582);
					match(Doublecolon);
					}
				}

				setState(586);
				match(Tilde);
				setState(587);
				theTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				nestedNameSpecifier(0);
				setState(589);
				match(Template);
				setState(590);
				simpleTemplateId();
				setState(591);
				match(Doublecolon);
				setState(592);
				match(Tilde);
				setState(593);
				theTypeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
				match(Tilde);
				setState(596);
				decltypeSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(CPP17Parser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CPP17Parser.MinusMinus, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(CPP17Parser.Sizeof, 0); }
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public TerminalNode Ellipsis() { return getToken(CPP17Parser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public TerminalNode Alignof() { return getToken(CPP17Parser.Alignof, 0); }
		public NoExceptExpressionContext noExceptExpression() {
			return getRuleContext(NoExceptExpressionContext.class,0);
		}
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public DeleteExpressionContext deleteExpression() {
			return getRuleContext(DeleteExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryExpression);
		try {
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PlusPlus:
					{
					setState(600);
					match(PlusPlus);
					}
					break;
				case MinusMinus:
					{
					setState(601);
					match(MinusMinus);
					}
					break;
				case Plus:
				case Minus:
				case Star:
				case And:
				case Or:
				case Tilde:
				case Not:
					{
					setState(602);
					unaryOperator();
					}
					break;
				case Sizeof:
					{
					setState(603);
					match(Sizeof);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(606);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(607);
				match(Sizeof);
				setState(616);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
					{
					setState(608);
					match(LeftParen);
					setState(609);
					theTypeId();
					setState(610);
					match(RightParen);
					}
					break;
				case Ellipsis:
					{
					setState(612);
					match(Ellipsis);
					setState(613);
					match(LeftParen);
					setState(614);
					match(Identifier);
					setState(615);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(618);
				match(Alignof);
				setState(619);
				match(LeftParen);
				setState(620);
				theTypeId();
				setState(621);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(623);
				noExceptExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(624);
				newExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(625);
				deleteExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(CPP17Parser.Or, 0); }
		public TerminalNode Star() { return getToken(CPP17Parser.Star, 0); }
		public TerminalNode And() { return getToken(CPP17Parser.And, 0); }
		public TerminalNode Plus() { return getToken(CPP17Parser.Plus, 0); }
		public TerminalNode Tilde() { return getToken(CPP17Parser.Tilde, 0); }
		public TerminalNode Minus() { return getToken(CPP17Parser.Minus, 0); }
		public TerminalNode Not() { return getToken(CPP17Parser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_la = _input.LA(1);
			if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 967L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewExpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(CPP17Parser.New, 0); }
		public NewTypeIdContext newTypeId() {
			return getRuleContext(NewTypeIdContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(CPP17Parser.Doublecolon, 0); }
		public NewPlacementContext newPlacement() {
			return getRuleContext(NewPlacementContext.class,0);
		}
		public NewInitializerContext newInitializer() {
			return getRuleContext(NewInitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_newExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Doublecolon) {
				{
				setState(630);
				match(Doublecolon);
				}
			}

			setState(633);
			match(New);
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(634);
				newPlacement();
				}
				break;
			}
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename_:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case Doublecolon:
			case Identifier:
				{
				setState(637);
				newTypeId();
				}
				break;
			case LeftParen:
				{
				{
				setState(638);
				match(LeftParen);
				setState(639);
				theTypeId();
				setState(640);
				match(RightParen);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen || _la==LeftBrace) {
				{
				setState(644);
				newInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewPlacementContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public NewPlacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newPlacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterNewPlacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitNewPlacement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitNewPlacement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewPlacementContext newPlacement() throws RecognitionException {
		NewPlacementContext _localctx = new NewPlacementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newPlacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(LeftParen);
			setState(648);
			expressionList();
			setState(649);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewTypeIdContext extends ParserRuleContext {
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public NewDeclaratorContext newDeclarator() {
			return getRuleContext(NewDeclaratorContext.class,0);
		}
		public NewTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterNewTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitNewTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitNewTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewTypeIdContext newTypeId() throws RecognitionException {
		NewTypeIdContext _localctx = new NewTypeIdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_newTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			typeSpecifierSeq();
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(652);
				newDeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewDeclaratorContext extends ParserRuleContext {
		public PointerOperatorContext pointerOperator() {
			return getRuleContext(PointerOperatorContext.class,0);
		}
		public NewDeclaratorContext newDeclarator() {
			return getRuleContext(NewDeclaratorContext.class,0);
		}
		public NoPointerNewDeclaratorContext noPointerNewDeclarator() {
			return getRuleContext(NoPointerNewDeclaratorContext.class,0);
		}
		public NewDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterNewDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitNewDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitNewDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewDeclaratorContext newDeclarator() throws RecognitionException {
		NewDeclaratorContext _localctx = new NewDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_newDeclarator);
		try {
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				pointerOperator();
				setState(657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(656);
					newDeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				noPointerNewDeclarator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoPointerNewDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CPP17Parser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CPP17Parser.RightBracket, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public NoPointerNewDeclaratorContext noPointerNewDeclarator() {
			return getRuleContext(NoPointerNewDeclaratorContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public NoPointerNewDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerNewDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterNoPointerNewDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitNoPointerNewDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitNoPointerNewDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoPointerNewDeclaratorContext noPointerNewDeclarator() throws RecognitionException {
		return noPointerNewDeclarator(0);
	}

	private NoPointerNewDeclaratorContext noPointerNewDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoPointerNewDeclaratorContext _localctx = new NoPointerNewDeclaratorContext(_ctx, _parentState);
		NoPointerNewDeclaratorContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_noPointerNewDeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(663);
			match(LeftBracket);
			setState(664);
			expression();
			setState(665);
			match(RightBracket);
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(666);
				attributeSpecifierSeq();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerNewDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerNewDeclarator);
					setState(669);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(670);
					match(LeftBracket);
					setState(671);
					constantExpression();
					setState(672);
					match(RightBracket);
					setState(674);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(673);
						attributeSpecifierSeq();
						}
						break;
					}
					}
					} 
				}
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewInitializerContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public NewInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterNewInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitNewInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitNewInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewInitializerContext newInitializer() throws RecognitionException {
		NewInitializerContext _localctx = new NewInitializerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_newInitializer);
		int _la;
		try {
			setState(687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				match(LeftParen);
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1716785145040023298L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4719772474400910417L) != 0) || _la==Identifier) {
					{
					setState(682);
					expressionList();
					}
				}

				setState(685);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteExpressionContext extends ParserRuleContext {
		public TerminalNode Delete() { return getToken(CPP17Parser.Delete, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(CPP17Parser.Doublecolon, 0); }
		public TerminalNode LeftBracket() { return getToken(CPP17Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP17Parser.RightBracket, 0); }
		public DeleteExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterDeleteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitDeleteExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitDeleteExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteExpressionContext deleteExpression() throws RecognitionException {
		DeleteExpressionContext _localctx = new DeleteExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_deleteExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Doublecolon) {
				{
				setState(689);
				match(Doublecolon);
				}
			}

			setState(692);
			match(Delete);
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(693);
				match(LeftBracket);
				setState(694);
				match(RightBracket);
				}
				break;
			}
			setState(697);
			castExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoExceptExpressionContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPP17Parser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public NoExceptExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noExceptExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterNoExceptExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitNoExceptExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitNoExceptExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoExceptExpressionContext noExceptExpression() throws RecognitionException {
		NoExceptExpressionContext _localctx = new NoExceptExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_noExceptExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(Noexcept);
			setState(700);
			match(LeftParen);
			setState(701);
			expression();
			setState(702);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(CPP17Parser.Tilde, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_castExpression);
		int _la;
		try {
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(705);
					unaryOperator();
					}
					break;
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tilde) {
					{
					setState(708);
					match(Tilde);
					}
				}

				setState(711);
				match(LeftParen);
				setState(712);
				theTypeId();
				setState(713);
				match(RightParen);
				setState(714);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointerMemberExpressionContext extends ParserRuleContext {
		public List<CastExpressionContext> castExpression() {
			return getRuleContexts(CastExpressionContext.class);
		}
		public CastExpressionContext castExpression(int i) {
			return getRuleContext(CastExpressionContext.class,i);
		}
		public List<TerminalNode> DotStar() { return getTokens(CPP17Parser.DotStar); }
		public TerminalNode DotStar(int i) {
			return getToken(CPP17Parser.DotStar, i);
		}
		public List<TerminalNode> ArrowStar() { return getTokens(CPP17Parser.ArrowStar); }
		public TerminalNode ArrowStar(int i) {
			return getToken(CPP17Parser.ArrowStar, i);
		}
		public PointerMemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerMemberExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterPointerMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitPointerMemberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitPointerMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerMemberExpressionContext pointerMemberExpression() throws RecognitionException {
		PointerMemberExpressionContext _localctx = new PointerMemberExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pointerMemberExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			castExpression();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ArrowStar || _la==DotStar) {
				{
				{
				setState(719);
				_la = _input.LA(1);
				if ( !(_la==ArrowStar || _la==DotStar) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(720);
				castExpression();
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<PointerMemberExpressionContext> pointerMemberExpression() {
			return getRuleContexts(PointerMemberExpressionContext.class);
		}
		public PointerMemberExpressionContext pointerMemberExpression(int i) {
			return getRuleContext(PointerMemberExpressionContext.class,i);
		}
		public List<TerminalNode> Star() { return getTokens(CPP17Parser.Star); }
		public TerminalNode Star(int i) {
			return getToken(CPP17Parser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(CPP17Parser.Div); }
		public TerminalNode Div(int i) {
			return getToken(CPP17Parser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(CPP17Parser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(CPP17Parser.Mod, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			pointerMemberExpression();
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 7L) != 0)) {
				{
				{
				setState(727);
				_la = _input.LA(1);
				if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(728);
				pointerMemberExpression();
				}
				}
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(CPP17Parser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(CPP17Parser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(CPP17Parser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(CPP17Parser.Minus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			multiplicativeExpression();
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(735);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(736);
				multiplicativeExpression();
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOperatorContext> shiftOperator() {
			return getRuleContexts(ShiftOperatorContext.class);
		}
		public ShiftOperatorContext shiftOperator(int i) {
			return getRuleContext(ShiftOperatorContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			additiveExpression();
			setState(748);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(743);
					shiftOperator();
					setState(744);
					additiveExpression();
					}
					} 
				}
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShiftOperatorContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(CPP17Parser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(CPP17Parser.Greater, i);
		}
		public List<TerminalNode> Less() { return getTokens(CPP17Parser.Less); }
		public TerminalNode Less(int i) {
			return getToken(CPP17Parser.Less, i);
		}
		public ShiftOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterShiftOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitShiftOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitShiftOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftOperatorContext shiftOperator() throws RecognitionException {
		ShiftOperatorContext _localctx = new ShiftOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_shiftOperator);
		try {
			setState(755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Greater:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				match(Greater);
				setState(752);
				match(Greater);
				}
				break;
			case Less:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				match(Less);
				setState(754);
				match(Less);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(CPP17Parser.Less); }
		public TerminalNode Less(int i) {
			return getToken(CPP17Parser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(CPP17Parser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(CPP17Parser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(CPP17Parser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(CPP17Parser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(CPP17Parser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(CPP17Parser.GreaterEqual, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_relationalExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			shiftExpression();
			setState(762);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(758);
					_la = _input.LA(1);
					if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 49155L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(759);
					shiftExpression();
					}
					} 
				}
				setState(764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> Equal() { return getTokens(CPP17Parser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(CPP17Parser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(CPP17Parser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(CPP17Parser.NotEqual, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			relationalExpression();
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(766);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(767);
				relationalExpression();
				}
				}
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(CPP17Parser.And); }
		public TerminalNode And(int i) {
			return getToken(CPP17Parser.And, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			equalityExpression();
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(774);
				match(And);
				setState(775);
				equalityExpression();
				}
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> Caret() { return getTokens(CPP17Parser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(CPP17Parser.Caret, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			andExpression();
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(782);
				match(Caret);
				setState(783);
				andExpression();
				}
				}
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(CPP17Parser.Or); }
		public TerminalNode Or(int i) {
			return getToken(CPP17Parser.Or, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			exclusiveOrExpression();
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(790);
				match(Or);
				setState(791);
				exclusiveOrExpression();
				}
				}
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AndAnd() { return getTokens(CPP17Parser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(CPP17Parser.AndAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			inclusiveOrExpression();
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(798);
				match(AndAnd);
				setState(799);
				inclusiveOrExpression();
				}
				}
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OrOr() { return getTokens(CPP17Parser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(CPP17Parser.OrOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			logicalAndExpression();
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(806);
				match(OrOr);
				setState(807);
				logicalAndExpression();
				}
				}
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(CPP17Parser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPP17Parser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			logicalOrExpression();
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(814);
				match(Question);
				setState(815);
				expression();
				setState(816);
				match(Colon);
				setState(817);
				assignmentExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public ThrowExpressionContext throwExpression() {
			return getRuleContext(ThrowExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assignmentExpression);
		try {
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				logicalOrExpression();
				setState(823);
				assignmentOperator();
				setState(824);
				initializerClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(826);
				throwExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(CPP17Parser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(CPP17Parser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(CPP17Parser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(CPP17Parser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(CPP17Parser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(CPP17Parser.MinusAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CPP17Parser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CPP17Parser.LeftShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(CPP17Parser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(CPP17Parser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(CPP17Parser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 8185L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPP17Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPP17Parser.Comma, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			assignmentExpression();
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(832);
				match(Comma);
				setState(833);
				assignmentExpression();
				}
				}
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			conditionalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public TryBlockContext tryBlock() {
			return getRuleContext(TryBlockContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_statement);
		try {
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(841);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				declarationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(843);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(852);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerLiteral:
				case CharacterLiteral:
				case FloatingLiteral:
				case StringLiteral:
				case BooleanLiteral:
				case PointerLiteral:
				case UserDefinedLiteral:
				case Alignof:
				case Auto:
				case Bool:
				case Char:
				case Char16:
				case Char32:
				case Const_cast:
				case Decltype:
				case Delete:
				case Double:
				case Dynamic_cast:
				case Float:
				case Int:
				case Long:
				case New:
				case Noexcept:
				case Operator:
				case Reinterpret_cast:
				case Short:
				case Signed:
				case Sizeof:
				case Static_cast:
				case This:
				case Throw:
				case Typeid_:
				case Typename_:
				case Unsigned:
				case Void:
				case Wchar:
				case LeftParen:
				case LeftBracket:
				case Plus:
				case Minus:
				case Star:
				case And:
				case Or:
				case Tilde:
				case Not:
				case PlusPlus:
				case MinusMinus:
				case Doublecolon:
				case Semi:
				case Identifier:
					{
					setState(846);
					expressionStatement();
					}
					break;
				case LeftBrace:
					{
					setState(847);
					compoundStatement();
					}
					break;
				case If:
				case Switch:
					{
					setState(848);
					selectionStatement();
					}
					break;
				case Do:
				case For:
				case While:
					{
					setState(849);
					iterationStatement();
					}
					break;
				case Break:
				case Continue:
				case Goto:
				case Return:
					{
					setState(850);
					jumpStatement();
					}
					break;
				case Try:
					{
					setState(851);
					tryBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CPP17Parser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public TerminalNode Case() { return getToken(CPP17Parser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(CPP17Parser.Default, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_labeledStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(856);
				attributeSpecifierSeq();
				}
			}

			setState(863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(859);
				match(Identifier);
				}
				break;
			case Case:
				{
				setState(860);
				match(Case);
				setState(861);
				constantExpression();
				}
				break;
			case Default:
				{
				setState(862);
				match(Default);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(865);
			match(Colon);
			setState(866);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPP17Parser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1716785145040023298L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4719772474384133201L) != 0) || _la==Identifier) {
				{
				setState(868);
				expression();
				}
			}

			setState(871);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CPP17Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPP17Parser.RightBrace, 0); }
		public StatementSeqContext statementSeq() {
			return getRuleContext(StatementSeqContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			match(LeftBrace);
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -274720479212996354L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 468374620915891679L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 51L) != 0)) {
				{
				setState(874);
				statementSeq();
				}
			}

			setState(877);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementSeqContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterStatementSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitStatementSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitStatementSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementSeqContext statementSeq() throws RecognitionException {
		StatementSeqContext _localctx = new StatementSeqContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_statementSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(879);
				statement();
				}
				}
				setState(882); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -274720479212996354L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 468374620915891679L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 51L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(CPP17Parser.If, 0); }
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CPP17Parser.Else, 0); }
		public TerminalNode Switch() { return getToken(CPP17Parser.Switch, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_selectionStatement);
		try {
			setState(899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				match(If);
				setState(885);
				match(LeftParen);
				setState(886);
				condition();
				setState(887);
				match(RightParen);
				setState(888);
				statement();
				setState(891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(889);
					match(Else);
					setState(890);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				match(Switch);
				setState(894);
				match(LeftParen);
				setState(895);
				condition();
				setState(896);
				match(RightParen);
				setState(897);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPP17Parser.Assign, 0); }
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_condition);
		int _la;
		try {
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(901);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(902);
					attributeSpecifierSeq();
					}
				}

				setState(905);
				declSpecifierSeq();
				setState(906);
				declarator();
				setState(910);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Assign:
					{
					setState(907);
					match(Assign);
					setState(908);
					initializerClause();
					}
					break;
				case LeftBrace:
					{
					setState(909);
					bracedInitList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CPP17Parser.While, 0); }
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(CPP17Parser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP17Parser.Semi, 0); }
		public TerminalNode For() { return getToken(CPP17Parser.For, 0); }
		public ForInitStatementContext forInitStatement() {
			return getRuleContext(ForInitStatementContext.class,0);
		}
		public ForRangeDeclarationContext forRangeDeclaration() {
			return getRuleContext(ForRangeDeclarationContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPP17Parser.Colon, 0); }
		public ForRangeInitializerContext forRangeInitializer() {
			return getRuleContext(ForRangeInitializerContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_iterationStatement);
		int _la;
		try {
			setState(947);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				match(While);
				setState(915);
				match(LeftParen);
				setState(916);
				condition();
				setState(917);
				match(RightParen);
				setState(918);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(920);
				match(Do);
				setState(921);
				statement();
				setState(922);
				match(While);
				setState(923);
				match(LeftParen);
				setState(924);
				expression();
				setState(925);
				match(RightParen);
				setState(926);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(928);
				match(For);
				setState(929);
				match(LeftParen);
				setState(942);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(930);
					forInitStatement();
					setState(932);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1428233522485077762L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 432345823827655117L) != 0) || _la==Doublecolon || _la==Identifier) {
						{
						setState(931);
						condition();
						}
					}

					setState(934);
					match(Semi);
					setState(936);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1716785145040023298L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4719772474384133201L) != 0) || _la==Identifier) {
						{
						setState(935);
						expression();
						}
					}

					}
					break;
				case 2:
					{
					setState(938);
					forRangeDeclaration();
					setState(939);
					match(Colon);
					setState(940);
					forRangeInitializer();
					}
					break;
				}
				setState(944);
				match(RightParen);
				setState(945);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitStatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public ForInitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterForInitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitForInitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitForInitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitStatementContext forInitStatement() throws RecognitionException {
		ForInitStatementContext _localctx = new ForInitStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_forInitStatement);
		try {
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				simpleDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForRangeDeclarationContext extends ParserRuleContext {
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public ForRangeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRangeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterForRangeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitForRangeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitForRangeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForRangeDeclarationContext forRangeDeclaration() throws RecognitionException {
		ForRangeDeclarationContext _localctx = new ForRangeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forRangeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(953);
				attributeSpecifierSeq();
				}
			}

			setState(956);
			declSpecifierSeq();
			setState(957);
			declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForRangeInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public ForRangeInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRangeInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterForRangeInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitForRangeInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitForRangeInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForRangeInitializerContext forRangeInitializer() throws RecognitionException {
		ForRangeInitializerContext _localctx = new ForRangeInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forRangeInitializer);
		try {
			setState(961);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case PointerLiteral:
			case UserDefinedLiteral:
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case Typeid_:
			case Typename_:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				expression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPP17Parser.Semi, 0); }
		public TerminalNode Break() { return getToken(CPP17Parser.Break, 0); }
		public TerminalNode Continue() { return getToken(CPP17Parser.Continue, 0); }
		public TerminalNode Return() { return getToken(CPP17Parser.Return, 0); }
		public TerminalNode Goto() { return getToken(CPP17Parser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_jumpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				{
				setState(963);
				match(Break);
				}
				break;
			case Continue:
				{
				setState(964);
				match(Continue);
				}
				break;
			case Return:
				{
				setState(965);
				match(Return);
				setState(968);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerLiteral:
				case CharacterLiteral:
				case FloatingLiteral:
				case StringLiteral:
				case BooleanLiteral:
				case PointerLiteral:
				case UserDefinedLiteral:
				case Alignof:
				case Auto:
				case Bool:
				case Char:
				case Char16:
				case Char32:
				case Const_cast:
				case Decltype:
				case Delete:
				case Double:
				case Dynamic_cast:
				case Float:
				case Int:
				case Long:
				case New:
				case Noexcept:
				case Operator:
				case Reinterpret_cast:
				case Short:
				case Signed:
				case Sizeof:
				case Static_cast:
				case This:
				case Throw:
				case Typeid_:
				case Typename_:
				case Unsigned:
				case Void:
				case Wchar:
				case LeftParen:
				case LeftBracket:
				case Plus:
				case Minus:
				case Star:
				case And:
				case Or:
				case Tilde:
				case Not:
				case PlusPlus:
				case MinusMinus:
				case Doublecolon:
				case Identifier:
					{
					setState(966);
					expression();
					}
					break;
				case LeftBrace:
					{
					setState(967);
					bracedInitList();
					}
					break;
				case Semi:
					break;
				default:
					break;
				}
				}
				break;
			case Goto:
				{
				setState(970);
				match(Goto);
				setState(971);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(974);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStatementContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			blockDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationseqContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitDeclarationseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitDeclarationseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_declarationseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(978);
				declaration();
				}
				}
				setState(981); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 1543754443169808157L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 459384754220313597L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public ExplicitInstantiationContext explicitInstantiation() {
			return getRuleContext(ExplicitInstantiationContext.class,0);
		}
		public ExplicitSpecializationContext explicitSpecialization() {
			return getRuleContext(ExplicitSpecializationContext.class,0);
		}
		public LinkageSpecificationContext linkageSpecification() {
			return getRuleContext(LinkageSpecificationContext.class,0);
		}
		public NamespaceDefinitionContext namespaceDefinition() {
			return getRuleContext(NamespaceDefinitionContext.class,0);
		}
		public EmptyDeclarationContext emptyDeclaration() {
			return getRuleContext(EmptyDeclarationContext.class,0);
		}
		public AttributeDeclarationContext attributeDeclaration() {
			return getRuleContext(AttributeDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declaration);
		try {
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(983);
				blockDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(985);
				templateDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(986);
				explicitInstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(987);
				explicitSpecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(988);
				linkageSpecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(989);
				namespaceDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(990);
				emptyDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(991);
				attributeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockDeclarationContext extends ParserRuleContext {
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public AsmDefinitionContext asmDefinition() {
			return getRuleContext(AsmDefinitionContext.class,0);
		}
		public NamespaceAliasDefinitionContext namespaceAliasDefinition() {
			return getRuleContext(NamespaceAliasDefinitionContext.class,0);
		}
		public UsingDeclarationContext usingDeclaration() {
			return getRuleContext(UsingDeclarationContext.class,0);
		}
		public UsingDirectiveContext usingDirective() {
			return getRuleContext(UsingDirectiveContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public AliasDeclarationContext aliasDeclaration() {
			return getRuleContext(AliasDeclarationContext.class,0);
		}
		public OpaqueEnumDeclarationContext opaqueEnumDeclaration() {
			return getRuleContext(OpaqueEnumDeclarationContext.class,0);
		}
		public BlockDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterBlockDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitBlockDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitBlockDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockDeclarationContext blockDeclaration() throws RecognitionException {
		BlockDeclarationContext _localctx = new BlockDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_blockDeclaration);
		try {
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				asmDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(996);
				namespaceAliasDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(997);
				usingDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(998);
				usingDirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(999);
				staticAssertDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1000);
				aliasDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1001);
				opaqueEnumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasDeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP17Parser.Using, 0); }
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(CPP17Parser.Assign, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP17Parser.Semi, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public AliasDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAliasDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAliasDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAliasDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasDeclarationContext aliasDeclaration() throws RecognitionException {
		AliasDeclarationContext _localctx = new AliasDeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_aliasDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(Using);
			setState(1005);
			match(Identifier);
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1006);
				attributeSpecifierSeq();
				}
			}

			setState(1009);
			match(Assign);
			setState(1010);
			theTypeId();
			setState(1011);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleDeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPP17Parser.Semi, 0); }
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public SimpleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterSimpleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitSimpleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitSimpleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDeclarationContext simpleDeclaration() throws RecognitionException {
		SimpleDeclarationContext _localctx = new SimpleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_simpleDeclaration);
		int _la;
		try {
			setState(1027);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Thread_local:
			case Typedef:
			case Typename_:
			case Union:
			case Unsigned:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1014);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(1013);
					declSpecifierSeq();
					}
					break;
				}
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Operator || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 215512868999425L) != 0)) {
					{
					setState(1016);
					initDeclaratorList();
					}
				}

				setState(1019);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				attributeSpecifierSeq();
				setState(1022);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(1021);
					declSpecifierSeq();
					}
					break;
				}
				setState(1024);
				initDeclaratorList();
				setState(1025);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public TerminalNode Static_assert() { return getToken(CPP17Parser.Static_assert, 0); }
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP17Parser.Comma, 0); }
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CPP17Parser.Semi, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CPP17Parser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CPP17Parser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterStaticAssertDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitStaticAssertDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitStaticAssertDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			match(Static_assert);
			setState(1030);
			match(LeftParen);
			setState(1031);
			constantExpression();
			setState(1032);
			match(Comma);
			setState(1034); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1033);
				match(StringLiteral);
				}
				}
				setState(1036); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(1038);
			match(RightParen);
			setState(1039);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyDeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPP17Parser.Semi, 0); }
		public EmptyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterEmptyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitEmptyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitEmptyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyDeclarationContext emptyDeclaration() throws RecognitionException {
		EmptyDeclarationContext _localctx = new EmptyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_emptyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeDeclarationContext extends ParserRuleContext {
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP17Parser.Semi, 0); }
		public AttributeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAttributeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAttributeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAttributeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeDeclarationContext attributeDeclaration() throws RecognitionException {
		AttributeDeclarationContext _localctx = new AttributeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_attributeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			attributeSpecifierSeq();
			setState(1044);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public TerminalNode Friend() { return getToken(CPP17Parser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(CPP17Parser.Typedef, 0); }
		public TerminalNode Constexpr() { return getToken(CPP17Parser.Constexpr, 0); }
		public DeclSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterDeclSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitDeclSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitDeclSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclSpecifierContext declSpecifier() throws RecognitionException {
		DeclSpecifierContext _localctx = new DeclSpecifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_declSpecifier);
		try {
			setState(1052);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1046);
				storageClassSpecifier();
				}
				break;
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename_:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047);
				typeSpecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1048);
				functionSpecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1049);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1050);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1051);
				match(Constexpr);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclSpecifierSeqContext extends ParserRuleContext {
		public List<DeclSpecifierContext> declSpecifier() {
			return getRuleContexts(DeclSpecifierContext.class);
		}
		public DeclSpecifierContext declSpecifier(int i) {
			return getRuleContext(DeclSpecifierContext.class,i);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterDeclSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitDeclSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitDeclSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclSpecifierSeqContext declSpecifierSeq() throws RecognitionException {
		DeclSpecifierSeqContext _localctx = new DeclSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1055); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(1054);
					declSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1057); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1059);
				attributeSpecifierSeq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Register() { return getToken(CPP17Parser.Register, 0); }
		public TerminalNode Static() { return getToken(CPP17Parser.Static, 0); }
		public TerminalNode Thread_local() { return getToken(CPP17Parser.Thread_local, 0); }
		public TerminalNode Extern() { return getToken(CPP17Parser.Extern, 0); }
		public TerminalNode Mutable() { return getToken(CPP17Parser.Mutable, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitStorageClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			_la = _input.LA(1);
			if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 17316186113L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionSpecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(CPP17Parser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(CPP17Parser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(CPP17Parser.Explicit, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterFunctionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitFunctionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitFunctionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_functionSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			_la = _input.LA(1);
			if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 70368744178689L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTypedefName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTypedefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecifierContext extends ParserRuleContext {
		public TrailingTypeSpecifierContext trailingTypeSpecifier() {
			return getRuleContext(TrailingTypeSpecifierContext.class,0);
		}
		public ClassSpecifierContext classSpecifier() {
			return getRuleContext(ClassSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_typeSpecifier);
		try {
			setState(1071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1068);
				trailingTypeSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1069);
				classSpecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1070);
				enumSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrailingTypeSpecifierContext extends ParserRuleContext {
		public SimpleTypeSpecifierContext simpleTypeSpecifier() {
			return getRuleContext(SimpleTypeSpecifierContext.class,0);
		}
		public ElaboratedTypeSpecifierContext elaboratedTypeSpecifier() {
			return getRuleContext(ElaboratedTypeSpecifierContext.class,0);
		}
		public TypeNameSpecifierContext typeNameSpecifier() {
			return getRuleContext(TypeNameSpecifierContext.class,0);
		}
		public CvQualifierContext cvQualifier() {
			return getRuleContext(CvQualifierContext.class,0);
		}
		public TrailingTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTrailingTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTrailingTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTrailingTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingTypeSpecifierContext trailingTypeSpecifier() throws RecognitionException {
		TrailingTypeSpecifierContext _localctx = new TrailingTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_trailingTypeSpecifier);
		try {
			setState(1077);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Decltype:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1073);
				simpleTypeSpecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				elaboratedTypeSpecifier();
				}
				break;
			case Typename_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1075);
				typeNameSpecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1076);
				cvQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecifierSeqContext extends ParserRuleContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TypeSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTypeSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTypeSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTypeSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierSeqContext typeSpecifierSeq() throws RecognitionException {
		TypeSpecifierSeqContext _localctx = new TypeSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_typeSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1080); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1079);
					typeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1082); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1084);
				attributeSpecifierSeq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrailingTypeSpecifierSeqContext extends ParserRuleContext {
		public List<TrailingTypeSpecifierContext> trailingTypeSpecifier() {
			return getRuleContexts(TrailingTypeSpecifierContext.class);
		}
		public TrailingTypeSpecifierContext trailingTypeSpecifier(int i) {
			return getRuleContext(TrailingTypeSpecifierContext.class,i);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TrailingTypeSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingTypeSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTrailingTypeSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTrailingTypeSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTrailingTypeSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingTypeSpecifierSeqContext trailingTypeSpecifierSeq() throws RecognitionException {
		TrailingTypeSpecifierSeqContext _localctx = new TrailingTypeSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_trailingTypeSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1088); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1087);
					trailingTypeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1090); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1092);
				attributeSpecifierSeq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTypeLengthModifierContext extends ParserRuleContext {
		public TerminalNode Short() { return getToken(CPP17Parser.Short, 0); }
		public TerminalNode Long() { return getToken(CPP17Parser.Long, 0); }
		public SimpleTypeLengthModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeLengthModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterSimpleTypeLengthModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitSimpleTypeLengthModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitSimpleTypeLengthModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeLengthModifierContext simpleTypeLengthModifier() throws RecognitionException {
		SimpleTypeLengthModifierContext _localctx = new SimpleTypeLengthModifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_simpleTypeLengthModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			_la = _input.LA(1);
			if ( !(_la==Long || _la==Short) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTypeSignednessModifierContext extends ParserRuleContext {
		public TerminalNode Unsigned() { return getToken(CPP17Parser.Unsigned, 0); }
		public TerminalNode Signed() { return getToken(CPP17Parser.Signed, 0); }
		public SimpleTypeSignednessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeSignednessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterSimpleTypeSignednessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitSimpleTypeSignednessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitSimpleTypeSignednessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeSignednessModifierContext simpleTypeSignednessModifier() throws RecognitionException {
		SimpleTypeSignednessModifierContext _localctx = new SimpleTypeSignednessModifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_simpleTypeSignednessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			_la = _input.LA(1);
			if ( !(_la==Signed || _la==Unsigned) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTypeSpecifierContext extends ParserRuleContext {
		public TheTypeNameContext theTypeName() {
			return getRuleContext(TheTypeNameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP17Parser.Template, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public SimpleTypeSignednessModifierContext simpleTypeSignednessModifier() {
			return getRuleContext(SimpleTypeSignednessModifierContext.class,0);
		}
		public List<SimpleTypeLengthModifierContext> simpleTypeLengthModifier() {
			return getRuleContexts(SimpleTypeLengthModifierContext.class);
		}
		public SimpleTypeLengthModifierContext simpleTypeLengthModifier(int i) {
			return getRuleContext(SimpleTypeLengthModifierContext.class,i);
		}
		public TerminalNode Char() { return getToken(CPP17Parser.Char, 0); }
		public TerminalNode Char16() { return getToken(CPP17Parser.Char16, 0); }
		public TerminalNode Char32() { return getToken(CPP17Parser.Char32, 0); }
		public TerminalNode Wchar() { return getToken(CPP17Parser.Wchar, 0); }
		public TerminalNode Bool() { return getToken(CPP17Parser.Bool, 0); }
		public TerminalNode Int() { return getToken(CPP17Parser.Int, 0); }
		public TerminalNode Float() { return getToken(CPP17Parser.Float, 0); }
		public TerminalNode Double() { return getToken(CPP17Parser.Double, 0); }
		public TerminalNode Void() { return getToken(CPP17Parser.Void, 0); }
		public TerminalNode Auto() { return getToken(CPP17Parser.Auto, 0); }
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public SimpleTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterSimpleTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitSimpleTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitSimpleTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeSpecifierContext simpleTypeSpecifier() throws RecognitionException {
		SimpleTypeSpecifierContext _localctx = new SimpleTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_simpleTypeSpecifier);
		int _la;
		try {
			int _alt;
			setState(1151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1099);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1102);
				theTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1103);
				nestedNameSpecifier(0);
				setState(1104);
				match(Template);
				setState(1105);
				simpleTemplateId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Signed || _la==Unsigned) {
					{
					setState(1107);
					simpleTypeSignednessModifier();
					}
				}

				setState(1111); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1110);
						simpleTypeLengthModifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1113); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Signed || _la==Unsigned) {
					{
					setState(1115);
					simpleTypeSignednessModifier();
					}
				}

				setState(1118);
				match(Char);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Signed || _la==Unsigned) {
					{
					setState(1119);
					simpleTypeSignednessModifier();
					}
				}

				setState(1122);
				match(Char16);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Signed || _la==Unsigned) {
					{
					setState(1123);
					simpleTypeSignednessModifier();
					}
				}

				setState(1126);
				match(Char32);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Signed || _la==Unsigned) {
					{
					setState(1127);
					simpleTypeSignednessModifier();
					}
				}

				setState(1130);
				match(Wchar);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1131);
				match(Bool);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Signed || _la==Unsigned) {
					{
					setState(1132);
					simpleTypeSignednessModifier();
					}
				}

				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Long || _la==Short) {
					{
					{
					setState(1135);
					simpleTypeLengthModifier();
					}
					}
					setState(1140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1141);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1142);
				simpleTypeSignednessModifier();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1143);
				match(Float);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Long || _la==Short) {
					{
					setState(1144);
					simpleTypeLengthModifier();
					}
				}

				setState(1147);
				match(Double);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1148);
				match(Void);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1149);
				match(Auto);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1150);
				decltypeSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TheTypeNameContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TheTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTheTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTheTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTheTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheTypeNameContext theTypeName() throws RecognitionException {
		TheTypeNameContext _localctx = new TheTypeNameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_theTypeName);
		try {
			setState(1157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1153);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154);
				enumName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1155);
				typedefName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1156);
				simpleTemplateId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecltypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Decltype() { return getToken(CPP17Parser.Decltype, 0); }
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Auto() { return getToken(CPP17Parser.Auto, 0); }
		public DecltypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterDecltypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitDecltypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitDecltypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecltypeSpecifierContext decltypeSpecifier() throws RecognitionException {
		DecltypeSpecifierContext _localctx = new DecltypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_decltypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			match(Decltype);
			setState(1160);
			match(LeftParen);
			setState(1163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1161);
				expression();
				}
				break;
			case 2:
				{
				setState(1162);
				match(Auto);
				}
				break;
			}
			setState(1165);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElaboratedTypeSpecifierContext extends ParserRuleContext {
		public ClassKeyContext classKey() {
			return getRuleContext(ClassKeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP17Parser.Template, 0); }
		public TerminalNode Enum() { return getToken(CPP17Parser.Enum, 0); }
		public ElaboratedTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterElaboratedTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitElaboratedTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitElaboratedTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElaboratedTypeSpecifierContext elaboratedTypeSpecifier() throws RecognitionException {
		ElaboratedTypeSpecifierContext _localctx = new ElaboratedTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_elaboratedTypeSpecifier);
		int _la;
		try {
			setState(1189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Struct:
				enterOuterAlt(_localctx, 1);
				{
				setState(1167);
				classKey();
				setState(1182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1169);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Alignas || _la==LeftBracket) {
						{
						setState(1168);
						attributeSpecifierSeq();
						}
					}

					setState(1172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
					case 1:
						{
						setState(1171);
						nestedNameSpecifier(0);
						}
						break;
					}
					setState(1174);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(1175);
					simpleTemplateId();
					}
					break;
				case 3:
					{
					setState(1176);
					nestedNameSpecifier(0);
					setState(1178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Template) {
						{
						setState(1177);
						match(Template);
						}
					}

					setState(1180);
					simpleTemplateId();
					}
					break;
				}
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 2);
				{
				setState(1184);
				match(Enum);
				setState(1186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1185);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1188);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitEnumName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitEnumName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumSpecifierContext extends ParserRuleContext {
		public EnumHeadContext enumHead() {
			return getRuleContext(EnumHeadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CPP17Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPP17Parser.RightBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP17Parser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitEnumSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_enumSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			enumHead();
			setState(1194);
			match(LeftBrace);
			setState(1199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1195);
				enumeratorList();
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1196);
					match(Comma);
					}
				}

				}
			}

			setState(1201);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumHeadContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public EnumHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterEnumHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitEnumHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitEnumHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumHeadContext enumHead() throws RecognitionException {
		EnumHeadContext _localctx = new EnumHeadContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_enumHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			enumkey();
			setState(1205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1204);
				attributeSpecifierSeq();
				}
			}

			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
				{
				setState(1208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1207);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1210);
				match(Identifier);
				}
			}

			setState(1214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1213);
				enumbase();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpaqueEnumDeclarationContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(CPP17Parser.Semi, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public OpaqueEnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueEnumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterOpaqueEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitOpaqueEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitOpaqueEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpaqueEnumDeclarationContext opaqueEnumDeclaration() throws RecognitionException {
		OpaqueEnumDeclarationContext _localctx = new OpaqueEnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_opaqueEnumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			enumkey();
			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1217);
				attributeSpecifierSeq();
				}
			}

			setState(1220);
			match(Identifier);
			setState(1222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1221);
				enumbase();
				}
			}

			setState(1224);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumkeyContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(CPP17Parser.Enum, 0); }
		public TerminalNode Class() { return getToken(CPP17Parser.Class, 0); }
		public TerminalNode Struct() { return getToken(CPP17Parser.Struct, 0); }
		public EnumkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterEnumkey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitEnumkey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitEnumkey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumkeyContext enumkey() throws RecognitionException {
		EnumkeyContext _localctx = new EnumkeyContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_enumkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			match(Enum);
			setState(1228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Class || _la==Struct) {
				{
				setState(1227);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==Struct) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumbaseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CPP17Parser.Colon, 0); }
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public EnumbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterEnumbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitEnumbase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitEnumbase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumbaseContext enumbase() throws RecognitionException {
		EnumbaseContext _localctx = new EnumbaseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			match(Colon);
			setState(1231);
			typeSpecifierSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorDefinitionContext> enumeratorDefinition() {
			return getRuleContexts(EnumeratorDefinitionContext.class);
		}
		public EnumeratorDefinitionContext enumeratorDefinition(int i) {
			return getRuleContext(EnumeratorDefinitionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPP17Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPP17Parser.Comma, i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitEnumeratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			enumeratorDefinition();
			setState(1238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1234);
					match(Comma);
					setState(1235);
					enumeratorDefinition();
					}
					} 
				}
				setState(1240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumeratorDefinitionContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPP17Parser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterEnumeratorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitEnumeratorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitEnumeratorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorDefinitionContext enumeratorDefinition() throws RecognitionException {
		EnumeratorDefinitionContext _localctx = new EnumeratorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_enumeratorDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			enumerator();
			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1242);
				match(Assign);
				setState(1243);
				constantExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceNameContext extends ParserRuleContext {
		public OriginalNamespaceNameContext originalNamespaceName() {
			return getRuleContext(OriginalNamespaceNameContext.class,0);
		}
		public NamespaceAliasContext namespaceAlias() {
			return getRuleContext(NamespaceAliasContext.class,0);
		}
		public NamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitNamespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceNameContext namespaceName() throws RecognitionException {
		NamespaceNameContext _localctx = new NamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_namespaceName);
		try {
			setState(1250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1248);
				originalNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1249);
				namespaceAlias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OriginalNamespaceNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public OriginalNamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalNamespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterOriginalNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitOriginalNamespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitOriginalNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginalNamespaceNameContext originalNamespaceName() throws RecognitionException {
		OriginalNamespaceNameContext _localctx = new OriginalNamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_originalNamespaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceDefinitionContext extends ParserRuleContext {
		public DeclarationseqContext namespaceBody;
		public TerminalNode Namespace() { return getToken(CPP17Parser.Namespace, 0); }
		public TerminalNode LeftBrace() { return getToken(CPP17Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPP17Parser.RightBrace, 0); }
		public TerminalNode Inline() { return getToken(CPP17Parser.Inline, 0); }
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public OriginalNamespaceNameContext originalNamespaceName() {
			return getRuleContext(OriginalNamespaceNameContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public NamespaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterNamespaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitNamespaceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitNamespaceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDefinitionContext namespaceDefinition() throws RecognitionException {
		NamespaceDefinitionContext _localctx = new NamespaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_namespaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1254);
				match(Inline);
				}
			}

			setState(1257);
			match(Namespace);
			setState(1260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1258);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1259);
				originalNamespaceName();
				}
				break;
			}
			setState(1262);
			match(LeftBrace);
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 1543754443169808157L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 459384754220313597L) != 0)) {
				{
				setState(1263);
				((NamespaceDefinitionContext)_localctx).namespaceBody = declarationseq();
				}
			}

			setState(1266);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceAliasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public NamespaceAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterNamespaceAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitNamespaceAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitNamespaceAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceAliasContext namespaceAlias() throws RecognitionException {
		NamespaceAliasContext _localctx = new NamespaceAliasContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_namespaceAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceAliasDefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP17Parser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(CPP17Parser.Assign, 0); }
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP17Parser.Semi, 0); }
		public NamespaceAliasDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceAliasDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterNamespaceAliasDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitNamespaceAliasDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitNamespaceAliasDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceAliasDefinitionContext namespaceAliasDefinition() throws RecognitionException {
		NamespaceAliasDefinitionContext _localctx = new NamespaceAliasDefinitionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_namespaceAliasDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			match(Namespace);
			setState(1271);
			match(Identifier);
			setState(1272);
			match(Assign);
			setState(1273);
			qualifiednamespacespecifier();
			setState(1274);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiednamespacespecifierContext extends ParserRuleContext {
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public QualifiednamespacespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiednamespacespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterQualifiednamespacespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitQualifiednamespacespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitQualifiednamespacespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1276);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1279);
			namespaceName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UsingDeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP17Parser.Using, 0); }
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP17Parser.Semi, 0); }
		public TerminalNode Doublecolon() { return getToken(CPP17Parser.Doublecolon, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Typename_() { return getToken(CPP17Parser.Typename_, 0); }
		public UsingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterUsingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitUsingDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitUsingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingDeclarationContext usingDeclaration() throws RecognitionException {
		UsingDeclarationContext _localctx = new UsingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_usingDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			match(Using);
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				{
				setState(1283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Typename_) {
					{
					setState(1282);
					match(Typename_);
					}
				}

				setState(1285);
				nestedNameSpecifier(0);
				}
				}
				break;
			case 2:
				{
				setState(1286);
				match(Doublecolon);
				}
				break;
			}
			setState(1289);
			unqualifiedId();
			setState(1290);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UsingDirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP17Parser.Using, 0); }
		public TerminalNode Namespace() { return getToken(CPP17Parser.Namespace, 0); }
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP17Parser.Semi, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public UsingDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterUsingDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitUsingDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitUsingDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingDirectiveContext usingDirective() throws RecognitionException {
		UsingDirectiveContext _localctx = new UsingDirectiveContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_usingDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1292);
				attributeSpecifierSeq();
				}
			}

			setState(1295);
			match(Using);
			setState(1296);
			match(Namespace);
			setState(1298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1297);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1300);
			namespaceName();
			setState(1301);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsmDefinitionContext extends ParserRuleContext {
		public TerminalNode Asm() { return getToken(CPP17Parser.Asm, 0); }
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CPP17Parser.Semi, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CPP17Parser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CPP17Parser.StringLiteral, i);
		}
		public AsmDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAsmDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAsmDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAsmDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmDefinitionContext asmDefinition() throws RecognitionException {
		AsmDefinitionContext _localctx = new AsmDefinitionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_asmDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			match(Asm);
			setState(1304);
			match(LeftParen);
			setState(1306); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1305);
				match(StringLiteral);
				}
				}
				setState(1308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(1310);
			match(RightParen);
			setState(1311);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LinkageSpecificationContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(CPP17Parser.Extern, 0); }
		public TerminalNode StringLiteral() { return getToken(CPP17Parser.StringLiteral, 0); }
		public TerminalNode LeftBrace() { return getToken(CPP17Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPP17Parser.RightBrace, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public LinkageSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkageSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterLinkageSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitLinkageSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitLinkageSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkageSpecificationContext linkageSpecification() throws RecognitionException {
		LinkageSpecificationContext _localctx = new LinkageSpecificationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_linkageSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
			match(Extern);
			setState(1314);
			match(StringLiteral);
			setState(1321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				{
				setState(1315);
				match(LeftBrace);
				setState(1317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 1543754443169808157L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 459384754220313597L) != 0)) {
					{
					setState(1316);
					declarationseq();
					}
				}

				setState(1319);
				match(RightBrace);
				}
				break;
			case Alignas:
			case Asm:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Namespace:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Static_assert:
			case Struct:
			case Template:
			case Thread_local:
			case Typedef:
			case Typename_:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				{
				setState(1320);
				declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeSpecifierSeqContext extends ParserRuleContext {
		public List<AttributeSpecifierContext> attributeSpecifier() {
			return getRuleContexts(AttributeSpecifierContext.class);
		}
		public AttributeSpecifierContext attributeSpecifier(int i) {
			return getRuleContext(AttributeSpecifierContext.class,i);
		}
		public AttributeSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAttributeSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAttributeSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAttributeSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecifierSeqContext attributeSpecifierSeq() throws RecognitionException {
		AttributeSpecifierSeqContext _localctx = new AttributeSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_attributeSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1324); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1323);
					attributeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1326); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> LeftBracket() { return getTokens(CPP17Parser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(CPP17Parser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(CPP17Parser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(CPP17Parser.RightBracket, i);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public AlignmentspecifierContext alignmentspecifier() {
			return getRuleContext(AlignmentspecifierContext.class,0);
		}
		public AttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAttributeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAttributeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecifierContext attributeSpecifier() throws RecognitionException {
		AttributeSpecifierContext _localctx = new AttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_attributeSpecifier);
		int _la;
		try {
			setState(1336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1328);
				match(LeftBracket);
				setState(1329);
				match(LeftBracket);
				setState(1331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1330);
					attributeList();
					}
				}

				setState(1333);
				match(RightBracket);
				setState(1334);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1335);
				alignmentspecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlignmentspecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(CPP17Parser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP17Parser.Ellipsis, 0); }
		public AlignmentspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAlignmentspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAlignmentspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAlignmentspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentspecifierContext alignmentspecifier() throws RecognitionException {
		AlignmentspecifierContext _localctx = new AlignmentspecifierContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_alignmentspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			match(Alignas);
			setState(1339);
			match(LeftParen);
			setState(1342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1340);
				theTypeId();
				}
				break;
			case 2:
				{
				setState(1341);
				constantExpression();
				}
				break;
			}
			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1344);
				match(Ellipsis);
				}
			}

			setState(1347);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeListContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPP17Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPP17Parser.Comma, i);
		}
		public TerminalNode Ellipsis() { return getToken(CPP17Parser.Ellipsis, 0); }
		public AttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			attribute();
			setState(1354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1350);
				match(Comma);
				setState(1351);
				attribute();
				}
				}
				setState(1356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1357);
				match(Ellipsis);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public AttributeNamespaceContext attributeNamespace() {
			return getRuleContext(AttributeNamespaceContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(CPP17Parser.Doublecolon, 0); }
		public AttributeArgumentClauseContext attributeArgumentClause() {
			return getRuleContext(AttributeArgumentClauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1360);
				attributeNamespace();
				setState(1361);
				match(Doublecolon);
				}
				break;
			}
			setState(1365);
			match(Identifier);
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(1366);
				attributeArgumentClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeNamespaceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public AttributeNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAttributeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAttributeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAttributeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNamespaceContext attributeNamespace() throws RecognitionException {
		AttributeNamespaceContext _localctx = new AttributeNamespaceContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_attributeNamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeArgumentClauseContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public BalancedTokenSeqContext balancedTokenSeq() {
			return getRuleContext(BalancedTokenSeqContext.class,0);
		}
		public AttributeArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAttributeArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAttributeArgumentClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAttributeArgumentClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeArgumentClauseContext attributeArgumentClause() throws RecognitionException {
		AttributeArgumentClauseContext _localctx = new AttributeArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_attributeArgumentClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			match(LeftParen);
			setState(1373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -176160769L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 524287L) != 0)) {
				{
				setState(1372);
				balancedTokenSeq();
				}
			}

			setState(1375);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BalancedTokenSeqContext extends ParserRuleContext {
		public List<BalancedtokenContext> balancedtoken() {
			return getRuleContexts(BalancedtokenContext.class);
		}
		public BalancedtokenContext balancedtoken(int i) {
			return getRuleContext(BalancedtokenContext.class,i);
		}
		public BalancedTokenSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedTokenSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterBalancedTokenSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitBalancedTokenSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitBalancedTokenSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BalancedTokenSeqContext balancedTokenSeq() throws RecognitionException {
		BalancedTokenSeqContext _localctx = new BalancedTokenSeqContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_balancedTokenSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1377);
				balancedtoken();
				}
				}
				setState(1380); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -176160769L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 524287L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BalancedtokenContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(CPP17Parser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CPP17Parser.LeftParen, i);
		}
		public BalancedTokenSeqContext balancedTokenSeq() {
			return getRuleContext(BalancedTokenSeqContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(CPP17Parser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CPP17Parser.RightParen, i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(CPP17Parser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(CPP17Parser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(CPP17Parser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(CPP17Parser.RightBracket, i);
		}
		public List<TerminalNode> LeftBrace() { return getTokens(CPP17Parser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(CPP17Parser.LeftBrace, i);
		}
		public List<TerminalNode> RightBrace() { return getTokens(CPP17Parser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(CPP17Parser.RightBrace, i);
		}
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterBalancedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitBalancedtoken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitBalancedtoken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_balancedtoken);
		int _la;
		try {
			int _alt;
			setState(1399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1382);
				match(LeftParen);
				setState(1383);
				balancedTokenSeq();
				setState(1384);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1386);
				match(LeftBracket);
				setState(1387);
				balancedTokenSeq();
				setState(1388);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1390);
				match(LeftBrace);
				setState(1391);
				balancedTokenSeq();
				setState(1392);
				match(RightBrace);
				}
				break;
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case PointerLiteral:
			case UserDefinedLiteral:
			case MultiLineMacro:
			case AsmArea:
			case Directive:
			case Alignas:
			case Alignof:
			case Asm:
			case Auto:
			case Bool:
			case Break:
			case Case:
			case Catch:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Const_cast:
			case Continue:
			case Decltype:
			case Default:
			case Delete:
			case Do:
			case Double:
			case Dynamic_cast:
			case Else:
			case Enum:
			case Explicit:
			case Export:
			case Extern:
			case False_:
			case Final:
			case Float:
			case For:
			case Friend:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Namespace:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Override:
			case Private:
			case Protected:
			case Public:
			case Register:
			case Reinterpret_cast:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Static_assert:
			case Static_cast:
			case Struct:
			case Switch:
			case Template:
			case This:
			case Thread_local:
			case Throw:
			case True_:
			case Try:
			case Typedef:
			case Typeid_:
			case Typename_:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case While:
			case Plus:
			case Minus:
			case Star:
			case Div:
			case Mod:
			case Caret:
			case And:
			case Or:
			case Tilde:
			case Not:
			case Assign:
			case Less:
			case Greater:
			case PlusAssign:
			case MinusAssign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case XorAssign:
			case AndAssign:
			case OrAssign:
			case LeftShiftAssign:
			case RightShiftAssign:
			case Equal:
			case NotEqual:
			case LessEqual:
			case GreaterEqual:
			case AndAnd:
			case OrOr:
			case PlusPlus:
			case MinusMinus:
			case Comma:
			case ArrowStar:
			case Arrow:
			case Question:
			case Colon:
			case Doublecolon:
			case Semi:
			case Dot:
			case DotStar:
			case Ellipsis:
			case Identifier:
			case DecimalLiteral:
			case OctalLiteral:
			case HexadecimalLiteral:
			case BinaryLiteral:
			case Integersuffix:
			case UserDefinedIntegerLiteral:
			case UserDefinedFloatingLiteral:
			case UserDefinedStringLiteral:
			case UserDefinedCharacterLiteral:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 4);
				{
				setState(1395); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1394);
						_la = _input.LA(1);
						if ( _la <= 0 || (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1397); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPP17Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPP17Parser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			initDeclarator();
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1402);
				match(Comma);
				setState(1403);
				initDeclarator();
				}
				}
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			declarator();
			setState(1411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 65553L) != 0)) {
				{
				setState(1410);
				initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaratorContext extends ParserRuleContext {
		public PointerDeclaratorContext pointerDeclarator() {
			return getRuleContext(PointerDeclaratorContext.class,0);
		}
		public NoPointerDeclaratorContext noPointerDeclarator() {
			return getRuleContext(NoPointerDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TrailingReturnTypeContext trailingReturnType() {
			return getRuleContext(TrailingReturnTypeContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_declarator);
		try {
			setState(1418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1413);
				pointerDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1414);
				noPointerDeclarator(0);
				setState(1415);
				parametersAndQualifiers();
				setState(1416);
				trailingReturnType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointerDeclaratorContext extends ParserRuleContext {
		public NoPointerDeclaratorContext noPointerDeclarator() {
			return getRuleContext(NoPointerDeclaratorContext.class,0);
		}
		public List<PointerOperatorContext> pointerOperator() {
			return getRuleContexts(PointerOperatorContext.class);
		}
		public PointerOperatorContext pointerOperator(int i) {
			return getRuleContext(PointerOperatorContext.class,i);
		}
		public List<TerminalNode> Const() { return getTokens(CPP17Parser.Const); }
		public TerminalNode Const(int i) {
			return getToken(CPP17Parser.Const, i);
		}
		public PointerDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterPointerDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitPointerDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitPointerDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerDeclaratorContext pointerDeclarator() throws RecognitionException {
		PointerDeclaratorContext _localctx = new PointerDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_pointerDeclarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1420);
					pointerOperator();
					setState(1422);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Const) {
						{
						setState(1421);
						match(Const);
						}
					}

					}
					} 
				}
				setState(1428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			setState(1429);
			noPointerDeclarator(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoPointerDeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public PointerDeclaratorContext pointerDeclarator() {
			return getRuleContext(PointerDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public NoPointerDeclaratorContext noPointerDeclarator() {
			return getRuleContext(NoPointerDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPP17Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP17Parser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public NoPointerDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterNoPointerDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitNoPointerDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitNoPointerDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoPointerDeclaratorContext noPointerDeclarator() throws RecognitionException {
		return noPointerDeclarator(0);
	}

	private NoPointerDeclaratorContext noPointerDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoPointerDeclaratorContext _localctx = new NoPointerDeclaratorContext(_ctx, _parentState);
		NoPointerDeclaratorContext _prevctx = _localctx;
		int _startState = 230;
		enterRecursionRule(_localctx, 230, RULE_noPointerDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1432);
				declaratorid();
				setState(1434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1433);
					attributeSpecifierSeq();
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1436);
				match(LeftParen);
				setState(1437);
				pointerDeclarator();
				setState(1438);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerDeclarator);
					setState(1442);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1452);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LeftParen:
						{
						setState(1443);
						parametersAndQualifiers();
						}
						break;
					case LeftBracket:
						{
						setState(1444);
						match(LeftBracket);
						setState(1446);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1716785145040023298L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4719772474384133137L) != 0) || _la==Identifier) {
							{
							setState(1445);
							constantExpression();
							}
						}

						setState(1448);
						match(RightBracket);
						setState(1450);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
						case 1:
							{
							setState(1449);
							attributeSpecifierSeq();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersAndQualifiersContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public ParameterDeclarationClauseContext parameterDeclarationClause() {
			return getRuleContext(ParameterDeclarationClauseContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public RefqualifierContext refqualifier() {
			return getRuleContext(RefqualifierContext.class,0);
		}
		public ExceptionSpecificationContext exceptionSpecification() {
			return getRuleContext(ExceptionSpecificationContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public ParametersAndQualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersAndQualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterParametersAndQualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitParametersAndQualifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitParametersAndQualifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersAndQualifiersContext parametersAndQualifiers() throws RecognitionException {
		ParametersAndQualifiersContext _localctx = new ParametersAndQualifiersContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_parametersAndQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			match(LeftParen);
			setState(1461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 1237504995584196377L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 441352763482317789L) != 0)) {
				{
				setState(1460);
				parameterDeclarationClause();
				}
			}

			setState(1463);
			match(RightParen);
			setState(1465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1464);
				cvqualifierseq();
				}
				break;
			}
			setState(1468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1467);
				refqualifier();
				}
				break;
			}
			setState(1471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1470);
				exceptionSpecification();
				}
				break;
			}
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1473);
				attributeSpecifierSeq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrailingReturnTypeContext extends ParserRuleContext {
		public TerminalNode Arrow() { return getToken(CPP17Parser.Arrow, 0); }
		public TrailingTypeSpecifierSeqContext trailingTypeSpecifierSeq() {
			return getRuleContext(TrailingTypeSpecifierSeqContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TrailingReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTrailingReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTrailingReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTrailingReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingReturnTypeContext trailingReturnType() throws RecognitionException {
		TrailingReturnTypeContext _localctx = new TrailingReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_trailingReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			match(Arrow);
			setState(1477);
			trailingTypeSpecifierSeq();
			setState(1479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1478);
				abstractDeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointerOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CPP17Parser.And, 0); }
		public TerminalNode AndAnd() { return getToken(CPP17Parser.AndAnd, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Star() { return getToken(CPP17Parser.Star, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public PointerOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterPointerOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitPointerOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitPointerOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerOperatorContext pointerOperator() throws RecognitionException {
		PointerOperatorContext _localctx = new PointerOperatorContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_pointerOperator);
		int _la;
		try {
			setState(1495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And:
			case AndAnd:
				enterOuterAlt(_localctx, 1);
				{
				setState(1481);
				_la = _input.LA(1);
				if ( !(_la==And || _la==AndAnd) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1482);
					attributeSpecifierSeq();
					}
					break;
				}
				}
				break;
			case Decltype:
			case Star:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(1485);
					nestedNameSpecifier(0);
					}
				}

				setState(1488);
				match(Star);
				setState(1490);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1489);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(1493);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1492);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CvqualifierseqContext extends ParserRuleContext {
		public List<CvQualifierContext> cvQualifier() {
			return getRuleContexts(CvQualifierContext.class);
		}
		public CvQualifierContext cvQualifier(int i) {
			return getRuleContext(CvQualifierContext.class,i);
		}
		public CvqualifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterCvqualifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitCvqualifierseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitCvqualifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_cvqualifierseq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1498); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1497);
					cvQualifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1500); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CvQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(CPP17Parser.Const, 0); }
		public TerminalNode Volatile() { return getToken(CPP17Parser.Volatile, 0); }
		public CvQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterCvQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitCvQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitCvQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvQualifierContext cvQualifier() throws RecognitionException {
		CvQualifierContext _localctx = new CvQualifierContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_cvQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==Volatile) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RefqualifierContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CPP17Parser.And, 0); }
		public TerminalNode AndAnd() { return getToken(CPP17Parser.AndAnd, 0); }
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterRefqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitRefqualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitRefqualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			_la = _input.LA(1);
			if ( !(_la==And || _la==AndAnd) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaratoridContext extends ParserRuleContext {
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP17Parser.Ellipsis, 0); }
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterDeclaratorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitDeclaratorid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitDeclaratorid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1506);
				match(Ellipsis);
				}
			}

			setState(1509);
			idExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TheTypeIdContext extends ParserRuleContext {
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TheTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTheTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTheTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTheTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheTypeIdContext theTypeId() throws RecognitionException {
		TheTypeIdContext _localctx = new TheTypeIdContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_theTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1511);
			typeSpecifierSeq();
			setState(1513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1512);
				abstractDeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerAbstractDeclaratorContext pointerAbstractDeclarator() {
			return getRuleContext(PointerAbstractDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TrailingReturnTypeContext trailingReturnType() {
			return getRuleContext(TrailingReturnTypeContext.class,0);
		}
		public NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator() {
			return getRuleContext(NoPointerAbstractDeclaratorContext.class,0);
		}
		public AbstractPackDeclaratorContext abstractPackDeclarator() {
			return getRuleContext(AbstractPackDeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_abstractDeclarator);
		try {
			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1515);
				pointerAbstractDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1517);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1516);
					noPointerAbstractDeclarator(0);
					}
					break;
				}
				setState(1519);
				parametersAndQualifiers();
				setState(1520);
				trailingReturnType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1522);
				abstractPackDeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointerAbstractDeclaratorContext extends ParserRuleContext {
		public NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator() {
			return getRuleContext(NoPointerAbstractDeclaratorContext.class,0);
		}
		public List<PointerOperatorContext> pointerOperator() {
			return getRuleContexts(PointerOperatorContext.class);
		}
		public PointerOperatorContext pointerOperator(int i) {
			return getRuleContext(PointerOperatorContext.class,i);
		}
		public PointerAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterPointerAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitPointerAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitPointerAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerAbstractDeclaratorContext pointerAbstractDeclarator() throws RecognitionException {
		PointerAbstractDeclaratorContext _localctx = new PointerAbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_pointerAbstractDeclarator);
		int _la;
		try {
			setState(1534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1525);
				noPointerAbstractDeclarator(0);
				}
				break;
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1527); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1526);
					pointerOperator();
					}
					}
					setState(1529); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Decltype || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 566969237521L) != 0) );
				setState(1532);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1531);
					noPointerAbstractDeclarator(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoPointerAbstractDeclaratorContext extends ParserRuleContext {
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPP17Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP17Parser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public PointerAbstractDeclaratorContext pointerAbstractDeclarator() {
			return getRuleContext(PointerAbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public List<NoPointerAbstractDeclaratorContext> noPointerAbstractDeclarator() {
			return getRuleContexts(NoPointerAbstractDeclaratorContext.class);
		}
		public NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator(int i) {
			return getRuleContext(NoPointerAbstractDeclaratorContext.class,i);
		}
		public NoPointerAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterNoPointerAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitNoPointerAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitNoPointerAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator() throws RecognitionException {
		return noPointerAbstractDeclarator(0);
	}

	private NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoPointerAbstractDeclaratorContext _localctx = new NoPointerAbstractDeclaratorContext(_ctx, _parentState);
		NoPointerAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 252;
		enterRecursionRule(_localctx, 252, RULE_noPointerAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1537);
				parametersAndQualifiers();
				}
				break;
			case 2:
				{
				setState(1538);
				match(LeftBracket);
				setState(1540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1716785145040023298L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4719772474384133137L) != 0) || _la==Identifier) {
					{
					setState(1539);
					constantExpression();
					}
				}

				setState(1542);
				match(RightBracket);
				setState(1544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1543);
					attributeSpecifierSeq();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1546);
				match(LeftParen);
				setState(1547);
				pointerAbstractDeclarator();
				setState(1548);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerAbstractDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerAbstractDeclarator);
					setState(1552);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(1563);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
					case 1:
						{
						setState(1553);
						parametersAndQualifiers();
						}
						break;
					case 2:
						{
						setState(1554);
						noPointerAbstractDeclarator(0);
						setState(1555);
						match(LeftBracket);
						setState(1557);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1716785145040023298L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4719772474384133137L) != 0) || _la==Identifier) {
							{
							setState(1556);
							constantExpression();
							}
						}

						setState(1559);
						match(RightBracket);
						setState(1561);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
						case 1:
							{
							setState(1560);
							attributeSpecifierSeq();
							}
							break;
						}
						}
						break;
					}
					}
					} 
				}
				setState(1569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AbstractPackDeclaratorContext extends ParserRuleContext {
		public NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator() {
			return getRuleContext(NoPointerAbstractPackDeclaratorContext.class,0);
		}
		public List<PointerOperatorContext> pointerOperator() {
			return getRuleContexts(PointerOperatorContext.class);
		}
		public PointerOperatorContext pointerOperator(int i) {
			return getRuleContext(PointerOperatorContext.class,i);
		}
		public AbstractPackDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractPackDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAbstractPackDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAbstractPackDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAbstractPackDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractPackDeclaratorContext abstractPackDeclarator() throws RecognitionException {
		AbstractPackDeclaratorContext _localctx = new AbstractPackDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_abstractPackDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Decltype || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 566969237521L) != 0)) {
				{
				{
				setState(1570);
				pointerOperator();
				}
				}
				setState(1575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1576);
			noPointerAbstractPackDeclarator(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoPointerAbstractPackDeclaratorContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(CPP17Parser.Ellipsis, 0); }
		public NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator() {
			return getRuleContext(NoPointerAbstractPackDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPP17Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP17Parser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public NoPointerAbstractPackDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerAbstractPackDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterNoPointerAbstractPackDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitNoPointerAbstractPackDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitNoPointerAbstractPackDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator() throws RecognitionException {
		return noPointerAbstractPackDeclarator(0);
	}

	private NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoPointerAbstractPackDeclaratorContext _localctx = new NoPointerAbstractPackDeclaratorContext(_ctx, _parentState);
		NoPointerAbstractPackDeclaratorContext _prevctx = _localctx;
		int _startState = 256;
		enterRecursionRule(_localctx, 256, RULE_noPointerAbstractPackDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1579);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1595);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerAbstractPackDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerAbstractPackDeclarator);
					setState(1581);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1591);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LeftParen:
						{
						setState(1582);
						parametersAndQualifiers();
						}
						break;
					case LeftBracket:
						{
						setState(1583);
						match(LeftBracket);
						setState(1585);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1716785145040023298L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4719772474384133137L) != 0) || _la==Identifier) {
							{
							setState(1584);
							constantExpression();
							}
						}

						setState(1587);
						match(RightBracket);
						setState(1589);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
						case 1:
							{
							setState(1588);
							attributeSpecifierSeq();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1597);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationClauseContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(CPP17Parser.Ellipsis, 0); }
		public ParameterDeclarationListContext parameterDeclarationList() {
			return getRuleContext(ParameterDeclarationListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP17Parser.Comma, 0); }
		public ParameterDeclarationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterParameterDeclarationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitParameterDeclarationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitParameterDeclarationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationClauseContext parameterDeclarationClause() throws RecognitionException {
		ParameterDeclarationClauseContext _localctx = new ParameterDeclarationClauseContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_parameterDeclarationClause);
		int _la;
		try {
			setState(1606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1598);
				match(Ellipsis);
				}
				break;
			case Alignas:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Thread_local:
			case Typedef:
			case Typename_:
			case Union:
			case Unsigned:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftBracket:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1599);
				parameterDeclarationList();
				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma || _la==Ellipsis) {
					{
					setState(1601);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1600);
						match(Comma);
						}
					}

					setState(1603);
					match(Ellipsis);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPP17Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPP17Parser.Comma, i);
		}
		public ParameterDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterParameterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitParameterDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitParameterDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationListContext parameterDeclarationList() throws RecognitionException {
		ParameterDeclarationListContext _localctx = new ParameterDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_parameterDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			parameterDeclaration();
			setState(1613);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1609);
					match(Comma);
					setState(1610);
					parameterDeclaration();
					}
					} 
				}
				setState(1615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPP17Parser.Assign, 0); }
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1616);
				attributeSpecifierSeq();
				}
			}

			setState(1619);
			declSpecifierSeq();
			{
			setState(1624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1620);
				declarator();
				}
				break;
			case 2:
				{
				setState(1622);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1621);
					abstractDeclarator();
					}
					break;
				}
				}
				break;
			}
			setState(1628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1626);
				match(Assign);
				setState(1627);
				initializerClause();
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public VirtualSpecifierSeqContext virtualSpecifierSeq() {
			return getRuleContext(VirtualSpecifierSeqContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1630);
				attributeSpecifierSeq();
				}
			}

			setState(1634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1633);
				declSpecifierSeq();
				}
				break;
			}
			setState(1636);
			declarator();
			setState(1638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(1637);
				virtualSpecifierSeq();
				}
			}

			setState(1640);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ConstructorInitializerContext constructorInitializer() {
			return getRuleContext(ConstructorInitializerContext.class,0);
		}
		public FunctionTryBlockContext functionTryBlock() {
			return getRuleContext(FunctionTryBlockContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPP17Parser.Assign, 0); }
		public TerminalNode Semi() { return getToken(CPP17Parser.Semi, 0); }
		public TerminalNode Default() { return getToken(CPP17Parser.Default, 0); }
		public TerminalNode Delete() { return getToken(CPP17Parser.Delete, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_functionBody);
		int _la;
		try {
			setState(1650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Colon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1642);
					constructorInitializer();
					}
				}

				setState(1645);
				compoundStatement();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 2);
				{
				setState(1646);
				functionTryBlock();
				}
				break;
			case Assign:
				enterOuterAlt(_localctx, 3);
				{
				setState(1647);
				match(Assign);
				setState(1648);
				_la = _input.LA(1);
				if ( !(_la==Default || _la==Delete) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1649);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerContext extends ParserRuleContext {
		public BraceOrEqualInitializerContext braceOrEqualInitializer() {
			return getRuleContext(BraceOrEqualInitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_initializer);
		try {
			setState(1657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1652);
				braceOrEqualInitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1653);
				match(LeftParen);
				setState(1654);
				expressionList();
				setState(1655);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BraceOrEqualInitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(CPP17Parser.Assign, 0); }
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public BraceOrEqualInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceOrEqualInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterBraceOrEqualInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitBraceOrEqualInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitBraceOrEqualInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BraceOrEqualInitializerContext braceOrEqualInitializer() throws RecognitionException {
		BraceOrEqualInitializerContext _localctx = new BraceOrEqualInitializerContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_braceOrEqualInitializer);
		try {
			setState(1662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1659);
				match(Assign);
				setState(1660);
				initializerClause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1661);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerClauseContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public InitializerClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterInitializerClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitInitializerClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitInitializerClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerClauseContext initializerClause() throws RecognitionException {
		InitializerClauseContext _localctx = new InitializerClauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_initializerClause);
		try {
			setState(1666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case PointerLiteral:
			case UserDefinedLiteral:
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case Typeid_:
			case Typename_:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1664);
				assignmentExpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1665);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerClauseContext> initializerClause() {
			return getRuleContexts(InitializerClauseContext.class);
		}
		public InitializerClauseContext initializerClause(int i) {
			return getRuleContext(InitializerClauseContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(CPP17Parser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(CPP17Parser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPP17Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPP17Parser.Comma, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			initializerClause();
			setState(1670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1669);
				match(Ellipsis);
				}
			}

			setState(1679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1672);
					match(Comma);
					setState(1673);
					initializerClause();
					setState(1675);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ellipsis) {
						{
						setState(1674);
						match(Ellipsis);
						}
					}

					}
					} 
				}
				setState(1681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BracedInitListContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CPP17Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPP17Parser.RightBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP17Parser.Comma, 0); }
		public BracedInitListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedInitList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterBracedInitList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitBracedInitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitBracedInitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracedInitListContext bracedInitList() throws RecognitionException {
		BracedInitListContext _localctx = new BracedInitListContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_bracedInitList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			match(LeftBrace);
			setState(1687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1716785145040023298L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4719772474400910417L) != 0) || _la==Identifier) {
				{
				setState(1683);
				initializerList();
				setState(1685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1684);
					match(Comma);
					}
				}

				}
			}

			setState(1689);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_className);
		try {
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1691);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1692);
				simpleTemplateId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassSpecifierContext extends ParserRuleContext {
		public ClassHeadContext classHead() {
			return getRuleContext(ClassHeadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CPP17Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPP17Parser.RightBrace, 0); }
		public MemberSpecificationContext memberSpecification() {
			return getRuleContext(MemberSpecificationContext.class,0);
		}
		public ClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSpecifierContext classSpecifier() throws RecognitionException {
		ClassSpecifierContext _localctx = new ClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_classSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			classHead();
			setState(1696);
			match(LeftBrace);
			setState(1698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 1543877313594212121L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 463888353847684093L) != 0)) {
				{
				setState(1697);
				memberSpecification();
				}
			}

			setState(1700);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassHeadContext extends ParserRuleContext {
		public ClassKeyContext classKey() {
			return getRuleContext(ClassKeyContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public ClassHeadNameContext classHeadName() {
			return getRuleContext(ClassHeadNameContext.class,0);
		}
		public BaseClauseContext baseClause() {
			return getRuleContext(BaseClauseContext.class,0);
		}
		public ClassVirtSpecifierContext classVirtSpecifier() {
			return getRuleContext(ClassVirtSpecifierContext.class,0);
		}
		public TerminalNode Union() { return getToken(CPP17Parser.Union, 0); }
		public ClassHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterClassHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitClassHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitClassHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeadContext classHead() throws RecognitionException {
		ClassHeadContext _localctx = new ClassHeadContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_classHead);
		int _la;
		try {
			setState(1725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Struct:
				enterOuterAlt(_localctx, 1);
				{
				setState(1702);
				classKey();
				setState(1704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1703);
					attributeSpecifierSeq();
					}
				}

				setState(1710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(1706);
					classHeadName();
					setState(1708);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(1707);
						classVirtSpecifier();
						}
					}

					}
				}

				setState(1713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1712);
					baseClause();
					}
				}

				}
				break;
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1715);
				match(Union);
				setState(1717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1716);
					attributeSpecifierSeq();
					}
				}

				setState(1723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(1719);
					classHeadName();
					setState(1721);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(1720);
						classVirtSpecifier();
						}
					}

					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassHeadNameContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public ClassHeadNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHeadName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterClassHeadName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitClassHeadName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitClassHeadName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeadNameContext classHeadName() throws RecognitionException {
		ClassHeadNameContext _localctx = new ClassHeadNameContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_classHeadName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1727);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1730);
			className();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassVirtSpecifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(CPP17Parser.Final, 0); }
		public ClassVirtSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVirtSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterClassVirtSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitClassVirtSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitClassVirtSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVirtSpecifierContext classVirtSpecifier() throws RecognitionException {
		ClassVirtSpecifierContext _localctx = new ClassVirtSpecifierContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_classVirtSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			match(Final);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassKeyContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(CPP17Parser.Class, 0); }
		public TerminalNode Struct() { return getToken(CPP17Parser.Struct, 0); }
		public ClassKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterClassKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitClassKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitClassKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassKeyContext classKey() throws RecognitionException {
		ClassKeyContext _localctx = new ClassKeyContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_classKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1734);
			_la = _input.LA(1);
			if ( !(_la==Class || _la==Struct) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberSpecificationContext extends ParserRuleContext {
		public List<MemberdeclarationContext> memberdeclaration() {
			return getRuleContexts(MemberdeclarationContext.class);
		}
		public MemberdeclarationContext memberdeclaration(int i) {
			return getRuleContext(MemberdeclarationContext.class,i);
		}
		public List<AccessSpecifierContext> accessSpecifier() {
			return getRuleContexts(AccessSpecifierContext.class);
		}
		public AccessSpecifierContext accessSpecifier(int i) {
			return getRuleContext(AccessSpecifierContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(CPP17Parser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(CPP17Parser.Colon, i);
		}
		public MemberSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterMemberSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitMemberSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitMemberSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberSpecificationContext memberSpecification() throws RecognitionException {
		MemberSpecificationContext _localctx = new MemberSpecificationContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_memberSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1740);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Alignas:
				case Auto:
				case Bool:
				case Char:
				case Char16:
				case Char32:
				case Class:
				case Const:
				case Constexpr:
				case Decltype:
				case Double:
				case Enum:
				case Explicit:
				case Extern:
				case Float:
				case Friend:
				case Inline:
				case Int:
				case Long:
				case Mutable:
				case Operator:
				case Register:
				case Short:
				case Signed:
				case Static:
				case Static_assert:
				case Struct:
				case Template:
				case Thread_local:
				case Typedef:
				case Typename_:
				case Union:
				case Unsigned:
				case Using:
				case Virtual:
				case Void:
				case Volatile:
				case Wchar:
				case LeftParen:
				case LeftBracket:
				case Star:
				case And:
				case Tilde:
				case AndAnd:
				case Colon:
				case Doublecolon:
				case Semi:
				case Ellipsis:
				case Identifier:
					{
					setState(1736);
					memberdeclaration();
					}
					break;
				case Private:
				case Protected:
				case Public:
					{
					setState(1737);
					accessSpecifier();
					setState(1738);
					match(Colon);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1742); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 1543877313594212121L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 463888353847684093L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberdeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPP17Parser.Semi, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public MemberDeclaratorListContext memberDeclaratorList() {
			return getRuleContext(MemberDeclaratorListContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public UsingDeclarationContext usingDeclaration() {
			return getRuleContext(UsingDeclarationContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public AliasDeclarationContext aliasDeclaration() {
			return getRuleContext(AliasDeclarationContext.class,0);
		}
		public EmptyDeclarationContext emptyDeclaration() {
			return getRuleContext(EmptyDeclarationContext.class,0);
		}
		public MemberdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterMemberdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitMemberdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitMemberdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_memberdeclaration);
		int _la;
		try {
			setState(1760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1745);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1744);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(1748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(1747);
					declSpecifierSeq();
					}
					break;
				}
				setState(1751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007199388960768L) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 217711892254981L) != 0)) {
					{
					setState(1750);
					memberDeclaratorList();
					}
				}

				setState(1753);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1754);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1755);
				usingDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1756);
				staticAssertDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1757);
				templateDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1758);
				aliasDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1759);
				emptyDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberDeclaratorListContext extends ParserRuleContext {
		public List<MemberDeclaratorContext> memberDeclarator() {
			return getRuleContexts(MemberDeclaratorContext.class);
		}
		public MemberDeclaratorContext memberDeclarator(int i) {
			return getRuleContext(MemberDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPP17Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPP17Parser.Comma, i);
		}
		public MemberDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterMemberDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitMemberDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitMemberDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclaratorListContext memberDeclaratorList() throws RecognitionException {
		MemberDeclaratorListContext _localctx = new MemberDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_memberDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			memberDeclarator();
			setState(1767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1763);
				match(Comma);
				setState(1764);
				memberDeclarator();
				}
				}
				setState(1769);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public VirtualSpecifierSeqContext virtualSpecifierSeq() {
			return getRuleContext(VirtualSpecifierSeqContext.class,0);
		}
		public BraceOrEqualInitializerContext braceOrEqualInitializer() {
			return getRuleContext(BraceOrEqualInitializerContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPP17Parser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public MemberDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterMemberDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitMemberDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitMemberDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclaratorContext memberDeclarator() throws RecognitionException {
		MemberDeclaratorContext _localctx = new MemberDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_memberDeclarator);
		int _la;
		try {
			setState(1785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1770);
				declarator();
				{
				setState(1772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Final || _la==Override) {
					{
					setState(1771);
					virtualSpecifierSeq();
					}
				}

				setState(1775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBrace || _la==Assign) {
					{
					setState(1774);
					braceOrEqualInitializer();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1777);
					match(Identifier);
					}
				}

				setState(1781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1780);
					attributeSpecifierSeq();
					}
				}

				setState(1783);
				match(Colon);
				setState(1784);
				constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VirtualSpecifierSeqContext extends ParserRuleContext {
		public List<VirtualSpecifierContext> virtualSpecifier() {
			return getRuleContexts(VirtualSpecifierContext.class);
		}
		public VirtualSpecifierContext virtualSpecifier(int i) {
			return getRuleContext(VirtualSpecifierContext.class,i);
		}
		public VirtualSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterVirtualSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitVirtualSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitVirtualSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtualSpecifierSeqContext virtualSpecifierSeq() throws RecognitionException {
		VirtualSpecifierSeqContext _localctx = new VirtualSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_virtualSpecifierSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1787);
				virtualSpecifier();
				}
				}
				setState(1790); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Final || _la==Override );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VirtualSpecifierContext extends ParserRuleContext {
		public TerminalNode Override() { return getToken(CPP17Parser.Override, 0); }
		public TerminalNode Final() { return getToken(CPP17Parser.Final, 0); }
		public VirtualSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterVirtualSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitVirtualSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitVirtualSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtualSpecifierContext virtualSpecifier() throws RecognitionException {
		VirtualSpecifierContext _localctx = new VirtualSpecifierContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_virtualSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1792);
			_la = _input.LA(1);
			if ( !(_la==Final || _la==Override) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PureSpecifierContext extends ParserRuleContext {
		public Token val;
		public TerminalNode Assign() { return getToken(CPP17Parser.Assign, 0); }
		public TerminalNode OctalLiteral() { return getToken(CPP17Parser.OctalLiteral, 0); }
		public PureSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterPureSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitPureSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitPureSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PureSpecifierContext pureSpecifier() throws RecognitionException {
		PureSpecifierContext _localctx = new PureSpecifierContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_pureSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			match(Assign);
			setState(1795);
			((PureSpecifierContext)_localctx).val = match(OctalLiteral);
			if((((PureSpecifierContext)_localctx).val!=null?((PureSpecifierContext)_localctx).val.getText():null).compareTo("0")!=0) throw new InputMismatchException(this);
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseClauseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CPP17Parser.Colon, 0); }
		public BaseSpecifierListContext baseSpecifierList() {
			return getRuleContext(BaseSpecifierListContext.class,0);
		}
		public BaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterBaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitBaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitBaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseClauseContext baseClause() throws RecognitionException {
		BaseClauseContext _localctx = new BaseClauseContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_baseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			match(Colon);
			setState(1799);
			baseSpecifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseSpecifierListContext extends ParserRuleContext {
		public List<BaseSpecifierContext> baseSpecifier() {
			return getRuleContexts(BaseSpecifierContext.class);
		}
		public BaseSpecifierContext baseSpecifier(int i) {
			return getRuleContext(BaseSpecifierContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(CPP17Parser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(CPP17Parser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPP17Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPP17Parser.Comma, i);
		}
		public BaseSpecifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseSpecifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterBaseSpecifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitBaseSpecifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitBaseSpecifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseSpecifierListContext baseSpecifierList() throws RecognitionException {
		BaseSpecifierListContext _localctx = new BaseSpecifierListContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_baseSpecifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801);
			baseSpecifier();
			setState(1803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1802);
				match(Ellipsis);
				}
			}

			setState(1812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1805);
				match(Comma);
				setState(1806);
				baseSpecifier();
				setState(1808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1807);
					match(Ellipsis);
					}
				}

				}
				}
				setState(1814);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseSpecifierContext extends ParserRuleContext {
		public BaseTypeSpecifierContext baseTypeSpecifier() {
			return getRuleContext(BaseTypeSpecifierContext.class,0);
		}
		public TerminalNode Virtual() { return getToken(CPP17Parser.Virtual, 0); }
		public AccessSpecifierContext accessSpecifier() {
			return getRuleContext(AccessSpecifierContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public BaseSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterBaseSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitBaseSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitBaseSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseSpecifierContext baseSpecifier() throws RecognitionException {
		BaseSpecifierContext _localctx = new BaseSpecifierContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_baseSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1815);
				attributeSpecifierSeq();
				}
			}

			setState(1830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Doublecolon:
			case Identifier:
				{
				setState(1818);
				baseTypeSpecifier();
				}
				break;
			case Virtual:
				{
				setState(1819);
				match(Virtual);
				setState(1821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 252201579132747776L) != 0)) {
					{
					setState(1820);
					accessSpecifier();
					}
				}

				setState(1823);
				baseTypeSpecifier();
				}
				break;
			case Private:
			case Protected:
			case Public:
				{
				setState(1824);
				accessSpecifier();
				setState(1826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(1825);
					match(Virtual);
					}
				}

				setState(1828);
				baseTypeSpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassOrDeclTypeContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public ClassOrDeclTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrDeclType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterClassOrDeclType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitClassOrDeclType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitClassOrDeclType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrDeclTypeContext classOrDeclType() throws RecognitionException {
		ClassOrDeclTypeContext _localctx = new ClassOrDeclTypeContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_classOrDeclType);
		try {
			setState(1837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1833);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(1832);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1835);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1836);
				decltypeSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseTypeSpecifierContext extends ParserRuleContext {
		public ClassOrDeclTypeContext classOrDeclType() {
			return getRuleContext(ClassOrDeclTypeContext.class,0);
		}
		public BaseTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterBaseTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitBaseTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitBaseTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeSpecifierContext baseTypeSpecifier() throws RecognitionException {
		BaseTypeSpecifierContext _localctx = new BaseTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_baseTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1839);
			classOrDeclType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessSpecifierContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(CPP17Parser.Private, 0); }
		public TerminalNode Protected() { return getToken(CPP17Parser.Protected, 0); }
		public TerminalNode Public() { return getToken(CPP17Parser.Public, 0); }
		public AccessSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterAccessSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitAccessSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitAccessSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessSpecifierContext accessSpecifier() throws RecognitionException {
		AccessSpecifierContext _localctx = new AccessSpecifierContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_accessSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1841);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 252201579132747776L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConversionFunctionIdContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP17Parser.Operator, 0); }
		public ConversionTypeIdContext conversionTypeId() {
			return getRuleContext(ConversionTypeIdContext.class,0);
		}
		public ConversionFunctionIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionFunctionId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterConversionFunctionId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitConversionFunctionId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitConversionFunctionId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionFunctionIdContext conversionFunctionId() throws RecognitionException {
		ConversionFunctionIdContext _localctx = new ConversionFunctionIdContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_conversionFunctionId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1843);
			match(Operator);
			setState(1844);
			conversionTypeId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConversionTypeIdContext extends ParserRuleContext {
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public ConversionDeclaratorContext conversionDeclarator() {
			return getRuleContext(ConversionDeclaratorContext.class,0);
		}
		public ConversionTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterConversionTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitConversionTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitConversionTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionTypeIdContext conversionTypeId() throws RecognitionException {
		ConversionTypeIdContext _localctx = new ConversionTypeIdContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_conversionTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
			typeSpecifierSeq();
			setState(1848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(1847);
				conversionDeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConversionDeclaratorContext extends ParserRuleContext {
		public PointerOperatorContext pointerOperator() {
			return getRuleContext(PointerOperatorContext.class,0);
		}
		public ConversionDeclaratorContext conversionDeclarator() {
			return getRuleContext(ConversionDeclaratorContext.class,0);
		}
		public ConversionDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterConversionDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitConversionDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitConversionDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionDeclaratorContext conversionDeclarator() throws RecognitionException {
		ConversionDeclaratorContext _localctx = new ConversionDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_conversionDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			pointerOperator();
			setState(1852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(1851);
				conversionDeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorInitializerContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CPP17Parser.Colon, 0); }
		public MemInitializerListContext memInitializerList() {
			return getRuleContext(MemInitializerListContext.class,0);
		}
		public ConstructorInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterConstructorInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitConstructorInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitConstructorInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorInitializerContext constructorInitializer() throws RecognitionException {
		ConstructorInitializerContext _localctx = new ConstructorInitializerContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_constructorInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			match(Colon);
			setState(1855);
			memInitializerList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemInitializerListContext extends ParserRuleContext {
		public List<MemInitializerContext> memInitializer() {
			return getRuleContexts(MemInitializerContext.class);
		}
		public MemInitializerContext memInitializer(int i) {
			return getRuleContext(MemInitializerContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(CPP17Parser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(CPP17Parser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPP17Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPP17Parser.Comma, i);
		}
		public MemInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterMemInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitMemInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitMemInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemInitializerListContext memInitializerList() throws RecognitionException {
		MemInitializerListContext _localctx = new MemInitializerListContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_memInitializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
			memInitializer();
			setState(1859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1858);
				match(Ellipsis);
				}
			}

			setState(1868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1861);
				match(Comma);
				setState(1862);
				memInitializer();
				setState(1864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1863);
					match(Ellipsis);
					}
				}

				}
				}
				setState(1870);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemInitializerContext extends ParserRuleContext {
		public MeminitializeridContext meminitializerid() {
			return getRuleContext(MeminitializeridContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MemInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterMemInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitMemInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitMemInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemInitializerContext memInitializer() throws RecognitionException {
		MemInitializerContext _localctx = new MemInitializerContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_memInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1871);
			meminitializerid();
			setState(1878);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				{
				setState(1872);
				match(LeftParen);
				setState(1874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1716785145040023298L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4719772474400910417L) != 0) || _la==Identifier) {
					{
					setState(1873);
					expressionList();
					}
				}

				setState(1876);
				match(RightParen);
				}
				break;
			case LeftBrace:
				{
				setState(1877);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MeminitializeridContext extends ParserRuleContext {
		public ClassOrDeclTypeContext classOrDeclType() {
			return getRuleContext(ClassOrDeclTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterMeminitializerid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitMeminitializerid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitMeminitializerid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_meminitializerid);
		try {
			setState(1882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1880);
				classOrDeclType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1881);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorFunctionIdContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP17Parser.Operator, 0); }
		public TheOperatorContext theOperator() {
			return getRuleContext(TheOperatorContext.class,0);
		}
		public OperatorFunctionIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorFunctionId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterOperatorFunctionId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitOperatorFunctionId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitOperatorFunctionId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorFunctionIdContext operatorFunctionId() throws RecognitionException {
		OperatorFunctionIdContext _localctx = new OperatorFunctionIdContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_operatorFunctionId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			match(Operator);
			setState(1885);
			theOperator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralOperatorIdContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP17Parser.Operator, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(CPP17Parser.StringLiteral, 0); }
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public LiteralOperatorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalOperatorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterLiteralOperatorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitLiteralOperatorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitLiteralOperatorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralOperatorIdContext literalOperatorId() throws RecognitionException {
		LiteralOperatorIdContext _localctx = new LiteralOperatorIdContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_literalOperatorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887);
			match(Operator);
			setState(1891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(1888);
				literal();
				}
				break;
			case 2:
				{
				setState(1889);
				match(StringLiteral);
				setState(1890);
				match(Identifier);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateDeclarationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP17Parser.Template, 0); }
		public TerminalNode Less() { return getToken(CPP17Parser.Less, 0); }
		public TemplateparameterListContext templateparameterList() {
			return getRuleContext(TemplateparameterListContext.class,0);
		}
		public TerminalNode Greater() { return getToken(CPP17Parser.Greater, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TemplateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTemplateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTemplateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTemplateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDeclarationContext templateDeclaration() throws RecognitionException {
		TemplateDeclarationContext _localctx = new TemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893);
			match(Template);
			setState(1894);
			match(Less);
			setState(1895);
			templateparameterList();
			setState(1896);
			match(Greater);
			setState(1897);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateparameterListContext extends ParserRuleContext {
		public List<TemplateParameterContext> templateParameter() {
			return getRuleContexts(TemplateParameterContext.class);
		}
		public TemplateParameterContext templateParameter(int i) {
			return getRuleContext(TemplateParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPP17Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPP17Parser.Comma, i);
		}
		public TemplateparameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTemplateparameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTemplateparameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTemplateparameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateparameterListContext templateparameterList() throws RecognitionException {
		TemplateparameterListContext _localctx = new TemplateparameterListContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_templateparameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
			templateParameter();
			setState(1904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1900);
				match(Comma);
				setState(1901);
				templateParameter();
				}
				}
				setState(1906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateParameterContext extends ParserRuleContext {
		public TypeParameterContext typeParameter() {
			return getRuleContext(TypeParameterContext.class,0);
		}
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public TemplateParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTemplateParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTemplateParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTemplateParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateParameterContext templateParameter() throws RecognitionException {
		TemplateParameterContext _localctx = new TemplateParameterContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_templateParameter);
		try {
			setState(1909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1907);
				typeParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1908);
				parameterDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(CPP17Parser.Class, 0); }
		public TerminalNode Typename_() { return getToken(CPP17Parser.Typename_, 0); }
		public TerminalNode Assign() { return getToken(CPP17Parser.Assign, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP17Parser.Template, 0); }
		public TerminalNode Less() { return getToken(CPP17Parser.Less, 0); }
		public TemplateparameterListContext templateparameterList() {
			return getRuleContext(TemplateparameterListContext.class,0);
		}
		public TerminalNode Greater() { return getToken(CPP17Parser.Greater, 0); }
		public TerminalNode Ellipsis() { return getToken(CPP17Parser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Template:
				{
				setState(1916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1911);
					match(Template);
					setState(1912);
					match(Less);
					setState(1913);
					templateparameterList();
					setState(1914);
					match(Greater);
					}
				}

				setState(1918);
				match(Class);
				}
				break;
			case Typename_:
				{
				setState(1919);
				match(Typename_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				{
				setState(1923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1922);
					match(Ellipsis);
					}
				}

				setState(1926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1925);
					match(Identifier);
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(1929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1928);
					match(Identifier);
					}
				}

				setState(1931);
				match(Assign);
				setState(1932);
				theTypeId();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTemplateIdContext extends ParserRuleContext {
		public TemplateNameContext templateName() {
			return getRuleContext(TemplateNameContext.class,0);
		}
		public TerminalNode Less() { return getToken(CPP17Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(CPP17Parser.Greater, 0); }
		public TemplateArgumentListContext templateArgumentList() {
			return getRuleContext(TemplateArgumentListContext.class,0);
		}
		public SimpleTemplateIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTemplateId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterSimpleTemplateId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitSimpleTemplateId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitSimpleTemplateId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTemplateIdContext simpleTemplateId() throws RecognitionException {
		SimpleTemplateIdContext _localctx = new SimpleTemplateIdContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_simpleTemplateId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1935);
			templateName();
			setState(1936);
			match(Less);
			setState(1938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1716785127847571202L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4719772474384268307L) != 0) || _la==Identifier) {
				{
				setState(1937);
				templateArgumentList();
				}
			}

			setState(1940);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateIdContext extends ParserRuleContext {
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TerminalNode Less() { return getToken(CPP17Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(CPP17Parser.Greater, 0); }
		public OperatorFunctionIdContext operatorFunctionId() {
			return getRuleContext(OperatorFunctionIdContext.class,0);
		}
		public LiteralOperatorIdContext literalOperatorId() {
			return getRuleContext(LiteralOperatorIdContext.class,0);
		}
		public TemplateArgumentListContext templateArgumentList() {
			return getRuleContext(TemplateArgumentListContext.class,0);
		}
		public TemplateIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTemplateId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTemplateId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTemplateId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateIdContext templateId() throws RecognitionException {
		TemplateIdContext _localctx = new TemplateIdContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_templateId);
		int _la;
		try {
			setState(1953);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1942);
				simpleTemplateId();
				}
				break;
			case Operator:
				enterOuterAlt(_localctx, 2);
				{
				setState(1945);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(1943);
					operatorFunctionId();
					}
					break;
				case 2:
					{
					setState(1944);
					literalOperatorId();
					}
					break;
				}
				setState(1947);
				match(Less);
				setState(1949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1716785127847571202L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4719772474384268307L) != 0) || _la==Identifier) {
					{
					setState(1948);
					templateArgumentList();
					}
				}

				setState(1951);
				match(Greater);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public TemplateNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTemplateName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTemplateName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTemplateName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateNameContext templateName() throws RecognitionException {
		TemplateNameContext _localctx = new TemplateNameContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_templateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateArgumentListContext extends ParserRuleContext {
		public List<TemplateArgumentContext> templateArgument() {
			return getRuleContexts(TemplateArgumentContext.class);
		}
		public TemplateArgumentContext templateArgument(int i) {
			return getRuleContext(TemplateArgumentContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(CPP17Parser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(CPP17Parser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPP17Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPP17Parser.Comma, i);
		}
		public TemplateArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTemplateArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTemplateArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTemplateArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateArgumentListContext templateArgumentList() throws RecognitionException {
		TemplateArgumentListContext _localctx = new TemplateArgumentListContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_templateArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			templateArgument();
			setState(1959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1958);
				match(Ellipsis);
				}
			}

			setState(1968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1961);
				match(Comma);
				setState(1962);
				templateArgument();
				setState(1964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1963);
					match(Ellipsis);
					}
				}

				}
				}
				setState(1970);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateArgumentContext extends ParserRuleContext {
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public TemplateArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTemplateArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTemplateArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTemplateArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateArgumentContext templateArgument() throws RecognitionException {
		TemplateArgumentContext _localctx = new TemplateArgumentContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_templateArgument);
		try {
			setState(1974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1971);
				theTypeId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1972);
				constantExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1973);
				idExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameSpecifierContext extends ParserRuleContext {
		public TerminalNode Typename_() { return getToken(CPP17Parser.Typename_, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP17Parser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP17Parser.Template, 0); }
		public TypeNameSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNameSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTypeNameSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTypeNameSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTypeNameSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameSpecifierContext typeNameSpecifier() throws RecognitionException {
		TypeNameSpecifierContext _localctx = new TypeNameSpecifierContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_typeNameSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1976);
			match(Typename_);
			setState(1977);
			nestedNameSpecifier(0);
			setState(1983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				{
				setState(1978);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1979);
					match(Template);
					}
				}

				setState(1982);
				simpleTemplateId();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplicitInstantiationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP17Parser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Extern() { return getToken(CPP17Parser.Extern, 0); }
		public ExplicitInstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitInstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterExplicitInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitExplicitInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitExplicitInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitInstantiationContext explicitInstantiation() throws RecognitionException {
		ExplicitInstantiationContext _localctx = new ExplicitInstantiationContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_explicitInstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(1985);
				match(Extern);
				}
			}

			setState(1988);
			match(Template);
			setState(1989);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplicitSpecializationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP17Parser.Template, 0); }
		public TerminalNode Less() { return getToken(CPP17Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(CPP17Parser.Greater, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitSpecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitSpecialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterExplicitSpecialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitExplicitSpecialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitExplicitSpecialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitSpecializationContext explicitSpecialization() throws RecognitionException {
		ExplicitSpecializationContext _localctx = new ExplicitSpecializationContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_explicitSpecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1991);
			match(Template);
			setState(1992);
			match(Less);
			setState(1993);
			match(Greater);
			setState(1994);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryBlockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(CPP17Parser.Try, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public HandlerSeqContext handlerSeq() {
			return getRuleContext(HandlerSeqContext.class,0);
		}
		public TryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryBlockContext tryBlock() throws RecognitionException {
		TryBlockContext _localctx = new TryBlockContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_tryBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1996);
			match(Try);
			setState(1997);
			compoundStatement();
			setState(1998);
			handlerSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTryBlockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(CPP17Parser.Try, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public HandlerSeqContext handlerSeq() {
			return getRuleContext(HandlerSeqContext.class,0);
		}
		public ConstructorInitializerContext constructorInitializer() {
			return getRuleContext(ConstructorInitializerContext.class,0);
		}
		public FunctionTryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterFunctionTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitFunctionTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitFunctionTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTryBlockContext functionTryBlock() throws RecognitionException {
		FunctionTryBlockContext _localctx = new FunctionTryBlockContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_functionTryBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			match(Try);
			setState(2002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2001);
				constructorInitializer();
				}
			}

			setState(2004);
			compoundStatement();
			setState(2005);
			handlerSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HandlerSeqContext extends ParserRuleContext {
		public List<HandlerContext> handler() {
			return getRuleContexts(HandlerContext.class);
		}
		public HandlerContext handler(int i) {
			return getRuleContext(HandlerContext.class,i);
		}
		public HandlerSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterHandlerSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitHandlerSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitHandlerSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerSeqContext handlerSeq() throws RecognitionException {
		HandlerSeqContext _localctx = new HandlerSeqContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_handlerSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2007);
				handler();
				}
				}
				setState(2010); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Catch );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HandlerContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(CPP17Parser.Catch, 0); }
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public ExceptionDeclarationContext exceptionDeclaration() {
			return getRuleContext(ExceptionDeclarationContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2012);
			match(Catch);
			setState(2013);
			match(LeftParen);
			setState(2014);
			exceptionDeclaration();
			setState(2015);
			match(RightParen);
			setState(2016);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExceptionDeclarationContext extends ParserRuleContext {
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP17Parser.Ellipsis, 0); }
		public ExceptionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterExceptionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitExceptionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitExceptionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionDeclarationContext exceptionDeclaration() throws RecognitionException {
		ExceptionDeclarationContext _localctx = new ExceptionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_exceptionDeclaration);
		int _la;
		try {
			setState(2027);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Alignas:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename_:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case LeftBracket:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2018);
					attributeSpecifierSeq();
					}
				}

				setState(2021);
				typeSpecifierSeq();
				setState(2024);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2022);
					declarator();
					}
					break;
				case 2:
					{
					setState(2023);
					abstractDeclarator();
					}
					break;
				}
				}
				break;
			case Ellipsis:
				enterOuterAlt(_localctx, 2);
				{
				setState(2026);
				match(Ellipsis);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowExpressionContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPP17Parser.Throw, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ThrowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterThrowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitThrowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitThrowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowExpressionContext throwExpression() throws RecognitionException {
		ThrowExpressionContext _localctx = new ThrowExpressionContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_throwExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2029);
			match(Throw);
			setState(2031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1716785145040023298L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4719772474384133201L) != 0) || _la==Identifier) {
				{
				setState(2030);
				assignmentExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExceptionSpecificationContext extends ParserRuleContext {
		public DynamicExceptionSpecificationContext dynamicExceptionSpecification() {
			return getRuleContext(DynamicExceptionSpecificationContext.class,0);
		}
		public NoeExceptSpecificationContext noeExceptSpecification() {
			return getRuleContext(NoeExceptSpecificationContext.class,0);
		}
		public ExceptionSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterExceptionSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitExceptionSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitExceptionSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionSpecificationContext exceptionSpecification() throws RecognitionException {
		ExceptionSpecificationContext _localctx = new ExceptionSpecificationContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_exceptionSpecification);
		try {
			setState(2035);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2033);
				dynamicExceptionSpecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2034);
				noeExceptSpecification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DynamicExceptionSpecificationContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPP17Parser.Throw, 0); }
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public TypeIdListContext typeIdList() {
			return getRuleContext(TypeIdListContext.class,0);
		}
		public DynamicExceptionSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicExceptionSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterDynamicExceptionSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitDynamicExceptionSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitDynamicExceptionSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicExceptionSpecificationContext dynamicExceptionSpecification() throws RecognitionException {
		DynamicExceptionSpecificationContext _localctx = new DynamicExceptionSpecificationContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_dynamicExceptionSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2037);
			match(Throw);
			setState(2038);
			match(LeftParen);
			setState(2040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & -9213942612181769245L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 37154696925806707L) != 0)) {
				{
				setState(2039);
				typeIdList();
				}
			}

			setState(2042);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeIdListContext extends ParserRuleContext {
		public List<TheTypeIdContext> theTypeId() {
			return getRuleContexts(TheTypeIdContext.class);
		}
		public TheTypeIdContext theTypeId(int i) {
			return getRuleContext(TheTypeIdContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(CPP17Parser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(CPP17Parser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPP17Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPP17Parser.Comma, i);
		}
		public TypeIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTypeIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTypeIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTypeIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdListContext typeIdList() throws RecognitionException {
		TypeIdListContext _localctx = new TypeIdListContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_typeIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2044);
			theTypeId();
			setState(2046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(2045);
				match(Ellipsis);
				}
			}

			setState(2055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(2048);
				match(Comma);
				setState(2049);
				theTypeId();
				setState(2051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2050);
					match(Ellipsis);
					}
				}

				}
				}
				setState(2057);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoeExceptSpecificationContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPP17Parser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public NoeExceptSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noeExceptSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterNoeExceptSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitNoeExceptSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitNoeExceptSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoeExceptSpecificationContext noeExceptSpecification() throws RecognitionException {
		NoeExceptSpecificationContext _localctx = new NoeExceptSpecificationContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_noeExceptSpecification);
		try {
			setState(2064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2058);
				match(Noexcept);
				setState(2059);
				match(LeftParen);
				setState(2060);
				constantExpression();
				setState(2061);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2063);
				match(Noexcept);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TheOperatorContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(CPP17Parser.New, 0); }
		public TerminalNode LeftBracket() { return getToken(CPP17Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP17Parser.RightBracket, 0); }
		public TerminalNode Delete() { return getToken(CPP17Parser.Delete, 0); }
		public TerminalNode Plus() { return getToken(CPP17Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CPP17Parser.Minus, 0); }
		public TerminalNode Star() { return getToken(CPP17Parser.Star, 0); }
		public TerminalNode Div() { return getToken(CPP17Parser.Div, 0); }
		public TerminalNode Mod() { return getToken(CPP17Parser.Mod, 0); }
		public TerminalNode Caret() { return getToken(CPP17Parser.Caret, 0); }
		public TerminalNode And() { return getToken(CPP17Parser.And, 0); }
		public TerminalNode Or() { return getToken(CPP17Parser.Or, 0); }
		public TerminalNode Tilde() { return getToken(CPP17Parser.Tilde, 0); }
		public TerminalNode Not() { return getToken(CPP17Parser.Not, 0); }
		public TerminalNode Assign() { return getToken(CPP17Parser.Assign, 0); }
		public List<TerminalNode> Greater() { return getTokens(CPP17Parser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(CPP17Parser.Greater, i);
		}
		public List<TerminalNode> Less() { return getTokens(CPP17Parser.Less); }
		public TerminalNode Less(int i) {
			return getToken(CPP17Parser.Less, i);
		}
		public TerminalNode GreaterEqual() { return getToken(CPP17Parser.GreaterEqual, 0); }
		public TerminalNode PlusAssign() { return getToken(CPP17Parser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(CPP17Parser.MinusAssign, 0); }
		public TerminalNode StarAssign() { return getToken(CPP17Parser.StarAssign, 0); }
		public TerminalNode ModAssign() { return getToken(CPP17Parser.ModAssign, 0); }
		public TerminalNode XorAssign() { return getToken(CPP17Parser.XorAssign, 0); }
		public TerminalNode AndAssign() { return getToken(CPP17Parser.AndAssign, 0); }
		public TerminalNode OrAssign() { return getToken(CPP17Parser.OrAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CPP17Parser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CPP17Parser.LeftShiftAssign, 0); }
		public TerminalNode Equal() { return getToken(CPP17Parser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(CPP17Parser.NotEqual, 0); }
		public TerminalNode LessEqual() { return getToken(CPP17Parser.LessEqual, 0); }
		public TerminalNode AndAnd() { return getToken(CPP17Parser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(CPP17Parser.OrOr, 0); }
		public TerminalNode PlusPlus() { return getToken(CPP17Parser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CPP17Parser.MinusMinus, 0); }
		public TerminalNode Comma() { return getToken(CPP17Parser.Comma, 0); }
		public TerminalNode ArrowStar() { return getToken(CPP17Parser.ArrowStar, 0); }
		public TerminalNode Arrow() { return getToken(CPP17Parser.Arrow, 0); }
		public TerminalNode LeftParen() { return getToken(CPP17Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP17Parser.RightParen, 0); }
		public TheOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterTheOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitTheOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitTheOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheOperatorContext theOperator() throws RecognitionException {
		TheOperatorContext _localctx = new TheOperatorContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_theOperator);
		try {
			setState(2117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2066);
				match(New);
				setState(2069);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
					setState(2067);
					match(LeftBracket);
					setState(2068);
					match(RightBracket);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2071);
				match(Delete);
				setState(2074);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					setState(2072);
					match(LeftBracket);
					setState(2073);
					match(RightBracket);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2076);
				match(Plus);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2077);
				match(Minus);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2078);
				match(Star);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2079);
				match(Div);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2080);
				match(Mod);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2081);
				match(Caret);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2082);
				match(And);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2083);
				match(Or);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2084);
				match(Tilde);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2085);
				match(Not);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2086);
				match(Assign);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2087);
				match(Greater);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2088);
				match(Less);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2089);
				match(GreaterEqual);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2090);
				match(PlusAssign);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2091);
				match(MinusAssign);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2092);
				match(StarAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2093);
				match(ModAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2094);
				match(XorAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2095);
				match(AndAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2096);
				match(OrAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2097);
				match(Less);
				setState(2098);
				match(Less);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2099);
				match(Greater);
				setState(2100);
				match(Greater);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2101);
				match(RightShiftAssign);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2102);
				match(LeftShiftAssign);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2103);
				match(Equal);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2104);
				match(NotEqual);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2105);
				match(LessEqual);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2106);
				match(AndAnd);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2107);
				match(OrOr);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2108);
				match(PlusPlus);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2109);
				match(MinusMinus);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2110);
				match(Comma);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2111);
				match(ArrowStar);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2112);
				match(Arrow);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2113);
				match(LeftParen);
				setState(2114);
				match(RightParen);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2115);
				match(LeftBracket);
				setState(2116);
				match(RightBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(CPP17Parser.IntegerLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(CPP17Parser.CharacterLiteral, 0); }
		public TerminalNode FloatingLiteral() { return getToken(CPP17Parser.FloatingLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(CPP17Parser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(CPP17Parser.BooleanLiteral, 0); }
		public TerminalNode PointerLiteral() { return getToken(CPP17Parser.PointerLiteral, 0); }
		public TerminalNode UserDefinedLiteral() { return getToken(CPP17Parser.UserDefinedLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP17ParserListener ) ((CPP17ParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP17ParserVisitor ) return ((CPP17ParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 254L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return nestedNameSpecifier_sempred((NestedNameSpecifierContext)_localctx, predIndex);
		case 15:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 25:
			return noPointerNewDeclarator_sempred((NoPointerNewDeclaratorContext)_localctx, predIndex);
		case 115:
			return noPointerDeclarator_sempred((NoPointerDeclaratorContext)_localctx, predIndex);
		case 126:
			return noPointerAbstractDeclarator_sempred((NoPointerAbstractDeclaratorContext)_localctx, predIndex);
		case 128:
			return noPointerAbstractPackDeclarator_sempred((NoPointerAbstractPackDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nestedNameSpecifier_sempred(NestedNameSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noPointerNewDeclarator_sempred(NoPointerNewDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noPointerDeclarator_sempred(NoPointerDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noPointerAbstractDeclarator_sempred(NoPointerAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean noPointerAbstractPackDeclarator_sempred(NoPointerAbstractPackDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0092\u084a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007"+
		"\u00b0\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007"+
		"\u00b3\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007"+
		"\u00b6\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007"+
		"\u00b9\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007"+
		"\u00bc\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0001\u0000\u0003"+
		"\u0000\u0180\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u0185"+
		"\b\u0001\u000b\u0001\f\u0001\u0186\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0190\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0194\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u019d\b\u0003\u0001\u0003\u0003\u0003\u01a0\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u01a4\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u01ac\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u01b3\b\u0005\u0001"+
		"\u0005\u0003\u0005\u01b6\b\u0005\u0001\u0005\u0005\u0005\u01b9\b\u0005"+
		"\n\u0005\f\u0005\u01bc\t\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u01c0"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u01c6"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u01ce\b\b\u0003\b\u01d0\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0005\n\u01d7\b\n\n\n\f\n\u01da\t\n\u0001\n\u0003\n\u01dd\b\n\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u01e1\b\u000b\u0001\f\u0003\f\u01e4\b\f\u0001"+
		"\f\u0001\f\u0003\f\u01e8\b\f\u0001\r\u0003\r\u01eb\b\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u01f2\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u01f6\b\u000e\u0001\u000e\u0003\u000e\u01f9\b"+
		"\u000e\u0001\u000e\u0003\u000e\u01fc\b\u000e\u0001\u000e\u0003\u000e\u01ff"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0205"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0209\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u020d\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u021b\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u021f\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0225\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u022c\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0232\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0236\b\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u023a\b"+
		"\u000f\n\u000f\f\u000f\u023d\t\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0003\u0012\u0244\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0249\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0256\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u025d\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0269\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0273\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0003\u0015\u0278\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u027c\b"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0283\b\u0015\u0001\u0015\u0003\u0015\u0286\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u028e\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0292\b\u0018\u0001"+
		"\u0018\u0003\u0018\u0295\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u029c\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u02a3\b\u0019\u0005\u0019\u02a5"+
		"\b\u0019\n\u0019\f\u0019\u02a8\t\u0019\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u02ac\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u02b0\b\u001a\u0001"+
		"\u001b\u0003\u001b\u02b3\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u02b8\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u02c3"+
		"\b\u001d\u0001\u001d\u0003\u001d\u02c6\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u02cd\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u02d2\b\u001e\n\u001e\f\u001e\u02d5"+
		"\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u02da\b\u001f"+
		"\n\u001f\f\u001f\u02dd\t\u001f\u0001 \u0001 \u0001 \u0005 \u02e2\b \n"+
		" \f \u02e5\t \u0001!\u0001!\u0001!\u0001!\u0005!\u02eb\b!\n!\f!\u02ee"+
		"\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02f4\b\"\u0001#\u0001#\u0001"+
		"#\u0005#\u02f9\b#\n#\f#\u02fc\t#\u0001$\u0001$\u0001$\u0005$\u0301\b$"+
		"\n$\f$\u0304\t$\u0001%\u0001%\u0001%\u0005%\u0309\b%\n%\f%\u030c\t%\u0001"+
		"&\u0001&\u0001&\u0005&\u0311\b&\n&\f&\u0314\t&\u0001\'\u0001\'\u0001\'"+
		"\u0005\'\u0319\b\'\n\'\f\'\u031c\t\'\u0001(\u0001(\u0001(\u0005(\u0321"+
		"\b(\n(\f(\u0324\t(\u0001)\u0001)\u0001)\u0005)\u0329\b)\n)\f)\u032c\t"+
		")\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0334\b*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u033c\b+\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0005-\u0343\b-\n-\f-\u0346\t-\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0003/\u034d\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0355"+
		"\b/\u0003/\u0357\b/\u00010\u00030\u035a\b0\u00010\u00010\u00010\u0001"+
		"0\u00030\u0360\b0\u00010\u00010\u00010\u00011\u00031\u0366\b1\u00011\u0001"+
		"1\u00012\u00012\u00032\u036c\b2\u00012\u00012\u00013\u00043\u0371\b3\u000b"+
		"3\f3\u0372\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u037c"+
		"\b4\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u0384\b4\u00015\u0001"+
		"5\u00035\u0388\b5\u00015\u00015\u00015\u00015\u00015\u00035\u038f\b5\u0003"+
		"5\u0391\b5\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0003"+
		"6\u03a5\b6\u00016\u00016\u00036\u03a9\b6\u00016\u00016\u00016\u00016\u0003"+
		"6\u03af\b6\u00016\u00016\u00016\u00036\u03b4\b6\u00017\u00017\u00037\u03b8"+
		"\b7\u00018\u00038\u03bb\b8\u00018\u00018\u00018\u00019\u00019\u00039\u03c2"+
		"\b9\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u03c9\b:\u0001:\u0001:\u0003"+
		":\u03cd\b:\u0001:\u0001:\u0001;\u0001;\u0001<\u0004<\u03d4\b<\u000b<\f"+
		"<\u03d5\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0003=\u03e1\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0003>\u03eb\b>\u0001?\u0001?\u0001?\u0003?\u03f0\b?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001@\u0003@\u03f7\b@\u0001@\u0003@\u03fa\b@\u0001@\u0001@\u0001"+
		"@\u0003@\u03ff\b@\u0001@\u0001@\u0001@\u0003@\u0404\b@\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0004A\u040b\bA\u000bA\fA\u040c\u0001A\u0001A\u0001A\u0001"+
		"B\u0001B\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0003D\u041d\bD\u0001E\u0004E\u0420\bE\u000bE\fE\u0421\u0001E\u0003"+
		"E\u0425\bE\u0001F\u0001F\u0001G\u0001G\u0001H\u0001H\u0001I\u0001I\u0001"+
		"I\u0003I\u0430\bI\u0001J\u0001J\u0001J\u0001J\u0003J\u0436\bJ\u0001K\u0004"+
		"K\u0439\bK\u000bK\fK\u043a\u0001K\u0003K\u043e\bK\u0001L\u0004L\u0441"+
		"\bL\u000bL\fL\u0442\u0001L\u0003L\u0446\bL\u0001M\u0001M\u0001N\u0001"+
		"N\u0001O\u0003O\u044d\bO\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0003"+
		"O\u0455\bO\u0001O\u0004O\u0458\bO\u000bO\fO\u0459\u0001O\u0003O\u045d"+
		"\bO\u0001O\u0001O\u0003O\u0461\bO\u0001O\u0001O\u0003O\u0465\bO\u0001"+
		"O\u0001O\u0003O\u0469\bO\u0001O\u0001O\u0001O\u0003O\u046e\bO\u0001O\u0005"+
		"O\u0471\bO\nO\fO\u0474\tO\u0001O\u0001O\u0001O\u0001O\u0003O\u047a\bO"+
		"\u0001O\u0001O\u0001O\u0001O\u0003O\u0480\bO\u0001P\u0001P\u0001P\u0001"+
		"P\u0003P\u0486\bP\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u048c\bQ\u0001Q\u0001"+
		"Q\u0001R\u0001R\u0003R\u0492\bR\u0001R\u0003R\u0495\bR\u0001R\u0001R\u0001"+
		"R\u0001R\u0003R\u049b\bR\u0001R\u0001R\u0003R\u049f\bR\u0001R\u0001R\u0003"+
		"R\u04a3\bR\u0001R\u0003R\u04a6\bR\u0001S\u0001S\u0001T\u0001T\u0001T\u0001"+
		"T\u0003T\u04ae\bT\u0003T\u04b0\bT\u0001T\u0001T\u0001U\u0001U\u0003U\u04b6"+
		"\bU\u0001U\u0003U\u04b9\bU\u0001U\u0003U\u04bc\bU\u0001U\u0003U\u04bf"+
		"\bU\u0001V\u0001V\u0003V\u04c3\bV\u0001V\u0001V\u0003V\u04c7\bV\u0001"+
		"V\u0001V\u0001W\u0001W\u0003W\u04cd\bW\u0001X\u0001X\u0001X\u0001Y\u0001"+
		"Y\u0001Y\u0005Y\u04d5\bY\nY\fY\u04d8\tY\u0001Z\u0001Z\u0001Z\u0003Z\u04dd"+
		"\bZ\u0001[\u0001[\u0001\\\u0001\\\u0003\\\u04e3\b\\\u0001]\u0001]\u0001"+
		"^\u0003^\u04e8\b^\u0001^\u0001^\u0001^\u0003^\u04ed\b^\u0001^\u0001^\u0003"+
		"^\u04f1\b^\u0001^\u0001^\u0001_\u0001_\u0001`\u0001`\u0001`\u0001`\u0001"+
		"`\u0001`\u0001a\u0003a\u04fe\ba\u0001a\u0001a\u0001b\u0001b\u0003b\u0504"+
		"\bb\u0001b\u0001b\u0003b\u0508\bb\u0001b\u0001b\u0001b\u0001c\u0003c\u050e"+
		"\bc\u0001c\u0001c\u0001c\u0003c\u0513\bc\u0001c\u0001c\u0001c\u0001d\u0001"+
		"d\u0001d\u0004d\u051b\bd\u000bd\fd\u051c\u0001d\u0001d\u0001d\u0001e\u0001"+
		"e\u0001e\u0001e\u0003e\u0526\be\u0001e\u0001e\u0003e\u052a\be\u0001f\u0004"+
		"f\u052d\bf\u000bf\ff\u052e\u0001g\u0001g\u0001g\u0003g\u0534\bg\u0001"+
		"g\u0001g\u0001g\u0003g\u0539\bg\u0001h\u0001h\u0001h\u0001h\u0003h\u053f"+
		"\bh\u0001h\u0003h\u0542\bh\u0001h\u0001h\u0001i\u0001i\u0001i\u0005i\u0549"+
		"\bi\ni\fi\u054c\ti\u0001i\u0003i\u054f\bi\u0001j\u0001j\u0001j\u0003j"+
		"\u0554\bj\u0001j\u0001j\u0003j\u0558\bj\u0001k\u0001k\u0001l\u0001l\u0003"+
		"l\u055e\bl\u0001l\u0001l\u0001m\u0004m\u0563\bm\u000bm\fm\u0564\u0001"+
		"n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001"+
		"n\u0001n\u0001n\u0004n\u0574\bn\u000bn\fn\u0575\u0003n\u0578\bn\u0001"+
		"o\u0001o\u0001o\u0005o\u057d\bo\no\fo\u0580\to\u0001p\u0001p\u0003p\u0584"+
		"\bp\u0001q\u0001q\u0001q\u0001q\u0001q\u0003q\u058b\bq\u0001r\u0001r\u0003"+
		"r\u058f\br\u0005r\u0591\br\nr\fr\u0594\tr\u0001r\u0001r\u0001s\u0001s"+
		"\u0001s\u0003s\u059b\bs\u0001s\u0001s\u0001s\u0001s\u0003s\u05a1\bs\u0001"+
		"s\u0001s\u0001s\u0001s\u0003s\u05a7\bs\u0001s\u0001s\u0003s\u05ab\bs\u0003"+
		"s\u05ad\bs\u0005s\u05af\bs\ns\fs\u05b2\ts\u0001t\u0001t\u0003t\u05b6\b"+
		"t\u0001t\u0001t\u0003t\u05ba\bt\u0001t\u0003t\u05bd\bt\u0001t\u0003t\u05c0"+
		"\bt\u0001t\u0003t\u05c3\bt\u0001u\u0001u\u0001u\u0003u\u05c8\bu\u0001"+
		"v\u0001v\u0003v\u05cc\bv\u0001v\u0003v\u05cf\bv\u0001v\u0001v\u0003v\u05d3"+
		"\bv\u0001v\u0003v\u05d6\bv\u0003v\u05d8\bv\u0001w\u0004w\u05db\bw\u000b"+
		"w\fw\u05dc\u0001x\u0001x\u0001y\u0001y\u0001z\u0003z\u05e4\bz\u0001z\u0001"+
		"z\u0001{\u0001{\u0003{\u05ea\b{\u0001|\u0001|\u0003|\u05ee\b|\u0001|\u0001"+
		"|\u0001|\u0001|\u0003|\u05f4\b|\u0001}\u0001}\u0004}\u05f8\b}\u000b}\f"+
		"}\u05f9\u0001}\u0003}\u05fd\b}\u0003}\u05ff\b}\u0001~\u0001~\u0001~\u0001"+
		"~\u0003~\u0605\b~\u0001~\u0001~\u0003~\u0609\b~\u0001~\u0001~\u0001~\u0001"+
		"~\u0003~\u060f\b~\u0001~\u0001~\u0001~\u0001~\u0001~\u0003~\u0616\b~\u0001"+
		"~\u0001~\u0003~\u061a\b~\u0003~\u061c\b~\u0005~\u061e\b~\n~\f~\u0621\t"+
		"~\u0001\u007f\u0005\u007f\u0624\b\u007f\n\u007f\f\u007f\u0627\t\u007f"+
		"\u0001\u007f\u0001\u007f\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080"+
		"\u0001\u0080\u0001\u0080\u0001\u0080\u0003\u0080\u0632\b\u0080\u0001\u0080"+
		"\u0001\u0080\u0003\u0080\u0636\b\u0080\u0003\u0080\u0638\b\u0080\u0005"+
		"\u0080\u063a\b\u0080\n\u0080\f\u0080\u063d\t\u0080\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0003\u0081\u0642\b\u0081\u0001\u0081\u0003\u0081\u0645\b"+
		"\u0081\u0003\u0081\u0647\b\u0081\u0001\u0082\u0001\u0082\u0001\u0082\u0005"+
		"\u0082\u064c\b\u0082\n\u0082\f\u0082\u064f\t\u0082\u0001\u0083\u0003\u0083"+
		"\u0652\b\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0003\u0083\u0657\b"+
		"\u0083\u0003\u0083\u0659\b\u0083\u0001\u0083\u0001\u0083\u0003\u0083\u065d"+
		"\b\u0083\u0001\u0084\u0003\u0084\u0660\b\u0084\u0001\u0084\u0003\u0084"+
		"\u0663\b\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u0667\b\u0084\u0001"+
		"\u0084\u0001\u0084\u0001\u0085\u0003\u0085\u066c\b\u0085\u0001\u0085\u0001"+
		"\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0003\u0085\u0673\b\u0085\u0001"+
		"\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0003\u0086\u067a"+
		"\b\u0086\u0001\u0087\u0001\u0087\u0001\u0087\u0003\u0087\u067f\b\u0087"+
		"\u0001\u0088\u0001\u0088\u0003\u0088\u0683\b\u0088\u0001\u0089\u0001\u0089"+
		"\u0003\u0089\u0687\b\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0003\u0089"+
		"\u068c\b\u0089\u0005\u0089\u068e\b\u0089\n\u0089\f\u0089\u0691\t\u0089"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u0696\b\u008a\u0003\u008a"+
		"\u0698\b\u008a\u0001\u008a\u0001\u008a\u0001\u008b\u0001\u008b\u0003\u008b"+
		"\u069e\b\u008b\u0001\u008c\u0001\u008c\u0001\u008c\u0003\u008c\u06a3\b"+
		"\u008c\u0001\u008c\u0001\u008c\u0001\u008d\u0001\u008d\u0003\u008d\u06a9"+
		"\b\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u06ad\b\u008d\u0003\u008d"+
		"\u06af\b\u008d\u0001\u008d\u0003\u008d\u06b2\b\u008d\u0001\u008d\u0001"+
		"\u008d\u0003\u008d\u06b6\b\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u06ba"+
		"\b\u008d\u0003\u008d\u06bc\b\u008d\u0003\u008d\u06be\b\u008d\u0001\u008e"+
		"\u0003\u008e\u06c1\b\u008e\u0001\u008e\u0001\u008e\u0001\u008f\u0001\u008f"+
		"\u0001\u0090\u0001\u0090\u0001\u0091\u0001\u0091\u0001\u0091\u0001\u0091"+
		"\u0004\u0091\u06cd\b\u0091\u000b\u0091\f\u0091\u06ce\u0001\u0092\u0003"+
		"\u0092\u06d2\b\u0092\u0001\u0092\u0003\u0092\u06d5\b\u0092\u0001\u0092"+
		"\u0003\u0092\u06d8\b\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092"+
		"\u0001\u0092\u0001\u0092\u0001\u0092\u0003\u0092\u06e1\b\u0092\u0001\u0093"+
		"\u0001\u0093\u0001\u0093\u0005\u0093\u06e6\b\u0093\n\u0093\f\u0093\u06e9"+
		"\t\u0093\u0001\u0094\u0001\u0094\u0003\u0094\u06ed\b\u0094\u0001\u0094"+
		"\u0003\u0094\u06f0\b\u0094\u0001\u0094\u0003\u0094\u06f3\b\u0094\u0001"+
		"\u0094\u0003\u0094\u06f6\b\u0094\u0001\u0094\u0001\u0094\u0003\u0094\u06fa"+
		"\b\u0094\u0001\u0095\u0004\u0095\u06fd\b\u0095\u000b\u0095\f\u0095\u06fe"+
		"\u0001\u0096\u0001\u0096\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097"+
		"\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0099\u0001\u0099\u0003\u0099"+
		"\u070c\b\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0003\u0099\u0711\b"+
		"\u0099\u0005\u0099\u0713\b\u0099\n\u0099\f\u0099\u0716\t\u0099\u0001\u009a"+
		"\u0003\u009a\u0719\b\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0003\u009a"+
		"\u071e\b\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0003\u009a\u0723\b"+
		"\u009a\u0001\u009a\u0001\u009a\u0003\u009a\u0727\b\u009a\u0001\u009b\u0003"+
		"\u009b\u072a\b\u009b\u0001\u009b\u0001\u009b\u0003\u009b\u072e\b\u009b"+
		"\u0001\u009c\u0001\u009c\u0001\u009d\u0001\u009d\u0001\u009e\u0001\u009e"+
		"\u0001\u009e\u0001\u009f\u0001\u009f\u0003\u009f\u0739\b\u009f\u0001\u00a0"+
		"\u0001\u00a0\u0003\u00a0\u073d\b\u00a0\u0001\u00a1\u0001\u00a1\u0001\u00a1"+
		"\u0001\u00a2\u0001\u00a2\u0003\u00a2\u0744\b\u00a2\u0001\u00a2\u0001\u00a2"+
		"\u0001\u00a2\u0003\u00a2\u0749\b\u00a2\u0005\u00a2\u074b\b\u00a2\n\u00a2"+
		"\f\u00a2\u074e\t\u00a2\u0001\u00a3\u0001\u00a3\u0001\u00a3\u0003\u00a3"+
		"\u0753\b\u00a3\u0001\u00a3\u0001\u00a3\u0003\u00a3\u0757\b\u00a3\u0001"+
		"\u00a4\u0001\u00a4\u0003\u00a4\u075b\b\u00a4\u0001\u00a5\u0001\u00a5\u0001"+
		"\u00a5\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0003\u00a6\u0764"+
		"\b\u00a6\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0001"+
		"\u00a7\u0001\u00a8\u0001\u00a8\u0001\u00a8\u0005\u00a8\u076f\b\u00a8\n"+
		"\u00a8\f\u00a8\u0772\t\u00a8\u0001\u00a9\u0001\u00a9\u0003\u00a9\u0776"+
		"\b\u00a9\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0003"+
		"\u00aa\u077d\b\u00aa\u0001\u00aa\u0001\u00aa\u0003\u00aa\u0781\b\u00aa"+
		"\u0001\u00aa\u0003\u00aa\u0784\b\u00aa\u0001\u00aa\u0003\u00aa\u0787\b"+
		"\u00aa\u0001\u00aa\u0003\u00aa\u078a\b\u00aa\u0001\u00aa\u0001\u00aa\u0003"+
		"\u00aa\u078e\b\u00aa\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0003\u00ab\u0793"+
		"\b\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0003"+
		"\u00ac\u079a\b\u00ac\u0001\u00ac\u0001\u00ac\u0003\u00ac\u079e\b\u00ac"+
		"\u0001\u00ac\u0001\u00ac\u0003\u00ac\u07a2\b\u00ac\u0001\u00ad\u0001\u00ad"+
		"\u0001\u00ae\u0001\u00ae\u0003\u00ae\u07a8\b\u00ae\u0001\u00ae\u0001\u00ae"+
		"\u0001\u00ae\u0003\u00ae\u07ad\b\u00ae\u0005\u00ae\u07af\b\u00ae\n\u00ae"+
		"\f\u00ae\u07b2\t\u00ae\u0001\u00af\u0001\u00af\u0001\u00af\u0003\u00af"+
		"\u07b7\b\u00af\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0003\u00b0"+
		"\u07bd\b\u00b0\u0001\u00b0\u0003\u00b0\u07c0\b\u00b0\u0001\u00b1\u0003"+
		"\u00b1\u07c3\b\u00b1\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0001\u00b2\u0001"+
		"\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b3\u0001\u00b3\u0001"+
		"\u00b3\u0001\u00b3\u0001\u00b4\u0001\u00b4\u0003\u00b4\u07d3\b\u00b4\u0001"+
		"\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b5\u0004\u00b5\u07d9\b\u00b5\u000b"+
		"\u00b5\f\u00b5\u07da\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001"+
		"\u00b6\u0001\u00b6\u0001\u00b7\u0003\u00b7\u07e4\b\u00b7\u0001\u00b7\u0001"+
		"\u00b7\u0001\u00b7\u0003\u00b7\u07e9\b\u00b7\u0001\u00b7\u0003\u00b7\u07ec"+
		"\b\u00b7\u0001\u00b8\u0001\u00b8\u0003\u00b8\u07f0\b\u00b8\u0001\u00b9"+
		"\u0001\u00b9\u0003\u00b9\u07f4\b\u00b9\u0001\u00ba\u0001\u00ba\u0001\u00ba"+
		"\u0003\u00ba\u07f9\b\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00bb\u0001\u00bb"+
		"\u0003\u00bb\u07ff\b\u00bb\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0003\u00bb"+
		"\u0804\b\u00bb\u0005\u00bb\u0806\b\u00bb\n\u00bb\f\u00bb\u0809\t\u00bb"+
		"\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc"+
		"\u0003\u00bc\u0811\b\u00bc\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0003\u00bd"+
		"\u0816\b\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0003\u00bd\u081b\b"+
		"\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001"+
		"\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001"+
		"\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001"+
		"\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001"+
		"\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001"+
		"\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001"+
		"\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0003"+
		"\u00bd\u0846\b\u00bd\u0001\u00be\u0001\u00be\u0001\u00be\u0001\u0421\u0006"+
		"\n\u001e2\u00e6\u00fc\u0100\u00bf\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
		"\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164"+
		"\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c"+
		"\u0000\u0017\u0002\u0000bbff\u0004\u0000\u0019\u0019  ;;BB\u0002\u0000"+
		"}}\u0082\u0082\u0001\u0000yz\u0002\u0000\\^be\u0002\u0000||\u0083\u0083"+
		"\u0001\u0000^`\u0001\u0000\\]\u0002\u0000ghuv\u0001\u0000st\u0002\u0000"+
		"ffir\u0005\u0000%%00::@@GG\u0003\u0000##--QQ\u0002\u0000//==\u0002\u0000"+
		">>OO\u0002\u0000\u0016\u0016CC\u0001\u0000V[\u0002\u0000bbww\u0002\u0000"+
		"\u0017\u0017SS\u0001\u0000\u001c\u001d\u0002\u0000\'\'66\u0001\u00007"+
		"9\u0001\u0000\u0001\u0007\u0936\u0000\u017f\u0001\u0000\u0000\u0000\u0002"+
		"\u018f\u0001\u0000\u0000\u0000\u0004\u0193\u0001\u0000\u0000\u0000\u0006"+
		"\u019f\u0001\u0000\u0000\u0000\b\u01a1\u0001\u0000\u0000\u0000\n\u01a7"+
		"\u0001\u0000\u0000\u0000\f\u01bd\u0001\u0000\u0000\u0000\u000e\u01c3\u0001"+
		"\u0000\u0000\u0000\u0010\u01cf\u0001\u0000\u0000\u0000\u0012\u01d1\u0001"+
		"\u0000\u0000\u0000\u0014\u01d3\u0001\u0000\u0000\u0000\u0016\u01e0\u0001"+
		"\u0000\u0000\u0000\u0018\u01e7\u0001\u0000\u0000\u0000\u001a\u01ea\u0001"+
		"\u0000\u0000\u0000\u001c\u01ef\u0001\u0000\u0000\u0000\u001e\u021e\u0001"+
		"\u0000\u0000\u0000 \u023e\u0001\u0000\u0000\u0000\"\u0240\u0001\u0000"+
		"\u0000\u0000$\u0255\u0001\u0000\u0000\u0000&\u0272\u0001\u0000\u0000\u0000"+
		"(\u0274\u0001\u0000\u0000\u0000*\u0277\u0001\u0000\u0000\u0000,\u0287"+
		"\u0001\u0000\u0000\u0000.\u028b\u0001\u0000\u0000\u00000\u0294\u0001\u0000"+
		"\u0000\u00002\u0296\u0001\u0000\u0000\u00004\u02af\u0001\u0000\u0000\u0000"+
		"6\u02b2\u0001\u0000\u0000\u00008\u02bb\u0001\u0000\u0000\u0000:\u02cc"+
		"\u0001\u0000\u0000\u0000<\u02ce\u0001\u0000\u0000\u0000>\u02d6\u0001\u0000"+
		"\u0000\u0000@\u02de\u0001\u0000\u0000\u0000B\u02e6\u0001\u0000\u0000\u0000"+
		"D\u02f3\u0001\u0000\u0000\u0000F\u02f5\u0001\u0000\u0000\u0000H\u02fd"+
		"\u0001\u0000\u0000\u0000J\u0305\u0001\u0000\u0000\u0000L\u030d\u0001\u0000"+
		"\u0000\u0000N\u0315\u0001\u0000\u0000\u0000P\u031d\u0001\u0000\u0000\u0000"+
		"R\u0325\u0001\u0000\u0000\u0000T\u032d\u0001\u0000\u0000\u0000V\u033b"+
		"\u0001\u0000\u0000\u0000X\u033d\u0001\u0000\u0000\u0000Z\u033f\u0001\u0000"+
		"\u0000\u0000\\\u0347\u0001\u0000\u0000\u0000^\u0356\u0001\u0000\u0000"+
		"\u0000`\u0359\u0001\u0000\u0000\u0000b\u0365\u0001\u0000\u0000\u0000d"+
		"\u0369\u0001\u0000\u0000\u0000f\u0370\u0001\u0000\u0000\u0000h\u0383\u0001"+
		"\u0000\u0000\u0000j\u0390\u0001\u0000\u0000\u0000l\u03b3\u0001\u0000\u0000"+
		"\u0000n\u03b7\u0001\u0000\u0000\u0000p\u03ba\u0001\u0000\u0000\u0000r"+
		"\u03c1\u0001\u0000\u0000\u0000t\u03cc\u0001\u0000\u0000\u0000v\u03d0\u0001"+
		"\u0000\u0000\u0000x\u03d3\u0001\u0000\u0000\u0000z\u03e0\u0001\u0000\u0000"+
		"\u0000|\u03ea\u0001\u0000\u0000\u0000~\u03ec\u0001\u0000\u0000\u0000\u0080"+
		"\u0403\u0001\u0000\u0000\u0000\u0082\u0405\u0001\u0000\u0000\u0000\u0084"+
		"\u0411\u0001\u0000\u0000\u0000\u0086\u0413\u0001\u0000\u0000\u0000\u0088"+
		"\u041c\u0001\u0000\u0000\u0000\u008a\u041f\u0001\u0000\u0000\u0000\u008c"+
		"\u0426\u0001\u0000\u0000\u0000\u008e\u0428\u0001\u0000\u0000\u0000\u0090"+
		"\u042a\u0001\u0000\u0000\u0000\u0092\u042f\u0001\u0000\u0000\u0000\u0094"+
		"\u0435\u0001\u0000\u0000\u0000\u0096\u0438\u0001\u0000\u0000\u0000\u0098"+
		"\u0440\u0001\u0000\u0000\u0000\u009a\u0447\u0001\u0000\u0000\u0000\u009c"+
		"\u0449\u0001\u0000\u0000\u0000\u009e\u047f\u0001\u0000\u0000\u0000\u00a0"+
		"\u0485\u0001\u0000\u0000\u0000\u00a2\u0487\u0001\u0000\u0000\u0000\u00a4"+
		"\u04a5\u0001\u0000\u0000\u0000\u00a6\u04a7\u0001\u0000\u0000\u0000\u00a8"+
		"\u04a9\u0001\u0000\u0000\u0000\u00aa\u04b3\u0001\u0000\u0000\u0000\u00ac"+
		"\u04c0\u0001\u0000\u0000\u0000\u00ae\u04ca\u0001\u0000\u0000\u0000\u00b0"+
		"\u04ce\u0001\u0000\u0000\u0000\u00b2\u04d1\u0001\u0000\u0000\u0000\u00b4"+
		"\u04d9\u0001\u0000\u0000\u0000\u00b6\u04de\u0001\u0000\u0000\u0000\u00b8"+
		"\u04e2\u0001\u0000\u0000\u0000\u00ba\u04e4\u0001\u0000\u0000\u0000\u00bc"+
		"\u04e7\u0001\u0000\u0000\u0000\u00be\u04f4\u0001\u0000\u0000\u0000\u00c0"+
		"\u04f6\u0001\u0000\u0000\u0000\u00c2\u04fd\u0001\u0000\u0000\u0000\u00c4"+
		"\u0501\u0001\u0000\u0000\u0000\u00c6\u050d\u0001\u0000\u0000\u0000\u00c8"+
		"\u0517\u0001\u0000\u0000\u0000\u00ca\u0521\u0001\u0000\u0000\u0000\u00cc"+
		"\u052c\u0001\u0000\u0000\u0000\u00ce\u0538\u0001\u0000\u0000\u0000\u00d0"+
		"\u053a\u0001\u0000\u0000\u0000\u00d2\u0545\u0001\u0000\u0000\u0000\u00d4"+
		"\u0553\u0001\u0000\u0000\u0000\u00d6\u0559\u0001\u0000\u0000\u0000\u00d8"+
		"\u055b\u0001\u0000\u0000\u0000\u00da\u0562\u0001\u0000\u0000\u0000\u00dc"+
		"\u0577\u0001\u0000\u0000\u0000\u00de\u0579\u0001\u0000\u0000\u0000\u00e0"+
		"\u0581\u0001\u0000\u0000\u0000\u00e2\u058a\u0001\u0000\u0000\u0000\u00e4"+
		"\u0592\u0001\u0000\u0000\u0000\u00e6\u05a0\u0001\u0000\u0000\u0000\u00e8"+
		"\u05b3\u0001\u0000\u0000\u0000\u00ea\u05c4\u0001\u0000\u0000\u0000\u00ec"+
		"\u05d7\u0001\u0000\u0000\u0000\u00ee\u05da\u0001\u0000\u0000\u0000\u00f0"+
		"\u05de\u0001\u0000\u0000\u0000\u00f2\u05e0\u0001\u0000\u0000\u0000\u00f4"+
		"\u05e3\u0001\u0000\u0000\u0000\u00f6\u05e7\u0001\u0000\u0000\u0000\u00f8"+
		"\u05f3\u0001\u0000\u0000\u0000\u00fa\u05fe\u0001\u0000\u0000\u0000\u00fc"+
		"\u060e\u0001\u0000\u0000\u0000\u00fe\u0625\u0001\u0000\u0000\u0000\u0100"+
		"\u062a\u0001\u0000\u0000\u0000\u0102\u0646\u0001\u0000\u0000\u0000\u0104"+
		"\u0648\u0001\u0000\u0000\u0000\u0106\u0651\u0001\u0000\u0000\u0000\u0108"+
		"\u065f\u0001\u0000\u0000\u0000\u010a\u0672\u0001\u0000\u0000\u0000\u010c"+
		"\u0679\u0001\u0000\u0000\u0000\u010e\u067e\u0001\u0000\u0000\u0000\u0110"+
		"\u0682\u0001\u0000\u0000\u0000\u0112\u0684\u0001\u0000\u0000\u0000\u0114"+
		"\u0692\u0001\u0000\u0000\u0000\u0116\u069d\u0001\u0000\u0000\u0000\u0118"+
		"\u069f\u0001\u0000\u0000\u0000\u011a\u06bd\u0001\u0000\u0000\u0000\u011c"+
		"\u06c0\u0001\u0000\u0000\u0000\u011e\u06c4\u0001\u0000\u0000\u0000\u0120"+
		"\u06c6\u0001\u0000\u0000\u0000\u0122\u06cc\u0001\u0000\u0000\u0000\u0124"+
		"\u06e0\u0001\u0000\u0000\u0000\u0126\u06e2\u0001\u0000\u0000\u0000\u0128"+
		"\u06f9\u0001\u0000\u0000\u0000\u012a\u06fc\u0001\u0000\u0000\u0000\u012c"+
		"\u0700\u0001\u0000\u0000\u0000\u012e\u0702\u0001\u0000\u0000\u0000\u0130"+
		"\u0706\u0001\u0000\u0000\u0000\u0132\u0709\u0001\u0000\u0000\u0000\u0134"+
		"\u0718\u0001\u0000\u0000\u0000\u0136\u072d\u0001\u0000\u0000\u0000\u0138"+
		"\u072f\u0001\u0000\u0000\u0000\u013a\u0731\u0001\u0000\u0000\u0000\u013c"+
		"\u0733\u0001\u0000\u0000\u0000\u013e\u0736\u0001\u0000\u0000\u0000\u0140"+
		"\u073a\u0001\u0000\u0000\u0000\u0142\u073e\u0001\u0000\u0000\u0000\u0144"+
		"\u0741\u0001\u0000\u0000\u0000\u0146\u074f\u0001\u0000\u0000\u0000\u0148"+
		"\u075a\u0001\u0000\u0000\u0000\u014a\u075c\u0001\u0000\u0000\u0000\u014c"+
		"\u075f\u0001\u0000\u0000\u0000\u014e\u0765\u0001\u0000\u0000\u0000\u0150"+
		"\u076b\u0001\u0000\u0000\u0000\u0152\u0775\u0001\u0000\u0000\u0000\u0154"+
		"\u0780\u0001\u0000\u0000\u0000\u0156\u078f\u0001\u0000\u0000\u0000\u0158"+
		"\u07a1\u0001\u0000\u0000\u0000\u015a\u07a3\u0001\u0000\u0000\u0000\u015c"+
		"\u07a5\u0001\u0000\u0000\u0000\u015e\u07b6\u0001\u0000\u0000\u0000\u0160"+
		"\u07b8\u0001\u0000\u0000\u0000\u0162\u07c2\u0001\u0000\u0000\u0000\u0164"+
		"\u07c7\u0001\u0000\u0000\u0000\u0166\u07cc\u0001\u0000\u0000\u0000\u0168"+
		"\u07d0\u0001\u0000\u0000\u0000\u016a\u07d8\u0001\u0000\u0000\u0000\u016c"+
		"\u07dc\u0001\u0000\u0000\u0000\u016e\u07eb\u0001\u0000\u0000\u0000\u0170"+
		"\u07ed\u0001\u0000\u0000\u0000\u0172\u07f3\u0001\u0000\u0000\u0000\u0174"+
		"\u07f5\u0001\u0000\u0000\u0000\u0176\u07fc\u0001\u0000\u0000\u0000\u0178"+
		"\u0810\u0001\u0000\u0000\u0000\u017a\u0845\u0001\u0000\u0000\u0000\u017c"+
		"\u0847\u0001\u0000\u0000\u0000\u017e\u0180\u0003x<\u0000\u017f\u017e\u0001"+
		"\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0005\u0000\u0000\u0001\u0182\u0001\u0001"+
		"\u0000\u0000\u0000\u0183\u0185\u0003\u017c\u00be\u0000\u0184\u0183\u0001"+
		"\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0184\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0190\u0001"+
		"\u0000\u0000\u0000\u0188\u0190\u0005F\u0000\u0000\u0189\u018a\u0005V\u0000"+
		"\u0000\u018a\u018b\u0003Z-\u0000\u018b\u018c\u0005W\u0000\u0000\u018c"+
		"\u0190\u0001\u0000\u0000\u0000\u018d\u0190\u0003\u0004\u0002\u0000\u018e"+
		"\u0190\u0003\f\u0006\u0000\u018f\u0184\u0001\u0000\u0000\u0000\u018f\u0188"+
		"\u0001\u0000\u0000\u0000\u018f\u0189\u0001\u0000\u0000\u0000\u018f\u018d"+
		"\u0001\u0000\u0000\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u0190\u0003"+
		"\u0001\u0000\u0000\u0000\u0191\u0194\u0003\u0006\u0003\u0000\u0192\u0194"+
		"\u0003\b\u0004\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0192\u0001"+
		"\u0000\u0000\u0000\u0194\u0005\u0001\u0000\u0000\u0000\u0195\u01a0\u0005"+
		"\u0085\u0000\u0000\u0196\u01a0\u0003\u014a\u00a5\u0000\u0197\u01a0\u0003"+
		"\u013c\u009e\u0000\u0198\u01a0\u0003\u014c\u00a6\u0000\u0199\u019c\u0005"+
		"d\u0000\u0000\u019a\u019d\u0003\u0116\u008b\u0000\u019b\u019d\u0003\u00a2"+
		"Q\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019b\u0001\u0000\u0000"+
		"\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u01a0\u0003\u0158\u00ac"+
		"\u0000\u019f\u0195\u0001\u0000\u0000\u0000\u019f\u0196\u0001\u0000\u0000"+
		"\u0000\u019f\u0197\u0001\u0000\u0000\u0000\u019f\u0198\u0001\u0000\u0000"+
		"\u0000\u019f\u0199\u0001\u0000\u0000\u0000\u019f\u019e\u0001\u0000\u0000"+
		"\u0000\u01a0\u0007\u0001\u0000\u0000\u0000\u01a1\u01a3\u0003\n\u0005\u0000"+
		"\u01a2\u01a4\u0005E\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0003\u0006\u0003\u0000\u01a6\t\u0001\u0000\u0000\u0000\u01a7\u01ab"+
		"\u0006\u0005\uffff\uffff\u0000\u01a8\u01ac\u0003\u00a0P\u0000\u01a9\u01ac"+
		"\u0003\u00b8\\\u0000\u01aa\u01ac\u0003\u00a2Q\u0000\u01ab\u01a8\u0001"+
		"\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01aa\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ae\u0005\u0080\u0000\u0000\u01ae\u01ba\u0001"+
		"\u0000\u0000\u0000\u01af\u01b5\n\u0001\u0000\u0000\u01b0\u01b6\u0005\u0085"+
		"\u0000\u0000\u01b1\u01b3\u0005E\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b6\u0003\u0156\u00ab\u0000\u01b5\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b2\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b9\u0005\u0080\u0000\u0000\u01b8\u01af\u0001\u0000\u0000"+
		"\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u000b\u0001\u0000\u0000"+
		"\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01bf\u0003\u000e\u0007"+
		"\u0000\u01be\u01c0\u0003\u001c\u000e\u0000\u01bf\u01be\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0003d2\u0000\u01c2\r\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c5\u0005X\u0000\u0000\u01c4\u01c6\u0003\u0010\b\u0000\u01c5\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005Y\u0000\u0000\u01c8\u000f\u0001"+
		"\u0000\u0000\u0000\u01c9\u01d0\u0003\u0014\n\u0000\u01ca\u01cd\u0003\u0012"+
		"\t\u0000\u01cb\u01cc\u0005{\u0000\u0000\u01cc\u01ce\u0003\u0014\n\u0000"+
		"\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000"+
		"\u01ce\u01d0\u0001\u0000\u0000\u0000\u01cf\u01c9\u0001\u0000\u0000\u0000"+
		"\u01cf\u01ca\u0001\u0000\u0000\u0000\u01d0\u0011\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0007\u0000\u0000\u0000\u01d2\u0013\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d8\u0003\u0016\u000b\u0000\u01d4\u01d5\u0005{\u0000\u0000\u01d5"+
		"\u01d7\u0003\u0016\u000b\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7"+
		"\u01da\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da"+
		"\u01d8\u0001\u0000\u0000\u0000\u01db\u01dd\u0005\u0084\u0000\u0000\u01dc"+
		"\u01db\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd"+
		"\u0015\u0001\u0000\u0000\u0000\u01de\u01e1\u0003\u0018\f\u0000\u01df\u01e1"+
		"\u0003\u001a\r\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01df\u0001"+
		"\u0000\u0000\u0000\u01e1\u0017\u0001\u0000\u0000\u0000\u01e2\u01e4\u0005"+
		"b\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e8\u0005\u0085"+
		"\u0000\u0000\u01e6\u01e8\u0005F\u0000\u0000\u01e7\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e8\u0019\u0001\u0000\u0000"+
		"\u0000\u01e9\u01eb\u0005b\u0000\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000"+
		"\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000"+
		"\u01ec\u01ed\u0005\u0085\u0000\u0000\u01ed\u01ee\u0003\u010c\u0086\u0000"+
		"\u01ee\u001b\u0001\u0000\u0000\u0000\u01ef\u01f1\u0005V\u0000\u0000\u01f0"+
		"\u01f2\u0003\u0102\u0081\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f5\u0005W\u0000\u0000\u01f4\u01f6\u00050\u0000\u0000\u01f5\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f9\u0003\u0172\u00b9\u0000\u01f8\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fa\u01fc\u0003\u00ccf\u0000\u01fb\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fe\u0001\u0000"+
		"\u0000\u0000\u01fd\u01ff\u0003\u00eau\u0000\u01fe\u01fd\u0001\u0000\u0000"+
		"\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u001d\u0001\u0000\u0000"+
		"\u0000\u0200\u0201\u0006\u000f\uffff\uffff\u0000\u0201\u021f\u0003\u0002"+
		"\u0001\u0000\u0202\u0205\u0003\u009eO\u0000\u0203\u0205\u0003\u0160\u00b0"+
		"\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0203\u0001\u0000\u0000"+
		"\u0000\u0205\u020c\u0001\u0000\u0000\u0000\u0206\u0208\u0005V\u0000\u0000"+
		"\u0207\u0209\u0003\"\u0011\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a"+
		"\u020d\u0005W\u0000\u0000\u020b\u020d\u0003\u0114\u008a\u0000\u020c\u0206"+
		"\u0001\u0000\u0000\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020d\u021f"+
		"\u0001\u0000\u0000\u0000\u020e\u020f\u0007\u0001\u0000\u0000\u020f\u0210"+
		"\u0005g\u0000\u0000\u0210\u0211\u0003\u00f6{\u0000\u0211\u0212\u0005h"+
		"\u0000\u0000\u0212\u0213\u0005V\u0000\u0000\u0213\u0214\u0003Z-\u0000"+
		"\u0214\u0215\u0005W\u0000\u0000\u0215\u021f\u0001\u0000\u0000\u0000\u0216"+
		"\u0217\u0003 \u0010\u0000\u0217\u021a\u0005V\u0000\u0000\u0218\u021b\u0003"+
		"Z-\u0000\u0219\u021b\u0003\u00f6{\u0000\u021a\u0218\u0001\u0000\u0000"+
		"\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000"+
		"\u0000\u021c\u021d\u0005W\u0000\u0000\u021d\u021f\u0001\u0000\u0000\u0000"+
		"\u021e\u0200\u0001\u0000\u0000\u0000\u021e\u0204\u0001\u0000\u0000\u0000"+
		"\u021e\u020e\u0001\u0000\u0000\u0000\u021e\u0216\u0001\u0000\u0000\u0000"+
		"\u021f\u023b\u0001\u0000\u0000\u0000\u0220\u0221\n\u0007\u0000\u0000\u0221"+
		"\u0224\u0005X\u0000\u0000\u0222\u0225\u0003Z-\u0000\u0223\u0225\u0003"+
		"\u0114\u008a\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0224\u0223\u0001"+
		"\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u0227\u0005"+
		"Y\u0000\u0000\u0227\u023a\u0001\u0000\u0000\u0000\u0228\u0229\n\u0006"+
		"\u0000\u0000\u0229\u022b\u0005V\u0000\u0000\u022a\u022c\u0003\"\u0011"+
		"\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000"+
		"\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u023a\u0005W\u0000\u0000"+
		"\u022e\u022f\n\u0004\u0000\u0000\u022f\u0235\u0007\u0002\u0000\u0000\u0230"+
		"\u0232\u0005E\u0000\u0000\u0231\u0230\u0001\u0000\u0000\u0000\u0231\u0232"+
		"\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0236"+
		"\u0003\u0004\u0002\u0000\u0234\u0236\u0003$\u0012\u0000\u0235\u0231\u0001"+
		"\u0000\u0000\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0236\u023a\u0001"+
		"\u0000\u0000\u0000\u0237\u0238\n\u0003\u0000\u0000\u0238\u023a\u0007\u0003"+
		"\u0000\u0000\u0239\u0220\u0001\u0000\u0000\u0000\u0239\u0228\u0001\u0000"+
		"\u0000\u0000\u0239\u022e\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000"+
		"\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b\u0239\u0001\u0000"+
		"\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u001f\u0001\u0000"+
		"\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e\u023f\u0005L\u0000"+
		"\u0000\u023f!\u0001\u0000\u0000\u0000\u0240\u0241\u0003\u0112\u0089\u0000"+
		"\u0241#\u0001\u0000\u0000\u0000\u0242\u0244\u0003\n\u0005\u0000\u0243"+
		"\u0242\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244"+
		"\u0248\u0001\u0000\u0000\u0000\u0245\u0246\u0003\u00a0P\u0000\u0246\u0247"+
		"\u0005\u0080\u0000\u0000\u0247\u0249\u0001\u0000\u0000\u0000\u0248\u0245"+
		"\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024a"+
		"\u0001\u0000\u0000\u0000\u024a\u024b\u0005d\u0000\u0000\u024b\u0256\u0003"+
		"\u00a0P\u0000\u024c\u024d\u0003\n\u0005\u0000\u024d\u024e\u0005E\u0000"+
		"\u0000\u024e\u024f\u0003\u0156\u00ab\u0000\u024f\u0250\u0005\u0080\u0000"+
		"\u0000\u0250\u0251\u0005d\u0000\u0000\u0251\u0252\u0003\u00a0P\u0000\u0252"+
		"\u0256\u0001\u0000\u0000\u0000\u0253\u0254\u0005d\u0000\u0000\u0254\u0256"+
		"\u0003\u00a2Q\u0000\u0255\u0243\u0001\u0000\u0000\u0000\u0255\u024c\u0001"+
		"\u0000\u0000\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0256%\u0001\u0000"+
		"\u0000\u0000\u0257\u0273\u0003\u001e\u000f\u0000\u0258\u025d\u0005y\u0000"+
		"\u0000\u0259\u025d\u0005z\u0000\u0000\u025a\u025d\u0003(\u0014\u0000\u025b"+
		"\u025d\u0005?\u0000\u0000\u025c\u0258\u0001\u0000\u0000\u0000\u025c\u0259"+
		"\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025c\u025b"+
		"\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u0273"+
		"\u0003&\u0013\u0000\u025f\u0268\u0005?\u0000\u0000\u0260\u0261\u0005V"+
		"\u0000\u0000\u0261\u0262\u0003\u00f6{\u0000\u0262\u0263\u0005W\u0000\u0000"+
		"\u0263\u0269\u0001\u0000\u0000\u0000\u0264\u0265\u0005\u0084\u0000\u0000"+
		"\u0265\u0266\u0005V\u0000\u0000\u0266\u0267\u0005\u0085\u0000\u0000\u0267"+
		"\u0269\u0005W\u0000\u0000\u0268\u0260\u0001\u0000\u0000\u0000\u0268\u0264"+
		"\u0001\u0000\u0000\u0000\u0269\u0273\u0001\u0000\u0000\u0000\u026a\u026b"+
		"\u0005\f\u0000\u0000\u026b\u026c\u0005V\u0000\u0000\u026c\u026d\u0003"+
		"\u00f6{\u0000\u026d\u026e\u0005W\u0000\u0000\u026e\u0273\u0001\u0000\u0000"+
		"\u0000\u026f\u0273\u00038\u001c\u0000\u0270\u0273\u0003*\u0015\u0000\u0271"+
		"\u0273\u00036\u001b\u0000\u0272\u0257\u0001\u0000\u0000\u0000\u0272\u025c"+
		"\u0001\u0000\u0000\u0000\u0272\u025f\u0001\u0000\u0000\u0000\u0272\u026a"+
		"\u0001\u0000\u0000\u0000\u0272\u026f\u0001\u0000\u0000\u0000\u0272\u0270"+
		"\u0001\u0000\u0000\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0273\'\u0001"+
		"\u0000\u0000\u0000\u0274\u0275\u0007\u0004\u0000\u0000\u0275)\u0001\u0000"+
		"\u0000\u0000\u0276\u0278\u0005\u0080\u0000\u0000\u0277\u0276\u0001\u0000"+
		"\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000"+
		"\u0000\u0000\u0279\u027b\u00052\u0000\u0000\u027a\u027c\u0003,\u0016\u0000"+
		"\u027b\u027a\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000"+
		"\u027c\u0282\u0001\u0000\u0000\u0000\u027d\u0283\u0003.\u0017\u0000\u027e"+
		"\u027f\u0005V\u0000\u0000\u027f\u0280\u0003\u00f6{\u0000\u0280\u0281\u0005"+
		"W\u0000\u0000\u0281\u0283\u0001\u0000\u0000\u0000\u0282\u027d\u0001\u0000"+
		"\u0000\u0000\u0282\u027e\u0001\u0000\u0000\u0000\u0283\u0285\u0001\u0000"+
		"\u0000\u0000\u0284\u0286\u00034\u001a\u0000\u0285\u0284\u0001\u0000\u0000"+
		"\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286+\u0001\u0000\u0000\u0000"+
		"\u0287\u0288\u0005V\u0000\u0000\u0288\u0289\u0003\"\u0011\u0000\u0289"+
		"\u028a\u0005W\u0000\u0000\u028a-\u0001\u0000\u0000\u0000\u028b\u028d\u0003"+
		"\u0096K\u0000\u028c\u028e\u00030\u0018\u0000\u028d\u028c\u0001\u0000\u0000"+
		"\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e/\u0001\u0000\u0000\u0000"+
		"\u028f\u0291\u0003\u00ecv\u0000\u0290\u0292\u00030\u0018\u0000\u0291\u0290"+
		"\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0295"+
		"\u0001\u0000\u0000\u0000\u0293\u0295\u00032\u0019\u0000\u0294\u028f\u0001"+
		"\u0000\u0000\u0000\u0294\u0293\u0001\u0000\u0000\u0000\u02951\u0001\u0000"+
		"\u0000\u0000\u0296\u0297\u0006\u0019\uffff\uffff\u0000\u0297\u0298\u0005"+
		"X\u0000\u0000\u0298\u0299\u0003Z-\u0000\u0299\u029b\u0005Y\u0000\u0000"+
		"\u029a\u029c\u0003\u00ccf\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029b"+
		"\u029c\u0001\u0000\u0000\u0000\u029c\u02a6\u0001\u0000\u0000\u0000\u029d"+
		"\u029e\n\u0001\u0000\u0000\u029e\u029f\u0005X\u0000\u0000\u029f\u02a0"+
		"\u0003\\.\u0000\u02a0\u02a2\u0005Y\u0000\u0000\u02a1\u02a3\u0003\u00cc"+
		"f\u0000\u02a2\u02a1\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a5\u0001\u0000\u0000\u0000\u02a4\u029d\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a8\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a73\u0001\u0000\u0000\u0000"+
		"\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a9\u02ab\u0005V\u0000\u0000\u02aa"+
		"\u02ac\u0003\"\u0011\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ab\u02ac"+
		"\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad\u02b0"+
		"\u0005W\u0000\u0000\u02ae\u02b0\u0003\u0114\u008a\u0000\u02af\u02a9\u0001"+
		"\u0000\u0000\u0000\u02af\u02ae\u0001\u0000\u0000\u0000\u02b05\u0001\u0000"+
		"\u0000\u0000\u02b1\u02b3\u0005\u0080\u0000\u0000\u02b2\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b7\u0005\u001d\u0000\u0000\u02b5\u02b6\u0005X\u0000"+
		"\u0000\u02b6\u02b8\u0005Y\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000"+
		"\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000"+
		"\u02b9\u02ba\u0003:\u001d\u0000\u02ba7\u0001\u0000\u0000\u0000\u02bb\u02bc"+
		"\u00053\u0000\u0000\u02bc\u02bd\u0005V\u0000\u0000\u02bd\u02be\u0003Z"+
		"-\u0000\u02be\u02bf\u0005W\u0000\u0000\u02bf9\u0001\u0000\u0000\u0000"+
		"\u02c0\u02cd\u0003&\u0013\u0000\u02c1\u02c3\u0003(\u0014\u0000\u02c2\u02c1"+
		"\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c5"+
		"\u0001\u0000\u0000\u0000\u02c4\u02c6\u0005d\u0000\u0000\u02c5\u02c4\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001"+
		"\u0000\u0000\u0000\u02c7\u02c8\u0005V\u0000\u0000\u02c8\u02c9\u0003\u00f6"+
		"{\u0000\u02c9\u02ca\u0005W\u0000\u0000\u02ca\u02cb\u0003:\u001d\u0000"+
		"\u02cb\u02cd\u0001\u0000\u0000\u0000\u02cc\u02c0\u0001\u0000\u0000\u0000"+
		"\u02cc\u02c2\u0001\u0000\u0000\u0000\u02cd;\u0001\u0000\u0000\u0000\u02ce"+
		"\u02d3\u0003:\u001d\u0000\u02cf\u02d0\u0007\u0005\u0000\u0000\u02d0\u02d2"+
		"\u0003:\u001d\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d2\u02d5\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001"+
		"\u0000\u0000\u0000\u02d4=\u0001\u0000\u0000\u0000\u02d5\u02d3\u0001\u0000"+
		"\u0000\u0000\u02d6\u02db\u0003<\u001e\u0000\u02d7\u02d8\u0007\u0006\u0000"+
		"\u0000\u02d8\u02da\u0003<\u001e\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000"+
		"\u02da\u02dd\u0001\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000\u0000"+
		"\u02db\u02dc\u0001\u0000\u0000\u0000\u02dc?\u0001\u0000\u0000\u0000\u02dd"+
		"\u02db\u0001\u0000\u0000\u0000\u02de\u02e3\u0003>\u001f\u0000\u02df\u02e0"+
		"\u0007\u0007\u0000\u0000\u02e0\u02e2\u0003>\u001f\u0000\u02e1\u02df\u0001"+
		"\u0000\u0000\u0000\u02e2\u02e5\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4A\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e6\u02ec\u0003@ \u0000"+
		"\u02e7\u02e8\u0003D\"\u0000\u02e8\u02e9\u0003@ \u0000\u02e9\u02eb\u0001"+
		"\u0000\u0000\u0000\u02ea\u02e7\u0001\u0000\u0000\u0000\u02eb\u02ee\u0001"+
		"\u0000\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001"+
		"\u0000\u0000\u0000\u02edC\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ef\u02f0\u0005h\u0000\u0000\u02f0\u02f4\u0005h\u0000\u0000"+
		"\u02f1\u02f2\u0005g\u0000\u0000\u02f2\u02f4\u0005g\u0000\u0000\u02f3\u02ef"+
		"\u0001\u0000\u0000\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f4E\u0001"+
		"\u0000\u0000\u0000\u02f5\u02fa\u0003B!\u0000\u02f6\u02f7\u0007\b\u0000"+
		"\u0000\u02f7\u02f9\u0003B!\u0000\u02f8\u02f6\u0001\u0000\u0000\u0000\u02f9"+
		"\u02fc\u0001\u0000\u0000\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fa"+
		"\u02fb\u0001\u0000\u0000\u0000\u02fbG\u0001\u0000\u0000\u0000\u02fc\u02fa"+
		"\u0001\u0000\u0000\u0000\u02fd\u0302\u0003F#\u0000\u02fe\u02ff\u0007\t"+
		"\u0000\u0000\u02ff\u0301\u0003F#\u0000\u0300\u02fe\u0001\u0000\u0000\u0000"+
		"\u0301\u0304\u0001\u0000\u0000\u0000\u0302\u0300\u0001\u0000\u0000\u0000"+
		"\u0302\u0303\u0001\u0000\u0000\u0000\u0303I\u0001\u0000\u0000\u0000\u0304"+
		"\u0302\u0001\u0000\u0000\u0000\u0305\u030a\u0003H$\u0000\u0306\u0307\u0005"+
		"b\u0000\u0000\u0307\u0309\u0003H$\u0000\u0308\u0306\u0001\u0000\u0000"+
		"\u0000\u0309\u030c\u0001\u0000\u0000\u0000\u030a\u0308\u0001\u0000\u0000"+
		"\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030bK\u0001\u0000\u0000\u0000"+
		"\u030c\u030a\u0001\u0000\u0000\u0000\u030d\u0312\u0003J%\u0000\u030e\u030f"+
		"\u0005a\u0000\u0000\u030f\u0311\u0003J%\u0000\u0310\u030e\u0001\u0000"+
		"\u0000\u0000\u0311\u0314\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000"+
		"\u0000\u0000\u0312\u0313\u0001\u0000\u0000\u0000\u0313M\u0001\u0000\u0000"+
		"\u0000\u0314\u0312\u0001\u0000\u0000\u0000\u0315\u031a\u0003L&\u0000\u0316"+
		"\u0317\u0005c\u0000\u0000\u0317\u0319\u0003L&\u0000\u0318\u0316\u0001"+
		"\u0000\u0000\u0000\u0319\u031c\u0001\u0000\u0000\u0000\u031a\u0318\u0001"+
		"\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031bO\u0001\u0000"+
		"\u0000\u0000\u031c\u031a\u0001\u0000\u0000\u0000\u031d\u0322\u0003N\'"+
		"\u0000\u031e\u031f\u0005w\u0000\u0000\u031f\u0321\u0003N\'\u0000\u0320"+
		"\u031e\u0001\u0000\u0000\u0000\u0321\u0324\u0001\u0000\u0000\u0000\u0322"+
		"\u0320\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000\u0000\u0323"+
		"Q\u0001\u0000\u0000\u0000\u0324\u0322\u0001\u0000\u0000\u0000\u0325\u032a"+
		"\u0003P(\u0000\u0326\u0327\u0005x\u0000\u0000\u0327\u0329\u0003P(\u0000"+
		"\u0328\u0326\u0001\u0000\u0000\u0000\u0329\u032c\u0001\u0000\u0000\u0000"+
		"\u032a\u0328\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000"+
		"\u032bS\u0001\u0000\u0000\u0000\u032c\u032a\u0001\u0000\u0000\u0000\u032d"+
		"\u0333\u0003R)\u0000\u032e\u032f\u0005~\u0000\u0000\u032f\u0330\u0003"+
		"Z-\u0000\u0330\u0331\u0005\u007f\u0000\u0000\u0331\u0332\u0003V+\u0000"+
		"\u0332\u0334\u0001\u0000\u0000\u0000\u0333\u032e\u0001\u0000\u0000\u0000"+
		"\u0333\u0334\u0001\u0000\u0000\u0000\u0334U\u0001\u0000\u0000\u0000\u0335"+
		"\u033c\u0003T*\u0000\u0336\u0337\u0003R)\u0000\u0337\u0338\u0003X,\u0000"+
		"\u0338\u0339\u0003\u0110\u0088\u0000\u0339\u033c\u0001\u0000\u0000\u0000"+
		"\u033a\u033c\u0003\u0170\u00b8\u0000\u033b\u0335\u0001\u0000\u0000\u0000"+
		"\u033b\u0336\u0001\u0000\u0000\u0000\u033b\u033a\u0001\u0000\u0000\u0000"+
		"\u033cW\u0001\u0000\u0000\u0000\u033d\u033e\u0007\n\u0000\u0000\u033e"+
		"Y\u0001\u0000\u0000\u0000\u033f\u0344\u0003V+\u0000\u0340\u0341\u0005"+
		"{\u0000\u0000\u0341\u0343\u0003V+\u0000\u0342\u0340\u0001\u0000\u0000"+
		"\u0000\u0343\u0346\u0001\u0000\u0000\u0000\u0344\u0342\u0001\u0000\u0000"+
		"\u0000\u0344\u0345\u0001\u0000\u0000\u0000\u0345[\u0001\u0000\u0000\u0000"+
		"\u0346\u0344\u0001\u0000\u0000\u0000\u0347\u0348\u0003T*\u0000\u0348]"+
		"\u0001\u0000\u0000\u0000\u0349\u0357\u0003`0\u0000\u034a\u0357\u0003v"+
		";\u0000\u034b\u034d\u0003\u00ccf\u0000\u034c\u034b\u0001\u0000\u0000\u0000"+
		"\u034c\u034d\u0001\u0000\u0000\u0000\u034d\u0354\u0001\u0000\u0000\u0000"+
		"\u034e\u0355\u0003b1\u0000\u034f\u0355\u0003d2\u0000\u0350\u0355\u0003"+
		"h4\u0000\u0351\u0355\u0003l6\u0000\u0352\u0355\u0003t:\u0000\u0353\u0355"+
		"\u0003\u0166\u00b3\u0000\u0354\u034e\u0001\u0000\u0000\u0000\u0354\u034f"+
		"\u0001\u0000\u0000\u0000\u0354\u0350\u0001\u0000\u0000\u0000\u0354\u0351"+
		"\u0001\u0000\u0000\u0000\u0354\u0352\u0001\u0000\u0000\u0000\u0354\u0353"+
		"\u0001\u0000\u0000\u0000\u0355\u0357\u0001\u0000\u0000\u0000\u0356\u0349"+
		"\u0001\u0000\u0000\u0000\u0356\u034a\u0001\u0000\u0000\u0000\u0356\u034c"+
		"\u0001\u0000\u0000\u0000\u0357_\u0001\u0000\u0000\u0000\u0358\u035a\u0003"+
		"\u00ccf\u0000\u0359\u0358\u0001\u0000\u0000\u0000\u0359\u035a\u0001\u0000"+
		"\u0000\u0000\u035a\u035f\u0001\u0000\u0000\u0000\u035b\u0360\u0005\u0085"+
		"\u0000\u0000\u035c\u035d\u0005\u0011\u0000\u0000\u035d\u0360\u0003\\."+
		"\u0000\u035e\u0360\u0005\u001c\u0000\u0000\u035f\u035b\u0001\u0000\u0000"+
		"\u0000\u035f\u035c\u0001\u0000\u0000\u0000\u035f\u035e\u0001\u0000\u0000"+
		"\u0000\u0360\u0361\u0001\u0000\u0000\u0000\u0361\u0362\u0005\u007f\u0000"+
		"\u0000\u0362\u0363\u0003^/\u0000\u0363a\u0001\u0000\u0000\u0000\u0364"+
		"\u0366\u0003Z-\u0000\u0365\u0364\u0001\u0000\u0000\u0000\u0365\u0366\u0001"+
		"\u0000\u0000\u0000\u0366\u0367\u0001\u0000\u0000\u0000\u0367\u0368\u0005"+
		"\u0081\u0000\u0000\u0368c\u0001\u0000\u0000\u0000\u0369\u036b\u0005Z\u0000"+
		"\u0000\u036a\u036c\u0003f3\u0000\u036b\u036a\u0001\u0000\u0000\u0000\u036b"+
		"\u036c\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000\u036d"+
		"\u036e\u0005[\u0000\u0000\u036ee\u0001\u0000\u0000\u0000\u036f\u0371\u0003"+
		"^/\u0000\u0370\u036f\u0001\u0000\u0000\u0000\u0371\u0372\u0001\u0000\u0000"+
		"\u0000\u0372\u0370\u0001\u0000\u0000\u0000\u0372\u0373\u0001\u0000\u0000"+
		"\u0000\u0373g\u0001\u0000\u0000\u0000\u0374\u0375\u0005,\u0000\u0000\u0375"+
		"\u0376\u0005V\u0000\u0000\u0376\u0377\u0003j5\u0000\u0377\u0378\u0005"+
		"W\u0000\u0000\u0378\u037b\u0003^/\u0000\u0379\u037a\u0005!\u0000\u0000"+
		"\u037a\u037c\u0003^/\u0000\u037b\u0379\u0001\u0000\u0000\u0000\u037b\u037c"+
		"\u0001\u0000\u0000\u0000\u037c\u0384\u0001\u0000\u0000\u0000\u037d\u037e"+
		"\u0005D\u0000\u0000\u037e\u037f\u0005V\u0000\u0000\u037f\u0380\u0003j"+
		"5\u0000\u0380\u0381\u0005W\u0000\u0000\u0381\u0382\u0003^/\u0000\u0382"+
		"\u0384\u0001\u0000\u0000\u0000\u0383\u0374\u0001\u0000\u0000\u0000\u0383"+
		"\u037d\u0001\u0000\u0000\u0000\u0384i\u0001\u0000\u0000\u0000\u0385\u0391"+
		"\u0003Z-\u0000\u0386\u0388\u0003\u00ccf\u0000\u0387\u0386\u0001\u0000"+
		"\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388\u0389\u0001\u0000"+
		"\u0000\u0000\u0389\u038a\u0003\u008aE\u0000\u038a\u038e\u0003\u00e2q\u0000"+
		"\u038b\u038c\u0005f\u0000\u0000\u038c\u038f\u0003\u0110\u0088\u0000\u038d"+
		"\u038f\u0003\u0114\u008a\u0000\u038e\u038b\u0001\u0000\u0000\u0000\u038e"+
		"\u038d\u0001\u0000\u0000\u0000\u038f\u0391\u0001\u0000\u0000\u0000\u0390"+
		"\u0385\u0001\u0000\u0000\u0000\u0390\u0387\u0001\u0000\u0000\u0000\u0391"+
		"k\u0001\u0000\u0000\u0000\u0392\u0393\u0005U\u0000\u0000\u0393\u0394\u0005"+
		"V\u0000\u0000\u0394\u0395\u0003j5\u0000\u0395\u0396\u0005W\u0000\u0000"+
		"\u0396\u0397\u0003^/\u0000\u0397\u03b4\u0001\u0000\u0000\u0000\u0398\u0399"+
		"\u0005\u001e\u0000\u0000\u0399\u039a\u0003^/\u0000\u039a\u039b\u0005U"+
		"\u0000\u0000\u039b\u039c\u0005V\u0000\u0000\u039c\u039d\u0003Z-\u0000"+
		"\u039d\u039e\u0005W\u0000\u0000\u039e\u039f\u0005\u0081\u0000\u0000\u039f"+
		"\u03b4\u0001\u0000\u0000\u0000\u03a0\u03a1\u0005)\u0000\u0000\u03a1\u03ae"+
		"\u0005V\u0000\u0000\u03a2\u03a4\u0003n7\u0000\u03a3\u03a5\u0003j5\u0000"+
		"\u03a4\u03a3\u0001\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000\u0000"+
		"\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6\u03a8\u0005\u0081\u0000\u0000"+
		"\u03a7\u03a9\u0003Z-\u0000\u03a8\u03a7\u0001\u0000\u0000\u0000\u03a8\u03a9"+
		"\u0001\u0000\u0000\u0000\u03a9\u03af\u0001\u0000\u0000\u0000\u03aa\u03ab"+
		"\u0003p8\u0000\u03ab\u03ac\u0005\u007f\u0000\u0000\u03ac\u03ad\u0003r"+
		"9\u0000\u03ad\u03af\u0001\u0000\u0000\u0000\u03ae\u03a2\u0001\u0000\u0000"+
		"\u0000\u03ae\u03aa\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000"+
		"\u0000\u03b0\u03b1\u0005W\u0000\u0000\u03b1\u03b2\u0003^/\u0000\u03b2"+
		"\u03b4\u0001\u0000\u0000\u0000\u03b3\u0392\u0001\u0000\u0000\u0000\u03b3"+
		"\u0398\u0001\u0000\u0000\u0000\u03b3\u03a0\u0001\u0000\u0000\u0000\u03b4"+
		"m\u0001\u0000\u0000\u0000\u03b5\u03b8\u0003b1\u0000\u03b6\u03b8\u0003"+
		"\u0080@\u0000\u03b7\u03b5\u0001\u0000\u0000\u0000\u03b7\u03b6\u0001\u0000"+
		"\u0000\u0000\u03b8o\u0001\u0000\u0000\u0000\u03b9\u03bb\u0003\u00ccf\u0000"+
		"\u03ba\u03b9\u0001\u0000\u0000\u0000\u03ba\u03bb\u0001\u0000\u0000\u0000"+
		"\u03bb\u03bc\u0001\u0000\u0000\u0000\u03bc\u03bd\u0003\u008aE\u0000\u03bd"+
		"\u03be\u0003\u00e2q\u0000\u03beq\u0001\u0000\u0000\u0000\u03bf\u03c2\u0003"+
		"Z-\u0000\u03c0\u03c2\u0003\u0114\u008a\u0000\u03c1\u03bf\u0001\u0000\u0000"+
		"\u0000\u03c1\u03c0\u0001\u0000\u0000\u0000\u03c2s\u0001\u0000\u0000\u0000"+
		"\u03c3\u03cd\u0005\u0010\u0000\u0000\u03c4\u03cd\u0005\u001a\u0000\u0000"+
		"\u03c5\u03c8\u0005<\u0000\u0000\u03c6\u03c9\u0003Z-\u0000\u03c7\u03c9"+
		"\u0003\u0114\u008a\u0000\u03c8\u03c6\u0001\u0000\u0000\u0000\u03c8\u03c7"+
		"\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9\u03cd"+
		"\u0001\u0000\u0000\u0000\u03ca\u03cb\u0005+\u0000\u0000\u03cb\u03cd\u0005"+
		"\u0085\u0000\u0000\u03cc\u03c3\u0001\u0000\u0000\u0000\u03cc\u03c4\u0001"+
		"\u0000\u0000\u0000\u03cc\u03c5\u0001\u0000\u0000\u0000\u03cc\u03ca\u0001"+
		"\u0000\u0000\u0000\u03cd\u03ce\u0001\u0000\u0000\u0000\u03ce\u03cf\u0005"+
		"\u0081\u0000\u0000\u03cfu\u0001\u0000\u0000\u0000\u03d0\u03d1\u0003|>"+
		"\u0000\u03d1w\u0001\u0000\u0000\u0000\u03d2\u03d4\u0003z=\u0000\u03d3"+
		"\u03d2\u0001\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5"+
		"\u03d3\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000\u03d6"+
		"y\u0001\u0000\u0000\u0000\u03d7\u03e1\u0003|>\u0000\u03d8\u03e1\u0003"+
		"\u0108\u0084\u0000\u03d9\u03e1\u0003\u014e\u00a7\u0000\u03da\u03e1\u0003"+
		"\u0162\u00b1\u0000\u03db\u03e1\u0003\u0164\u00b2\u0000\u03dc\u03e1\u0003"+
		"\u00cae\u0000\u03dd\u03e1\u0003\u00bc^\u0000\u03de\u03e1\u0003\u0084B"+
		"\u0000\u03df\u03e1\u0003\u0086C\u0000\u03e0\u03d7\u0001\u0000\u0000\u0000"+
		"\u03e0\u03d8\u0001\u0000\u0000\u0000\u03e0\u03d9\u0001\u0000\u0000\u0000"+
		"\u03e0\u03da\u0001\u0000\u0000\u0000\u03e0\u03db\u0001\u0000\u0000\u0000"+
		"\u03e0\u03dc\u0001\u0000\u0000\u0000\u03e0\u03dd\u0001\u0000\u0000\u0000"+
		"\u03e0\u03de\u0001\u0000\u0000\u0000\u03e0\u03df\u0001\u0000\u0000\u0000"+
		"\u03e1{\u0001\u0000\u0000\u0000\u03e2\u03eb\u0003\u0080@\u0000\u03e3\u03eb"+
		"\u0003\u00c8d\u0000\u03e4\u03eb\u0003\u00c0`\u0000\u03e5\u03eb\u0003\u00c4"+
		"b\u0000\u03e6\u03eb\u0003\u00c6c\u0000\u03e7\u03eb\u0003\u0082A\u0000"+
		"\u03e8\u03eb\u0003~?\u0000\u03e9\u03eb\u0003\u00acV\u0000\u03ea\u03e2"+
		"\u0001\u0000\u0000\u0000\u03ea\u03e3\u0001\u0000\u0000\u0000\u03ea\u03e4"+
		"\u0001\u0000\u0000\u0000\u03ea\u03e5\u0001\u0000\u0000\u0000\u03ea\u03e6"+
		"\u0001\u0000\u0000\u0000\u03ea\u03e7\u0001\u0000\u0000\u0000\u03ea\u03e8"+
		"\u0001\u0000\u0000\u0000\u03ea\u03e9\u0001\u0000\u0000\u0000\u03eb}\u0001"+
		"\u0000\u0000\u0000\u03ec\u03ed\u0005P\u0000\u0000\u03ed\u03ef\u0005\u0085"+
		"\u0000\u0000\u03ee\u03f0\u0003\u00ccf\u0000\u03ef\u03ee\u0001\u0000\u0000"+
		"\u0000\u03ef\u03f0\u0001\u0000\u0000\u0000\u03f0\u03f1\u0001\u0000\u0000"+
		"\u0000\u03f1\u03f2\u0005f\u0000\u0000\u03f2\u03f3\u0003\u00f6{\u0000\u03f3"+
		"\u03f4\u0005\u0081\u0000\u0000\u03f4\u007f\u0001\u0000\u0000\u0000\u03f5"+
		"\u03f7\u0003\u008aE\u0000\u03f6\u03f5\u0001\u0000\u0000\u0000\u03f6\u03f7"+
		"\u0001\u0000\u0000\u0000\u03f7\u03f9\u0001\u0000\u0000\u0000\u03f8\u03fa"+
		"\u0003\u00deo\u0000\u03f9\u03f8\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001"+
		"\u0000\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb\u0404\u0005"+
		"\u0081\u0000\u0000\u03fc\u03fe\u0003\u00ccf\u0000\u03fd\u03ff\u0003\u008a"+
		"E\u0000\u03fe\u03fd\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000"+
		"\u0000\u03ff\u0400\u0001\u0000\u0000\u0000\u0400\u0401\u0003\u00deo\u0000"+
		"\u0401\u0402\u0005\u0081\u0000\u0000\u0402\u0404\u0001\u0000\u0000\u0000"+
		"\u0403\u03f6\u0001\u0000\u0000\u0000\u0403\u03fc\u0001\u0000\u0000\u0000"+
		"\u0404\u0081\u0001\u0000\u0000\u0000\u0405\u0406\u0005A\u0000\u0000\u0406"+
		"\u0407\u0005V\u0000\u0000\u0407\u0408\u0003\\.\u0000\u0408\u040a\u0005"+
		"{\u0000\u0000\u0409\u040b\u0005\u0004\u0000\u0000\u040a\u0409\u0001\u0000"+
		"\u0000\u0000\u040b\u040c\u0001\u0000\u0000\u0000\u040c\u040a\u0001\u0000"+
		"\u0000\u0000\u040c\u040d\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000"+
		"\u0000\u0000\u040e\u040f\u0005W\u0000\u0000\u040f\u0410\u0005\u0081\u0000"+
		"\u0000\u0410\u0083\u0001\u0000\u0000\u0000\u0411\u0412\u0005\u0081\u0000"+
		"\u0000\u0412\u0085\u0001\u0000\u0000\u0000\u0413\u0414\u0003\u00ccf\u0000"+
		"\u0414\u0415\u0005\u0081\u0000\u0000\u0415\u0087\u0001\u0000\u0000\u0000"+
		"\u0416\u041d\u0003\u008cF\u0000\u0417\u041d\u0003\u0092I\u0000\u0418\u041d"+
		"\u0003\u008eG\u0000\u0419\u041d\u0005*\u0000\u0000\u041a\u041d\u0005K"+
		"\u0000\u0000\u041b\u041d\u0005\u0018\u0000\u0000\u041c\u0416\u0001\u0000"+
		"\u0000\u0000\u041c\u0417\u0001\u0000\u0000\u0000\u041c\u0418\u0001\u0000"+
		"\u0000\u0000\u041c\u0419\u0001\u0000\u0000\u0000\u041c\u041a\u0001\u0000"+
		"\u0000\u0000\u041c\u041b\u0001\u0000\u0000\u0000\u041d\u0089\u0001\u0000"+
		"\u0000\u0000\u041e\u0420\u0003\u0088D\u0000\u041f\u041e\u0001\u0000\u0000"+
		"\u0000\u0420\u0421\u0001\u0000\u0000\u0000\u0421\u0422\u0001\u0000\u0000"+
		"\u0000\u0421\u041f\u0001\u0000\u0000\u0000\u0422\u0424\u0001\u0000\u0000"+
		"\u0000\u0423\u0425\u0003\u00ccf\u0000\u0424\u0423\u0001\u0000\u0000\u0000"+
		"\u0424\u0425\u0001\u0000\u0000\u0000\u0425\u008b\u0001\u0000\u0000\u0000"+
		"\u0426\u0427\u0007\u000b\u0000\u0000\u0427\u008d\u0001\u0000\u0000\u0000"+
		"\u0428\u0429\u0007\f\u0000\u0000\u0429\u008f\u0001\u0000\u0000\u0000\u042a"+
		"\u042b\u0005\u0085\u0000\u0000\u042b\u0091\u0001\u0000\u0000\u0000\u042c"+
		"\u0430\u0003\u0094J\u0000\u042d\u0430\u0003\u0118\u008c\u0000\u042e\u0430"+
		"\u0003\u00a8T\u0000\u042f\u042c\u0001\u0000\u0000\u0000\u042f\u042d\u0001"+
		"\u0000\u0000\u0000\u042f\u042e\u0001\u0000\u0000\u0000\u0430\u0093\u0001"+
		"\u0000\u0000\u0000\u0431\u0436\u0003\u009eO\u0000\u0432\u0436\u0003\u00a4"+
		"R\u0000\u0433\u0436\u0003\u0160\u00b0\u0000\u0434\u0436\u0003\u00f0x\u0000"+
		"\u0435\u0431\u0001\u0000\u0000\u0000\u0435\u0432\u0001\u0000\u0000\u0000"+
		"\u0435\u0433\u0001\u0000\u0000\u0000\u0435\u0434\u0001\u0000\u0000\u0000"+
		"\u0436\u0095\u0001\u0000\u0000\u0000\u0437\u0439\u0003\u0092I\u0000\u0438"+
		"\u0437\u0001\u0000\u0000\u0000\u0439\u043a\u0001\u0000\u0000\u0000\u043a"+
		"\u0438\u0001\u0000\u0000\u0000\u043a\u043b\u0001\u0000\u0000\u0000\u043b"+
		"\u043d\u0001\u0000\u0000\u0000\u043c\u043e\u0003\u00ccf\u0000\u043d\u043c"+
		"\u0001\u0000\u0000\u0000\u043d\u043e\u0001\u0000\u0000\u0000\u043e\u0097"+
		"\u0001\u0000\u0000\u0000\u043f\u0441\u0003\u0094J\u0000\u0440\u043f\u0001"+
		"\u0000\u0000\u0000\u0441\u0442\u0001\u0000\u0000\u0000\u0442\u0440\u0001"+
		"\u0000\u0000\u0000\u0442\u0443\u0001\u0000\u0000\u0000\u0443\u0445\u0001"+
		"\u0000\u0000\u0000\u0444\u0446\u0003\u00ccf\u0000\u0445\u0444\u0001\u0000"+
		"\u0000\u0000\u0445\u0446\u0001\u0000\u0000\u0000\u0446\u0099\u0001\u0000"+
		"\u0000\u0000\u0447\u0448\u0007\r\u0000\u0000\u0448\u009b\u0001\u0000\u0000"+
		"\u0000\u0449\u044a\u0007\u000e\u0000\u0000\u044a\u009d\u0001\u0000\u0000"+
		"\u0000\u044b\u044d\u0003\n\u0005\u0000\u044c\u044b\u0001\u0000\u0000\u0000"+
		"\u044c\u044d\u0001\u0000\u0000\u0000\u044d\u044e\u0001\u0000\u0000\u0000"+
		"\u044e\u0480\u0003\u00a0P\u0000\u044f\u0450\u0003\n\u0005\u0000\u0450"+
		"\u0451\u0005E\u0000\u0000\u0451\u0452\u0003\u0156\u00ab\u0000\u0452\u0480"+
		"\u0001\u0000\u0000\u0000\u0453\u0455\u0003\u009cN\u0000\u0454\u0453\u0001"+
		"\u0000\u0000\u0000\u0454\u0455\u0001\u0000\u0000\u0000\u0455\u0457\u0001"+
		"\u0000\u0000\u0000\u0456\u0458\u0003\u009aM\u0000\u0457\u0456\u0001\u0000"+
		"\u0000\u0000\u0458\u0459\u0001\u0000\u0000\u0000\u0459\u0457\u0001\u0000"+
		"\u0000\u0000\u0459\u045a\u0001\u0000\u0000\u0000\u045a\u0480\u0001\u0000"+
		"\u0000\u0000\u045b\u045d\u0003\u009cN\u0000\u045c\u045b\u0001\u0000\u0000"+
		"\u0000\u045c\u045d\u0001\u0000\u0000\u0000\u045d\u045e\u0001\u0000\u0000"+
		"\u0000\u045e\u0480\u0005\u0013\u0000\u0000\u045f\u0461\u0003\u009cN\u0000"+
		"\u0460\u045f\u0001\u0000\u0000\u0000\u0460\u0461\u0001\u0000\u0000\u0000"+
		"\u0461\u0462\u0001\u0000\u0000\u0000\u0462\u0480\u0005\u0014\u0000\u0000"+
		"\u0463\u0465\u0003\u009cN\u0000\u0464\u0463\u0001\u0000\u0000\u0000\u0464"+
		"\u0465\u0001\u0000\u0000\u0000\u0465\u0466\u0001\u0000\u0000\u0000\u0466"+
		"\u0480\u0005\u0015\u0000\u0000\u0467\u0469\u0003\u009cN\u0000\u0468\u0467"+
		"\u0001\u0000\u0000\u0000\u0468\u0469\u0001\u0000\u0000\u0000\u0469\u046a"+
		"\u0001\u0000\u0000\u0000\u046a\u0480\u0005T\u0000\u0000\u046b\u0480\u0005"+
		"\u000f\u0000\u0000\u046c\u046e\u0003\u009cN\u0000\u046d\u046c\u0001\u0000"+
		"\u0000\u0000\u046d\u046e\u0001\u0000\u0000\u0000\u046e\u0472\u0001\u0000"+
		"\u0000\u0000\u046f\u0471\u0003\u009aM\u0000\u0470\u046f\u0001\u0000\u0000"+
		"\u0000\u0471\u0474\u0001\u0000\u0000\u0000\u0472\u0470\u0001\u0000\u0000"+
		"\u0000\u0472\u0473\u0001\u0000\u0000\u0000\u0473\u0475\u0001\u0000\u0000"+
		"\u0000\u0474\u0472\u0001\u0000\u0000\u0000\u0475\u0480\u0005.\u0000\u0000"+
		"\u0476\u0480\u0003\u009cN\u0000\u0477\u0480\u0005(\u0000\u0000\u0478\u047a"+
		"\u0003\u009aM\u0000\u0479\u0478\u0001\u0000\u0000\u0000\u0479\u047a\u0001"+
		"\u0000\u0000\u0000\u047a\u047b\u0001\u0000\u0000\u0000\u047b\u0480\u0005"+
		"\u001f\u0000\u0000\u047c\u0480\u0005R\u0000\u0000\u047d\u0480\u0005\u000e"+
		"\u0000\u0000\u047e\u0480\u0003\u00a2Q\u0000\u047f\u044c\u0001\u0000\u0000"+
		"\u0000\u047f\u044f\u0001\u0000\u0000\u0000\u047f\u0454\u0001\u0000\u0000"+
		"\u0000\u047f\u045c\u0001\u0000\u0000\u0000\u047f\u0460\u0001\u0000\u0000"+
		"\u0000\u047f\u0464\u0001\u0000\u0000\u0000\u047f\u0468\u0001\u0000\u0000"+
		"\u0000\u047f\u046b\u0001\u0000\u0000\u0000\u047f\u046d\u0001\u0000\u0000"+
		"\u0000\u047f\u0476\u0001\u0000\u0000\u0000\u047f\u0477\u0001\u0000\u0000"+
		"\u0000\u047f\u0479\u0001\u0000\u0000\u0000\u047f\u047c\u0001\u0000\u0000"+
		"\u0000\u047f\u047d\u0001\u0000\u0000\u0000\u047f\u047e\u0001\u0000\u0000"+
		"\u0000\u0480\u009f\u0001\u0000\u0000\u0000\u0481\u0486\u0003\u0116\u008b"+
		"\u0000\u0482\u0486\u0003\u00a6S\u0000\u0483\u0486\u0003\u0090H\u0000\u0484"+
		"\u0486\u0003\u0156\u00ab\u0000\u0485\u0481\u0001\u0000\u0000\u0000\u0485"+
		"\u0482\u0001\u0000\u0000\u0000\u0485\u0483\u0001\u0000\u0000\u0000\u0485"+
		"\u0484\u0001\u0000\u0000\u0000\u0486\u00a1\u0001\u0000\u0000\u0000\u0487"+
		"\u0488\u0005\u001b\u0000\u0000\u0488\u048b\u0005V\u0000\u0000\u0489\u048c"+
		"\u0003Z-\u0000\u048a\u048c\u0005\u000e\u0000\u0000\u048b\u0489\u0001\u0000"+
		"\u0000\u0000\u048b\u048a\u0001\u0000\u0000\u0000\u048c\u048d\u0001\u0000"+
		"\u0000\u0000\u048d\u048e\u0005W\u0000\u0000\u048e\u00a3\u0001\u0000\u0000"+
		"\u0000\u048f\u049e\u0003\u0120\u0090\u0000\u0490\u0492\u0003\u00ccf\u0000"+
		"\u0491\u0490\u0001\u0000\u0000\u0000\u0491\u0492\u0001\u0000\u0000\u0000"+
		"\u0492\u0494\u0001\u0000\u0000\u0000\u0493\u0495\u0003\n\u0005\u0000\u0494"+
		"\u0493\u0001\u0000\u0000\u0000\u0494\u0495\u0001\u0000\u0000\u0000\u0495"+
		"\u0496\u0001\u0000\u0000\u0000\u0496\u049f\u0005\u0085\u0000\u0000\u0497"+
		"\u049f\u0003\u0156\u00ab\u0000\u0498\u049a\u0003\n\u0005\u0000\u0499\u049b"+
		"\u0005E\u0000\u0000\u049a\u0499\u0001\u0000\u0000\u0000\u049a\u049b\u0001"+
		"\u0000\u0000\u0000\u049b\u049c\u0001\u0000\u0000\u0000\u049c\u049d\u0003"+
		"\u0156\u00ab\u0000\u049d\u049f\u0001\u0000\u0000\u0000\u049e\u0491\u0001"+
		"\u0000\u0000\u0000\u049e\u0497\u0001\u0000\u0000\u0000\u049e\u0498\u0001"+
		"\u0000\u0000\u0000\u049f\u04a6\u0001\u0000\u0000\u0000\u04a0\u04a2\u0005"+
		"\"\u0000\u0000\u04a1\u04a3\u0003\n\u0005\u0000\u04a2\u04a1\u0001\u0000"+
		"\u0000\u0000\u04a2\u04a3\u0001\u0000\u0000\u0000\u04a3\u04a4\u0001\u0000"+
		"\u0000\u0000\u04a4\u04a6\u0005\u0085\u0000\u0000\u04a5\u048f\u0001\u0000"+
		"\u0000\u0000\u04a5\u04a0\u0001\u0000\u0000\u0000\u04a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u04a7\u04a8\u0005\u0085\u0000\u0000\u04a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u04a9\u04aa\u0003\u00aaU\u0000\u04aa\u04af\u0005Z\u0000\u0000"+
		"\u04ab\u04ad\u0003\u00b2Y\u0000\u04ac\u04ae\u0005{\u0000\u0000\u04ad\u04ac"+
		"\u0001\u0000\u0000\u0000\u04ad\u04ae\u0001\u0000\u0000\u0000\u04ae\u04b0"+
		"\u0001\u0000\u0000\u0000\u04af\u04ab\u0001\u0000\u0000\u0000\u04af\u04b0"+
		"\u0001\u0000\u0000\u0000\u04b0\u04b1\u0001\u0000\u0000\u0000\u04b1\u04b2"+
		"\u0005[\u0000\u0000\u04b2\u00a9\u0001\u0000\u0000\u0000\u04b3\u04b5\u0003"+
		"\u00aeW\u0000\u04b4\u04b6\u0003\u00ccf\u0000\u04b5\u04b4\u0001\u0000\u0000"+
		"\u0000\u04b5\u04b6\u0001\u0000\u0000\u0000\u04b6\u04bb\u0001\u0000\u0000"+
		"\u0000\u04b7\u04b9\u0003\n\u0005\u0000\u04b8\u04b7\u0001\u0000\u0000\u0000"+
		"\u04b8\u04b9\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001\u0000\u0000\u0000"+
		"\u04ba\u04bc\u0005\u0085\u0000\u0000\u04bb\u04b8\u0001\u0000\u0000\u0000"+
		"\u04bb\u04bc\u0001\u0000\u0000\u0000\u04bc\u04be\u0001\u0000\u0000\u0000"+
		"\u04bd\u04bf\u0003\u00b0X\u0000\u04be\u04bd\u0001\u0000\u0000\u0000\u04be"+
		"\u04bf\u0001\u0000\u0000\u0000\u04bf\u00ab\u0001\u0000\u0000\u0000\u04c0"+
		"\u04c2\u0003\u00aeW\u0000\u04c1\u04c3\u0003\u00ccf\u0000\u04c2\u04c1\u0001"+
		"\u0000\u0000\u0000\u04c2\u04c3\u0001\u0000\u0000\u0000\u04c3\u04c4\u0001"+
		"\u0000\u0000\u0000\u04c4\u04c6\u0005\u0085\u0000\u0000\u04c5\u04c7\u0003"+
		"\u00b0X\u0000\u04c6\u04c5\u0001\u0000\u0000\u0000\u04c6\u04c7\u0001\u0000"+
		"\u0000\u0000\u04c7\u04c8\u0001\u0000\u0000\u0000\u04c8\u04c9\u0005\u0081"+
		"\u0000\u0000\u04c9\u00ad\u0001\u0000\u0000\u0000\u04ca\u04cc\u0005\"\u0000"+
		"\u0000\u04cb\u04cd\u0007\u000f\u0000\u0000\u04cc\u04cb\u0001\u0000\u0000"+
		"\u0000\u04cc\u04cd\u0001\u0000\u0000\u0000\u04cd\u00af\u0001\u0000\u0000"+
		"\u0000\u04ce\u04cf\u0005\u007f\u0000\u0000\u04cf\u04d0\u0003\u0096K\u0000"+
		"\u04d0\u00b1\u0001\u0000\u0000\u0000\u04d1\u04d6\u0003\u00b4Z\u0000\u04d2"+
		"\u04d3\u0005{\u0000\u0000\u04d3\u04d5\u0003\u00b4Z\u0000\u04d4\u04d2\u0001"+
		"\u0000\u0000\u0000\u04d5\u04d8\u0001\u0000\u0000\u0000\u04d6\u04d4\u0001"+
		"\u0000\u0000\u0000\u04d6\u04d7\u0001\u0000\u0000\u0000\u04d7\u00b3\u0001"+
		"\u0000\u0000\u0000\u04d8\u04d6\u0001\u0000\u0000\u0000\u04d9\u04dc\u0003"+
		"\u00b6[\u0000\u04da\u04db\u0005f\u0000\u0000\u04db\u04dd\u0003\\.\u0000"+
		"\u04dc\u04da\u0001\u0000\u0000\u0000\u04dc\u04dd\u0001\u0000\u0000\u0000"+
		"\u04dd\u00b5\u0001\u0000\u0000\u0000\u04de\u04df\u0005\u0085\u0000\u0000"+
		"\u04df\u00b7\u0001\u0000\u0000\u0000\u04e0\u04e3\u0003\u00ba]\u0000\u04e1"+
		"\u04e3\u0003\u00be_\u0000\u04e2\u04e0\u0001\u0000\u0000\u0000\u04e2\u04e1"+
		"\u0001\u0000\u0000\u0000\u04e3\u00b9\u0001\u0000\u0000\u0000\u04e4\u04e5"+
		"\u0005\u0085\u0000\u0000\u04e5\u00bb\u0001\u0000\u0000\u0000\u04e6\u04e8"+
		"\u0005-\u0000\u0000\u04e7\u04e6\u0001\u0000\u0000\u0000\u04e7\u04e8\u0001"+
		"\u0000\u0000\u0000\u04e8\u04e9\u0001\u0000\u0000\u0000\u04e9\u04ec\u0005"+
		"1\u0000\u0000\u04ea\u04ed\u0005\u0085\u0000\u0000\u04eb\u04ed\u0003\u00ba"+
		"]\u0000\u04ec\u04ea\u0001\u0000\u0000\u0000\u04ec\u04eb\u0001\u0000\u0000"+
		"\u0000\u04ec\u04ed\u0001\u0000\u0000\u0000\u04ed\u04ee\u0001\u0000\u0000"+
		"\u0000\u04ee\u04f0\u0005Z\u0000\u0000\u04ef\u04f1\u0003x<\u0000\u04f0"+
		"\u04ef\u0001\u0000\u0000\u0000\u04f0\u04f1\u0001\u0000\u0000\u0000\u04f1"+
		"\u04f2\u0001\u0000\u0000\u0000\u04f2\u04f3\u0005[\u0000\u0000\u04f3\u00bd"+
		"\u0001\u0000\u0000\u0000\u04f4\u04f5\u0005\u0085\u0000\u0000\u04f5\u00bf"+
		"\u0001\u0000\u0000\u0000\u04f6\u04f7\u00051\u0000\u0000\u04f7\u04f8\u0005"+
		"\u0085\u0000\u0000\u04f8\u04f9\u0005f\u0000\u0000\u04f9\u04fa\u0003\u00c2"+
		"a\u0000\u04fa\u04fb\u0005\u0081\u0000\u0000\u04fb\u00c1\u0001\u0000\u0000"+
		"\u0000\u04fc\u04fe\u0003\n\u0005\u0000\u04fd\u04fc\u0001\u0000\u0000\u0000"+
		"\u04fd\u04fe\u0001\u0000\u0000\u0000\u04fe\u04ff\u0001\u0000\u0000\u0000"+
		"\u04ff\u0500\u0003\u00b8\\\u0000\u0500\u00c3\u0001\u0000\u0000\u0000\u0501"+
		"\u0507\u0005P\u0000\u0000\u0502\u0504\u0005M\u0000\u0000\u0503\u0502\u0001"+
		"\u0000\u0000\u0000\u0503\u0504\u0001\u0000\u0000\u0000\u0504\u0505\u0001"+
		"\u0000\u0000\u0000\u0505\u0508\u0003\n\u0005\u0000\u0506\u0508\u0005\u0080"+
		"\u0000\u0000\u0507\u0503\u0001\u0000\u0000\u0000\u0507\u0506\u0001\u0000"+
		"\u0000\u0000\u0508\u0509\u0001\u0000\u0000\u0000\u0509\u050a\u0003\u0006"+
		"\u0003\u0000\u050a\u050b\u0005\u0081\u0000\u0000\u050b\u00c5\u0001\u0000"+
		"\u0000\u0000\u050c\u050e\u0003\u00ccf\u0000\u050d\u050c\u0001\u0000\u0000"+
		"\u0000\u050d\u050e\u0001\u0000\u0000\u0000\u050e\u050f\u0001\u0000\u0000"+
		"\u0000\u050f\u0510\u0005P\u0000\u0000\u0510\u0512\u00051\u0000\u0000\u0511"+
		"\u0513\u0003\n\u0005\u0000\u0512\u0511\u0001\u0000\u0000\u0000\u0512\u0513"+
		"\u0001\u0000\u0000\u0000\u0513\u0514\u0001\u0000\u0000\u0000\u0514\u0515"+
		"\u0003\u00b8\\\u0000\u0515\u0516\u0005\u0081\u0000\u0000\u0516\u00c7\u0001"+
		"\u0000\u0000\u0000\u0517\u0518\u0005\r\u0000\u0000\u0518\u051a\u0005V"+
		"\u0000\u0000\u0519\u051b\u0005\u0004\u0000\u0000\u051a\u0519\u0001\u0000"+
		"\u0000\u0000\u051b\u051c\u0001\u0000\u0000\u0000\u051c\u051a\u0001\u0000"+
		"\u0000\u0000\u051c\u051d\u0001\u0000\u0000\u0000\u051d\u051e\u0001\u0000"+
		"\u0000\u0000\u051e\u051f\u0005W\u0000\u0000\u051f\u0520\u0005\u0081\u0000"+
		"\u0000\u0520\u00c9\u0001\u0000\u0000\u0000\u0521\u0522\u0005%\u0000\u0000"+
		"\u0522\u0529\u0005\u0004\u0000\u0000\u0523\u0525\u0005Z\u0000\u0000\u0524"+
		"\u0526\u0003x<\u0000\u0525\u0524\u0001\u0000\u0000\u0000\u0525\u0526\u0001"+
		"\u0000\u0000\u0000\u0526\u0527\u0001\u0000\u0000\u0000\u0527\u052a\u0005"+
		"[\u0000\u0000\u0528\u052a\u0003z=\u0000\u0529\u0523\u0001\u0000\u0000"+
		"\u0000\u0529\u0528\u0001\u0000\u0000\u0000\u052a\u00cb\u0001\u0000\u0000"+
		"\u0000\u052b\u052d\u0003\u00ceg\u0000\u052c\u052b\u0001\u0000\u0000\u0000"+
		"\u052d\u052e\u0001\u0000\u0000\u0000\u052e\u052c\u0001\u0000\u0000\u0000"+
		"\u052e\u052f\u0001\u0000\u0000\u0000\u052f\u00cd\u0001\u0000\u0000\u0000"+
		"\u0530\u0531\u0005X\u0000\u0000\u0531\u0533\u0005X\u0000\u0000\u0532\u0534"+
		"\u0003\u00d2i\u0000\u0533\u0532\u0001\u0000\u0000\u0000\u0533\u0534\u0001"+
		"\u0000\u0000\u0000\u0534\u0535\u0001\u0000\u0000\u0000\u0535\u0536\u0005"+
		"Y\u0000\u0000\u0536\u0539\u0005Y\u0000\u0000\u0537\u0539\u0003\u00d0h"+
		"\u0000\u0538\u0530\u0001\u0000\u0000\u0000\u0538\u0537\u0001\u0000\u0000"+
		"\u0000\u0539\u00cf\u0001\u0000\u0000\u0000\u053a\u053b\u0005\u000b\u0000"+
		"\u0000\u053b\u053e\u0005V\u0000\u0000\u053c\u053f\u0003\u00f6{\u0000\u053d"+
		"\u053f\u0003\\.\u0000\u053e\u053c\u0001\u0000\u0000\u0000\u053e\u053d"+
		"\u0001\u0000\u0000\u0000\u053f\u0541\u0001\u0000\u0000\u0000\u0540\u0542"+
		"\u0005\u0084\u0000\u0000\u0541\u0540\u0001\u0000\u0000\u0000\u0541\u0542"+
		"\u0001\u0000\u0000\u0000\u0542\u0543\u0001\u0000\u0000\u0000\u0543\u0544"+
		"\u0005W\u0000\u0000\u0544\u00d1\u0001\u0000\u0000\u0000\u0545\u054a\u0003"+
		"\u00d4j\u0000\u0546\u0547\u0005{\u0000\u0000\u0547\u0549\u0003\u00d4j"+
		"\u0000\u0548\u0546\u0001\u0000\u0000\u0000\u0549\u054c\u0001\u0000\u0000"+
		"\u0000\u054a\u0548\u0001\u0000\u0000\u0000\u054a\u054b\u0001\u0000\u0000"+
		"\u0000\u054b\u054e\u0001\u0000\u0000\u0000\u054c\u054a\u0001\u0000\u0000"+
		"\u0000\u054d\u054f\u0005\u0084\u0000\u0000\u054e\u054d\u0001\u0000\u0000"+
		"\u0000\u054e\u054f\u0001\u0000\u0000\u0000\u054f\u00d3\u0001\u0000\u0000"+
		"\u0000\u0550\u0551\u0003\u00d6k\u0000\u0551\u0552\u0005\u0080\u0000\u0000"+
		"\u0552\u0554\u0001\u0000\u0000\u0000\u0553\u0550\u0001\u0000\u0000\u0000"+
		"\u0553\u0554\u0001\u0000\u0000\u0000\u0554\u0555\u0001\u0000\u0000\u0000"+
		"\u0555\u0557\u0005\u0085\u0000\u0000\u0556\u0558\u0003\u00d8l\u0000\u0557"+
		"\u0556\u0001\u0000\u0000\u0000\u0557\u0558\u0001\u0000\u0000\u0000\u0558"+
		"\u00d5\u0001\u0000\u0000\u0000\u0559\u055a\u0005\u0085\u0000\u0000\u055a"+
		"\u00d7\u0001\u0000\u0000\u0000\u055b\u055d\u0005V\u0000\u0000\u055c\u055e"+
		"\u0003\u00dam\u0000\u055d\u055c\u0001\u0000\u0000\u0000\u055d\u055e\u0001"+
		"\u0000\u0000\u0000\u055e\u055f\u0001\u0000\u0000\u0000\u055f\u0560\u0005"+
		"W\u0000\u0000\u0560\u00d9\u0001\u0000\u0000\u0000\u0561\u0563\u0003\u00dc"+
		"n\u0000\u0562\u0561\u0001\u0000\u0000\u0000\u0563\u0564\u0001\u0000\u0000"+
		"\u0000\u0564\u0562\u0001\u0000\u0000\u0000\u0564\u0565\u0001\u0000\u0000"+
		"\u0000\u0565\u00db\u0001\u0000\u0000\u0000\u0566\u0567\u0005V\u0000\u0000"+
		"\u0567\u0568\u0003\u00dam\u0000\u0568\u0569\u0005W\u0000\u0000\u0569\u0578"+
		"\u0001\u0000\u0000\u0000\u056a\u056b\u0005X\u0000\u0000\u056b\u056c\u0003"+
		"\u00dam\u0000\u056c\u056d\u0005Y\u0000\u0000\u056d\u0578\u0001\u0000\u0000"+
		"\u0000\u056e\u056f\u0005Z\u0000\u0000\u056f\u0570\u0003\u00dam\u0000\u0570"+
		"\u0571\u0005[\u0000\u0000\u0571\u0578\u0001\u0000\u0000\u0000\u0572\u0574"+
		"\b\u0010\u0000\u0000\u0573\u0572\u0001\u0000\u0000\u0000\u0574\u0575\u0001"+
		"\u0000\u0000\u0000\u0575\u0573\u0001\u0000\u0000\u0000\u0575\u0576\u0001"+
		"\u0000\u0000\u0000\u0576\u0578\u0001\u0000\u0000\u0000\u0577\u0566\u0001"+
		"\u0000\u0000\u0000\u0577\u056a\u0001\u0000\u0000\u0000\u0577\u056e\u0001"+
		"\u0000\u0000\u0000\u0577\u0573\u0001\u0000\u0000\u0000\u0578\u00dd\u0001"+
		"\u0000\u0000\u0000\u0579\u057e\u0003\u00e0p\u0000\u057a\u057b\u0005{\u0000"+
		"\u0000\u057b\u057d\u0003\u00e0p\u0000\u057c\u057a\u0001\u0000\u0000\u0000"+
		"\u057d\u0580\u0001\u0000\u0000\u0000\u057e\u057c\u0001\u0000\u0000\u0000"+
		"\u057e\u057f\u0001\u0000\u0000\u0000\u057f\u00df\u0001\u0000\u0000\u0000"+
		"\u0580\u057e\u0001\u0000\u0000\u0000\u0581\u0583\u0003\u00e2q\u0000\u0582"+
		"\u0584\u0003\u010c\u0086\u0000\u0583\u0582\u0001\u0000\u0000\u0000\u0583"+
		"\u0584\u0001\u0000\u0000\u0000\u0584\u00e1\u0001\u0000\u0000\u0000\u0585"+
		"\u058b\u0003\u00e4r\u0000\u0586\u0587\u0003\u00e6s\u0000\u0587\u0588\u0003"+
		"\u00e8t\u0000\u0588\u0589\u0003\u00eau\u0000\u0589\u058b\u0001\u0000\u0000"+
		"\u0000\u058a\u0585\u0001\u0000\u0000\u0000\u058a\u0586\u0001\u0000\u0000"+
		"\u0000\u058b\u00e3\u0001\u0000\u0000\u0000\u058c\u058e\u0003\u00ecv\u0000"+
		"\u058d\u058f\u0005\u0017\u0000\u0000\u058e\u058d\u0001\u0000\u0000\u0000"+
		"\u058e\u058f\u0001\u0000\u0000\u0000\u058f\u0591\u0001\u0000\u0000\u0000"+
		"\u0590\u058c\u0001\u0000\u0000\u0000\u0591\u0594\u0001\u0000\u0000\u0000"+
		"\u0592\u0590\u0001\u0000\u0000\u0000\u0592\u0593\u0001\u0000\u0000\u0000"+
		"\u0593\u0595\u0001\u0000\u0000\u0000\u0594\u0592\u0001\u0000\u0000\u0000"+
		"\u0595\u0596\u0003\u00e6s\u0000\u0596\u00e5\u0001\u0000\u0000\u0000\u0597"+
		"\u0598\u0006s\uffff\uffff\u0000\u0598\u059a\u0003\u00f4z\u0000\u0599\u059b"+
		"\u0003\u00ccf\u0000\u059a\u0599\u0001\u0000\u0000\u0000\u059a\u059b\u0001"+
		"\u0000\u0000\u0000\u059b\u05a1\u0001\u0000\u0000\u0000\u059c\u059d\u0005"+
		"V\u0000\u0000\u059d\u059e\u0003\u00e4r\u0000\u059e\u059f\u0005W\u0000"+
		"\u0000\u059f\u05a1\u0001\u0000\u0000\u0000\u05a0\u0597\u0001\u0000\u0000"+
		"\u0000\u05a0\u059c\u0001\u0000\u0000\u0000\u05a1\u05b0\u0001\u0000\u0000"+
		"\u0000\u05a2\u05ac\n\u0002\u0000\u0000\u05a3\u05ad\u0003\u00e8t\u0000"+
		"\u05a4\u05a6\u0005X\u0000\u0000\u05a5\u05a7\u0003\\.\u0000\u05a6\u05a5"+
		"\u0001\u0000\u0000\u0000\u05a6\u05a7\u0001\u0000\u0000\u0000\u05a7\u05a8"+
		"\u0001\u0000\u0000\u0000\u05a8\u05aa\u0005Y\u0000\u0000\u05a9\u05ab\u0003"+
		"\u00ccf\u0000\u05aa\u05a9\u0001\u0000\u0000\u0000\u05aa\u05ab\u0001\u0000"+
		"\u0000\u0000\u05ab\u05ad\u0001\u0000\u0000\u0000\u05ac\u05a3\u0001\u0000"+
		"\u0000\u0000\u05ac\u05a4\u0001\u0000\u0000\u0000\u05ad\u05af\u0001\u0000"+
		"\u0000\u0000\u05ae\u05a2\u0001\u0000\u0000\u0000\u05af\u05b2\u0001\u0000"+
		"\u0000\u0000\u05b0\u05ae\u0001\u0000\u0000\u0000\u05b0\u05b1\u0001\u0000"+
		"\u0000\u0000\u05b1\u00e7\u0001\u0000\u0000\u0000\u05b2\u05b0\u0001\u0000"+
		"\u0000\u0000\u05b3\u05b5\u0005V\u0000\u0000\u05b4\u05b6\u0003\u0102\u0081"+
		"\u0000\u05b5\u05b4\u0001\u0000\u0000\u0000\u05b5\u05b6\u0001\u0000\u0000"+
		"\u0000\u05b6\u05b7\u0001\u0000\u0000\u0000\u05b7\u05b9\u0005W\u0000\u0000"+
		"\u05b8\u05ba\u0003\u00eew\u0000\u05b9\u05b8\u0001\u0000\u0000\u0000\u05b9"+
		"\u05ba\u0001\u0000\u0000\u0000\u05ba\u05bc\u0001\u0000\u0000\u0000\u05bb"+
		"\u05bd\u0003\u00f2y\u0000\u05bc\u05bb\u0001\u0000\u0000\u0000\u05bc\u05bd"+
		"\u0001\u0000\u0000\u0000\u05bd\u05bf\u0001\u0000\u0000\u0000\u05be\u05c0"+
		"\u0003\u0172\u00b9\u0000\u05bf\u05be\u0001\u0000\u0000\u0000\u05bf\u05c0"+
		"\u0001\u0000\u0000\u0000\u05c0\u05c2\u0001\u0000\u0000\u0000\u05c1\u05c3"+
		"\u0003\u00ccf\u0000\u05c2\u05c1\u0001\u0000\u0000\u0000\u05c2\u05c3\u0001"+
		"\u0000\u0000\u0000\u05c3\u00e9\u0001\u0000\u0000\u0000\u05c4\u05c5\u0005"+
		"}\u0000\u0000\u05c5\u05c7\u0003\u0098L\u0000\u05c6\u05c8\u0003\u00f8|"+
		"\u0000\u05c7\u05c6\u0001\u0000\u0000\u0000\u05c7\u05c8\u0001\u0000\u0000"+
		"\u0000\u05c8\u00eb\u0001\u0000\u0000\u0000\u05c9\u05cb\u0007\u0011\u0000"+
		"\u0000\u05ca\u05cc\u0003\u00ccf\u0000\u05cb\u05ca\u0001\u0000\u0000\u0000"+
		"\u05cb\u05cc\u0001\u0000\u0000\u0000\u05cc\u05d8\u0001\u0000\u0000\u0000"+
		"\u05cd\u05cf\u0003\n\u0005\u0000\u05ce\u05cd\u0001\u0000\u0000\u0000\u05ce"+
		"\u05cf\u0001\u0000\u0000\u0000\u05cf\u05d0\u0001\u0000\u0000\u0000\u05d0"+
		"\u05d2\u0005^\u0000\u0000\u05d1\u05d3\u0003\u00ccf\u0000\u05d2\u05d1\u0001"+
		"\u0000\u0000\u0000\u05d2\u05d3\u0001\u0000\u0000\u0000\u05d3\u05d5\u0001"+
		"\u0000\u0000\u0000\u05d4\u05d6\u0003\u00eew\u0000\u05d5\u05d4\u0001\u0000"+
		"\u0000\u0000\u05d5\u05d6\u0001\u0000\u0000\u0000\u05d6\u05d8\u0001\u0000"+
		"\u0000\u0000\u05d7\u05c9\u0001\u0000\u0000\u0000\u05d7\u05ce\u0001\u0000"+
		"\u0000\u0000\u05d8\u00ed\u0001\u0000\u0000\u0000\u05d9\u05db\u0003\u00f0"+
		"x\u0000\u05da\u05d9\u0001\u0000\u0000\u0000\u05db\u05dc\u0001\u0000\u0000"+
		"\u0000\u05dc\u05da\u0001\u0000\u0000\u0000\u05dc\u05dd\u0001\u0000\u0000"+
		"\u0000\u05dd\u00ef\u0001\u0000\u0000\u0000\u05de\u05df\u0007\u0012\u0000"+
		"\u0000\u05df\u00f1\u0001\u0000\u0000\u0000\u05e0\u05e1\u0007\u0011\u0000"+
		"\u0000\u05e1\u00f3\u0001\u0000\u0000\u0000\u05e2\u05e4\u0005\u0084\u0000"+
		"\u0000\u05e3\u05e2\u0001\u0000\u0000\u0000\u05e3\u05e4\u0001\u0000\u0000"+
		"\u0000\u05e4\u05e5\u0001\u0000\u0000\u0000\u05e5\u05e6\u0003\u0004\u0002"+
		"\u0000\u05e6\u00f5\u0001\u0000\u0000\u0000\u05e7\u05e9\u0003\u0096K\u0000"+
		"\u05e8\u05ea\u0003\u00f8|\u0000\u05e9\u05e8\u0001\u0000\u0000\u0000\u05e9"+
		"\u05ea\u0001\u0000\u0000\u0000\u05ea\u00f7\u0001\u0000\u0000\u0000\u05eb"+
		"\u05f4\u0003\u00fa}\u0000\u05ec\u05ee\u0003\u00fc~\u0000\u05ed\u05ec\u0001"+
		"\u0000\u0000\u0000\u05ed\u05ee\u0001\u0000\u0000\u0000\u05ee\u05ef\u0001"+
		"\u0000\u0000\u0000\u05ef\u05f0\u0003\u00e8t\u0000\u05f0\u05f1\u0003\u00ea"+
		"u\u0000\u05f1\u05f4\u0001\u0000\u0000\u0000\u05f2\u05f4\u0003\u00fe\u007f"+
		"\u0000\u05f3\u05eb\u0001\u0000\u0000\u0000\u05f3\u05ed\u0001\u0000\u0000"+
		"\u0000\u05f3\u05f2\u0001\u0000\u0000\u0000\u05f4\u00f9\u0001\u0000\u0000"+
		"\u0000\u05f5\u05ff\u0003\u00fc~\u0000\u05f6\u05f8\u0003\u00ecv\u0000\u05f7"+
		"\u05f6\u0001\u0000\u0000\u0000\u05f8\u05f9\u0001\u0000\u0000\u0000\u05f9"+
		"\u05f7\u0001\u0000\u0000\u0000\u05f9\u05fa\u0001\u0000\u0000\u0000\u05fa"+
		"\u05fc\u0001\u0000\u0000\u0000\u05fb\u05fd\u0003\u00fc~\u0000\u05fc\u05fb"+
		"\u0001\u0000\u0000\u0000\u05fc\u05fd\u0001\u0000\u0000\u0000\u05fd\u05ff"+
		"\u0001\u0000\u0000\u0000\u05fe\u05f5\u0001\u0000\u0000\u0000\u05fe\u05f7"+
		"\u0001\u0000\u0000\u0000\u05ff\u00fb\u0001\u0000\u0000\u0000\u0600\u0601"+
		"\u0006~\uffff\uffff\u0000\u0601\u060f\u0003\u00e8t\u0000\u0602\u0604\u0005"+
		"X\u0000\u0000\u0603\u0605\u0003\\.\u0000\u0604\u0603\u0001\u0000\u0000"+
		"\u0000\u0604\u0605\u0001\u0000\u0000\u0000\u0605\u0606\u0001\u0000\u0000"+
		"\u0000\u0606\u0608\u0005Y\u0000\u0000\u0607\u0609\u0003\u00ccf\u0000\u0608"+
		"\u0607\u0001\u0000\u0000\u0000\u0608\u0609\u0001\u0000\u0000\u0000\u0609"+
		"\u060f\u0001\u0000\u0000\u0000\u060a\u060b\u0005V\u0000\u0000\u060b\u060c"+
		"\u0003\u00fa}\u0000\u060c\u060d\u0005W\u0000\u0000\u060d\u060f\u0001\u0000"+
		"\u0000\u0000\u060e\u0600\u0001\u0000\u0000\u0000\u060e\u0602\u0001\u0000"+
		"\u0000\u0000\u060e\u060a\u0001\u0000\u0000\u0000\u060f\u061f\u0001\u0000"+
		"\u0000\u0000\u0610\u061b\n\u0004\u0000\u0000\u0611\u061c\u0003\u00e8t"+
		"\u0000\u0612\u0613\u0003\u00fc~\u0000\u0613\u0615\u0005X\u0000\u0000\u0614"+
		"\u0616\u0003\\.\u0000\u0615\u0614\u0001\u0000\u0000\u0000\u0615\u0616"+
		"\u0001\u0000\u0000\u0000\u0616\u0617\u0001\u0000\u0000\u0000\u0617\u0619"+
		"\u0005Y\u0000\u0000\u0618\u061a\u0003\u00ccf\u0000\u0619\u0618\u0001\u0000"+
		"\u0000\u0000\u0619\u061a\u0001\u0000\u0000\u0000\u061a\u061c\u0001\u0000"+
		"\u0000\u0000\u061b\u0611\u0001\u0000\u0000\u0000\u061b\u0612\u0001\u0000"+
		"\u0000\u0000\u061c\u061e\u0001\u0000\u0000\u0000\u061d\u0610\u0001\u0000"+
		"\u0000\u0000\u061e\u0621\u0001\u0000\u0000\u0000\u061f\u061d\u0001\u0000"+
		"\u0000\u0000\u061f\u0620\u0001\u0000\u0000\u0000\u0620\u00fd\u0001\u0000"+
		"\u0000\u0000\u0621\u061f\u0001\u0000\u0000\u0000\u0622\u0624\u0003\u00ec"+
		"v\u0000\u0623\u0622\u0001\u0000\u0000\u0000\u0624\u0627\u0001\u0000\u0000"+
		"\u0000\u0625\u0623\u0001\u0000\u0000\u0000\u0625\u0626\u0001\u0000\u0000"+
		"\u0000\u0626\u0628\u0001\u0000\u0000\u0000\u0627\u0625\u0001\u0000\u0000"+
		"\u0000\u0628\u0629\u0003\u0100\u0080\u0000\u0629\u00ff\u0001\u0000\u0000"+
		"\u0000\u062a\u062b\u0006\u0080\uffff\uffff\u0000\u062b\u062c\u0005\u0084"+
		"\u0000\u0000\u062c\u063b\u0001\u0000\u0000\u0000\u062d\u0637\n\u0002\u0000"+
		"\u0000\u062e\u0638\u0003\u00e8t\u0000\u062f\u0631\u0005X\u0000\u0000\u0630"+
		"\u0632\u0003\\.\u0000\u0631\u0630\u0001\u0000\u0000\u0000\u0631\u0632"+
		"\u0001\u0000\u0000\u0000\u0632\u0633\u0001\u0000\u0000\u0000\u0633\u0635"+
		"\u0005Y\u0000\u0000\u0634\u0636\u0003\u00ccf\u0000\u0635\u0634\u0001\u0000"+
		"\u0000\u0000\u0635\u0636\u0001\u0000\u0000\u0000\u0636\u0638\u0001\u0000"+
		"\u0000\u0000\u0637\u062e\u0001\u0000\u0000\u0000\u0637\u062f\u0001\u0000"+
		"\u0000\u0000\u0638\u063a\u0001\u0000\u0000\u0000\u0639\u062d\u0001\u0000"+
		"\u0000\u0000\u063a\u063d\u0001\u0000\u0000\u0000\u063b\u0639\u0001\u0000"+
		"\u0000\u0000\u063b\u063c\u0001\u0000\u0000\u0000\u063c\u0101\u0001\u0000"+
		"\u0000\u0000\u063d\u063b\u0001\u0000\u0000\u0000\u063e\u0647\u0005\u0084"+
		"\u0000\u0000\u063f\u0644\u0003\u0104\u0082\u0000\u0640\u0642\u0005{\u0000"+
		"\u0000\u0641\u0640\u0001\u0000\u0000\u0000\u0641\u0642\u0001\u0000\u0000"+
		"\u0000\u0642\u0643\u0001\u0000\u0000\u0000\u0643\u0645\u0005\u0084\u0000"+
		"\u0000\u0644\u0641\u0001\u0000\u0000\u0000\u0644\u0645\u0001\u0000\u0000"+
		"\u0000\u0645\u0647\u0001\u0000\u0000\u0000\u0646\u063e\u0001\u0000\u0000"+
		"\u0000\u0646\u063f\u0001\u0000\u0000\u0000\u0647\u0103\u0001\u0000\u0000"+
		"\u0000\u0648\u064d\u0003\u0106\u0083\u0000\u0649\u064a\u0005{\u0000\u0000"+
		"\u064a\u064c\u0003\u0106\u0083\u0000\u064b\u0649\u0001\u0000\u0000\u0000"+
		"\u064c\u064f\u0001\u0000\u0000\u0000\u064d\u064b\u0001\u0000\u0000\u0000"+
		"\u064d\u064e\u0001\u0000\u0000\u0000\u064e\u0105\u0001\u0000\u0000\u0000"+
		"\u064f\u064d\u0001\u0000\u0000\u0000\u0650\u0652\u0003\u00ccf\u0000\u0651"+
		"\u0650\u0001\u0000\u0000\u0000\u0651\u0652\u0001\u0000\u0000\u0000\u0652"+
		"\u0653\u0001\u0000\u0000\u0000\u0653\u0658\u0003\u008aE\u0000\u0654\u0659"+
		"\u0003\u00e2q\u0000\u0655\u0657\u0003\u00f8|\u0000\u0656\u0655\u0001\u0000"+
		"\u0000\u0000\u0656\u0657\u0001\u0000\u0000\u0000\u0657\u0659\u0001\u0000"+
		"\u0000\u0000\u0658\u0654\u0001\u0000\u0000\u0000\u0658\u0656\u0001\u0000"+
		"\u0000\u0000\u0659\u065c\u0001\u0000\u0000\u0000\u065a\u065b\u0005f\u0000"+
		"\u0000\u065b\u065d\u0003\u0110\u0088\u0000\u065c\u065a\u0001\u0000\u0000"+
		"\u0000\u065c\u065d\u0001\u0000\u0000\u0000\u065d\u0107\u0001\u0000\u0000"+
		"\u0000\u065e\u0660\u0003\u00ccf\u0000\u065f\u065e\u0001\u0000\u0000\u0000"+
		"\u065f\u0660\u0001\u0000\u0000\u0000\u0660\u0662\u0001\u0000\u0000\u0000"+
		"\u0661\u0663\u0003\u008aE\u0000\u0662\u0661\u0001\u0000\u0000\u0000\u0662"+
		"\u0663\u0001\u0000\u0000\u0000\u0663\u0664\u0001\u0000\u0000\u0000\u0664"+
		"\u0666\u0003\u00e2q\u0000\u0665\u0667\u0003\u012a\u0095\u0000\u0666\u0665"+
		"\u0001\u0000\u0000\u0000\u0666\u0667\u0001\u0000\u0000\u0000\u0667\u0668"+
		"\u0001\u0000\u0000\u0000\u0668\u0669\u0003\u010a\u0085\u0000\u0669\u0109"+
		"\u0001\u0000\u0000\u0000\u066a\u066c\u0003\u0142\u00a1\u0000\u066b\u066a"+
		"\u0001\u0000\u0000\u0000\u066b\u066c\u0001\u0000\u0000\u0000\u066c\u066d"+
		"\u0001\u0000\u0000\u0000\u066d\u0673\u0003d2\u0000\u066e\u0673\u0003\u0168"+
		"\u00b4\u0000\u066f\u0670\u0005f\u0000\u0000\u0670\u0671\u0007\u0013\u0000"+
		"\u0000\u0671\u0673\u0005\u0081\u0000\u0000\u0672\u066b\u0001\u0000\u0000"+
		"\u0000\u0672\u066e\u0001\u0000\u0000\u0000\u0672\u066f\u0001\u0000\u0000"+
		"\u0000\u0673\u010b\u0001\u0000\u0000\u0000\u0674\u067a\u0003\u010e\u0087"+
		"\u0000\u0675\u0676\u0005V\u0000\u0000\u0676\u0677\u0003\"\u0011\u0000"+
		"\u0677\u0678\u0005W\u0000\u0000\u0678\u067a\u0001\u0000\u0000\u0000\u0679"+
		"\u0674\u0001\u0000\u0000\u0000\u0679\u0675\u0001\u0000\u0000\u0000\u067a"+
		"\u010d\u0001\u0000\u0000\u0000\u067b\u067c\u0005f\u0000\u0000\u067c\u067f"+
		"\u0003\u0110\u0088\u0000\u067d\u067f\u0003\u0114\u008a\u0000\u067e\u067b"+
		"\u0001\u0000\u0000\u0000\u067e\u067d\u0001\u0000\u0000\u0000\u067f\u010f"+
		"\u0001\u0000\u0000\u0000\u0680\u0683\u0003V+\u0000\u0681\u0683\u0003\u0114"+
		"\u008a\u0000\u0682\u0680\u0001\u0000\u0000\u0000\u0682\u0681\u0001\u0000"+
		"\u0000\u0000\u0683\u0111\u0001\u0000\u0000\u0000\u0684\u0686\u0003\u0110"+
		"\u0088\u0000\u0685\u0687\u0005\u0084\u0000\u0000\u0686\u0685\u0001\u0000"+
		"\u0000\u0000\u0686\u0687\u0001\u0000\u0000\u0000\u0687\u068f\u0001\u0000"+
		"\u0000\u0000\u0688\u0689\u0005{\u0000\u0000\u0689\u068b\u0003\u0110\u0088"+
		"\u0000\u068a\u068c\u0005\u0084\u0000\u0000\u068b\u068a\u0001\u0000\u0000"+
		"\u0000\u068b\u068c\u0001\u0000\u0000\u0000\u068c\u068e\u0001\u0000\u0000"+
		"\u0000\u068d\u0688\u0001\u0000\u0000\u0000\u068e\u0691\u0001\u0000\u0000"+
		"\u0000\u068f\u068d\u0001\u0000\u0000\u0000\u068f\u0690\u0001\u0000\u0000"+
		"\u0000\u0690\u0113\u0001\u0000\u0000\u0000\u0691\u068f\u0001\u0000\u0000"+
		"\u0000\u0692\u0697\u0005Z\u0000\u0000\u0693\u0695\u0003\u0112\u0089\u0000"+
		"\u0694\u0696\u0005{\u0000\u0000\u0695\u0694\u0001\u0000\u0000\u0000\u0695"+
		"\u0696\u0001\u0000\u0000\u0000\u0696\u0698\u0001\u0000\u0000\u0000\u0697"+
		"\u0693\u0001\u0000\u0000\u0000\u0697\u0698\u0001\u0000\u0000\u0000\u0698"+
		"\u0699\u0001\u0000\u0000\u0000\u0699\u069a\u0005[\u0000\u0000\u069a\u0115"+
		"\u0001\u0000\u0000\u0000\u069b\u069e\u0005\u0085\u0000\u0000\u069c\u069e"+
		"\u0003\u0156\u00ab\u0000\u069d\u069b\u0001\u0000\u0000\u0000\u069d\u069c"+
		"\u0001\u0000\u0000\u0000\u069e\u0117\u0001\u0000\u0000\u0000\u069f\u06a0"+
		"\u0003\u011a\u008d\u0000\u06a0\u06a2\u0005Z\u0000\u0000\u06a1\u06a3\u0003"+
		"\u0122\u0091\u0000\u06a2\u06a1\u0001\u0000\u0000\u0000\u06a2\u06a3\u0001"+
		"\u0000\u0000\u0000\u06a3\u06a4\u0001\u0000\u0000\u0000\u06a4\u06a5\u0005"+
		"[\u0000\u0000\u06a5\u0119\u0001\u0000\u0000\u0000\u06a6\u06a8\u0003\u0120"+
		"\u0090\u0000\u06a7\u06a9\u0003\u00ccf\u0000\u06a8\u06a7\u0001\u0000\u0000"+
		"\u0000\u06a8\u06a9\u0001\u0000\u0000\u0000\u06a9\u06ae\u0001\u0000\u0000"+
		"\u0000\u06aa\u06ac\u0003\u011c\u008e\u0000\u06ab\u06ad\u0003\u011e\u008f"+
		"\u0000\u06ac\u06ab\u0001\u0000\u0000\u0000\u06ac\u06ad\u0001\u0000\u0000"+
		"\u0000\u06ad\u06af\u0001\u0000\u0000\u0000\u06ae\u06aa\u0001\u0000\u0000"+
		"\u0000\u06ae\u06af\u0001\u0000\u0000\u0000\u06af\u06b1\u0001\u0000\u0000"+
		"\u0000\u06b0\u06b2\u0003\u0130\u0098\u0000\u06b1\u06b0\u0001\u0000\u0000"+
		"\u0000\u06b1\u06b2\u0001\u0000\u0000\u0000\u06b2\u06be\u0001\u0000\u0000"+
		"\u0000\u06b3\u06b5\u0005N\u0000\u0000\u06b4\u06b6\u0003\u00ccf\u0000\u06b5"+
		"\u06b4\u0001\u0000\u0000\u0000\u06b5\u06b6\u0001\u0000\u0000\u0000\u06b6"+
		"\u06bb\u0001\u0000\u0000\u0000\u06b7\u06b9\u0003\u011c\u008e\u0000\u06b8"+
		"\u06ba\u0003\u011e\u008f\u0000\u06b9\u06b8\u0001\u0000\u0000\u0000\u06b9"+
		"\u06ba\u0001\u0000\u0000\u0000\u06ba\u06bc\u0001\u0000\u0000\u0000\u06bb"+
		"\u06b7\u0001\u0000\u0000\u0000\u06bb\u06bc\u0001\u0000\u0000\u0000\u06bc"+
		"\u06be\u0001\u0000\u0000\u0000\u06bd\u06a6\u0001\u0000\u0000\u0000\u06bd"+
		"\u06b3\u0001\u0000\u0000\u0000\u06be\u011b\u0001\u0000\u0000\u0000\u06bf"+
		"\u06c1\u0003\n\u0005\u0000\u06c0\u06bf\u0001\u0000\u0000\u0000\u06c0\u06c1"+
		"\u0001\u0000\u0000\u0000\u06c1\u06c2\u0001\u0000\u0000\u0000\u06c2\u06c3"+
		"\u0003\u0116\u008b\u0000\u06c3\u011d\u0001\u0000\u0000\u0000\u06c4\u06c5"+
		"\u0005\'\u0000\u0000\u06c5\u011f\u0001\u0000\u0000\u0000\u06c6\u06c7\u0007"+
		"\u000f\u0000\u0000\u06c7\u0121\u0001\u0000\u0000\u0000\u06c8\u06cd\u0003"+
		"\u0124\u0092\u0000\u06c9\u06ca\u0003\u013a\u009d\u0000\u06ca\u06cb\u0005"+
		"\u007f\u0000\u0000\u06cb\u06cd\u0001\u0000\u0000\u0000\u06cc\u06c8\u0001"+
		"\u0000\u0000\u0000\u06cc\u06c9\u0001\u0000\u0000\u0000\u06cd\u06ce\u0001"+
		"\u0000\u0000\u0000\u06ce\u06cc\u0001\u0000\u0000\u0000\u06ce\u06cf\u0001"+
		"\u0000\u0000\u0000\u06cf\u0123\u0001\u0000\u0000\u0000\u06d0\u06d2\u0003"+
		"\u00ccf\u0000\u06d1\u06d0\u0001\u0000\u0000\u0000\u06d1\u06d2\u0001\u0000"+
		"\u0000\u0000\u06d2\u06d4\u0001\u0000\u0000\u0000\u06d3\u06d5\u0003\u008a"+
		"E\u0000\u06d4\u06d3\u0001\u0000\u0000\u0000\u06d4\u06d5\u0001\u0000\u0000"+
		"\u0000\u06d5\u06d7\u0001\u0000\u0000\u0000\u06d6\u06d8\u0003\u0126\u0093"+
		"\u0000\u06d7\u06d6\u0001\u0000\u0000\u0000\u06d7\u06d8\u0001\u0000\u0000"+
		"\u0000\u06d8\u06d9\u0001\u0000\u0000\u0000\u06d9\u06e1\u0005\u0081\u0000"+
		"\u0000\u06da\u06e1\u0003\u0108\u0084\u0000\u06db\u06e1\u0003\u00c4b\u0000"+
		"\u06dc\u06e1\u0003\u0082A\u0000\u06dd\u06e1\u0003\u014e\u00a7\u0000\u06de"+
		"\u06e1\u0003~?\u0000\u06df\u06e1\u0003\u0084B\u0000\u06e0\u06d1\u0001"+
		"\u0000\u0000\u0000\u06e0\u06da\u0001\u0000\u0000\u0000\u06e0\u06db\u0001"+
		"\u0000\u0000\u0000\u06e0\u06dc\u0001\u0000\u0000\u0000\u06e0\u06dd\u0001"+
		"\u0000\u0000\u0000\u06e0\u06de\u0001\u0000\u0000\u0000\u06e0\u06df\u0001"+
		"\u0000\u0000\u0000\u06e1\u0125\u0001\u0000\u0000\u0000\u06e2\u06e7\u0003"+
		"\u0128\u0094\u0000\u06e3\u06e4\u0005{\u0000\u0000\u06e4\u06e6\u0003\u0128"+
		"\u0094\u0000\u06e5\u06e3\u0001\u0000\u0000\u0000\u06e6\u06e9\u0001\u0000"+
		"\u0000\u0000\u06e7\u06e5\u0001\u0000\u0000\u0000\u06e7\u06e8\u0001\u0000"+
		"\u0000\u0000\u06e8\u0127\u0001\u0000\u0000\u0000\u06e9\u06e7\u0001\u0000"+
		"\u0000\u0000\u06ea\u06ec\u0003\u00e2q\u0000\u06eb\u06ed\u0003\u012a\u0095"+
		"\u0000\u06ec\u06eb\u0001\u0000\u0000\u0000\u06ec\u06ed\u0001\u0000\u0000"+
		"\u0000\u06ed\u06ef\u0001\u0000\u0000\u0000\u06ee\u06f0\u0003\u010e\u0087"+
		"\u0000\u06ef\u06ee\u0001\u0000\u0000\u0000\u06ef\u06f0\u0001\u0000\u0000"+
		"\u0000\u06f0\u06fa\u0001\u0000\u0000\u0000\u06f1\u06f3\u0005\u0085\u0000"+
		"\u0000\u06f2\u06f1\u0001\u0000\u0000\u0000\u06f2\u06f3\u0001\u0000\u0000"+
		"\u0000\u06f3\u06f5\u0001\u0000\u0000\u0000\u06f4\u06f6\u0003\u00ccf\u0000"+
		"\u06f5\u06f4\u0001\u0000\u0000\u0000\u06f5\u06f6\u0001\u0000\u0000\u0000"+
		"\u06f6\u06f7\u0001\u0000\u0000\u0000\u06f7\u06f8\u0005\u007f\u0000\u0000"+
		"\u06f8\u06fa\u0003\\.\u0000\u06f9\u06ea\u0001\u0000\u0000\u0000\u06f9"+
		"\u06f2\u0001\u0000\u0000\u0000\u06fa\u0129\u0001\u0000\u0000\u0000\u06fb"+
		"\u06fd\u0003\u012c\u0096\u0000\u06fc\u06fb\u0001\u0000\u0000\u0000\u06fd"+
		"\u06fe\u0001\u0000\u0000\u0000\u06fe\u06fc\u0001\u0000\u0000\u0000\u06fe"+
		"\u06ff\u0001\u0000\u0000\u0000\u06ff\u012b\u0001\u0000\u0000\u0000\u0700"+
		"\u0701\u0007\u0014\u0000\u0000\u0701\u012d\u0001\u0000\u0000\u0000\u0702"+
		"\u0703\u0005f\u0000\u0000\u0703\u0704\u0005\u0087\u0000\u0000\u0704\u0705"+
		"\u0006\u0097\uffff\uffff\u0000\u0705\u012f\u0001\u0000\u0000\u0000\u0706"+
		"\u0707\u0005\u007f\u0000\u0000\u0707\u0708\u0003\u0132\u0099\u0000\u0708"+
		"\u0131\u0001\u0000\u0000\u0000\u0709\u070b\u0003\u0134\u009a\u0000\u070a"+
		"\u070c\u0005\u0084\u0000\u0000\u070b\u070a\u0001\u0000\u0000\u0000\u070b"+
		"\u070c\u0001\u0000\u0000\u0000\u070c\u0714\u0001\u0000\u0000\u0000\u070d"+
		"\u070e\u0005{\u0000\u0000\u070e\u0710\u0003\u0134\u009a\u0000\u070f\u0711"+
		"\u0005\u0084\u0000\u0000\u0710\u070f\u0001\u0000\u0000\u0000\u0710\u0711"+
		"\u0001\u0000\u0000\u0000\u0711\u0713\u0001\u0000\u0000\u0000\u0712\u070d"+
		"\u0001\u0000\u0000\u0000\u0713\u0716\u0001\u0000\u0000\u0000\u0714\u0712"+
		"\u0001\u0000\u0000\u0000\u0714\u0715\u0001\u0000\u0000\u0000\u0715\u0133"+
		"\u0001\u0000\u0000\u0000\u0716\u0714\u0001\u0000\u0000\u0000\u0717\u0719"+
		"\u0003\u00ccf\u0000\u0718\u0717\u0001\u0000\u0000\u0000\u0718\u0719\u0001"+
		"\u0000\u0000\u0000\u0719\u0726\u0001\u0000\u0000\u0000\u071a\u0727\u0003"+
		"\u0138\u009c\u0000\u071b\u071d\u0005Q\u0000\u0000\u071c\u071e\u0003\u013a"+
		"\u009d\u0000\u071d\u071c\u0001\u0000\u0000\u0000\u071d\u071e\u0001\u0000"+
		"\u0000\u0000\u071e\u071f\u0001\u0000\u0000\u0000\u071f\u0727\u0003\u0138"+
		"\u009c\u0000\u0720\u0722\u0003\u013a\u009d\u0000\u0721\u0723\u0005Q\u0000"+
		"\u0000\u0722\u0721\u0001\u0000\u0000\u0000\u0722\u0723\u0001\u0000\u0000"+
		"\u0000\u0723\u0724\u0001\u0000\u0000\u0000\u0724\u0725\u0003\u0138\u009c"+
		"\u0000\u0725\u0727\u0001\u0000\u0000\u0000\u0726\u071a\u0001\u0000\u0000"+
		"\u0000\u0726\u071b\u0001\u0000\u0000\u0000\u0726\u0720\u0001\u0000\u0000"+
		"\u0000\u0727\u0135\u0001\u0000\u0000\u0000\u0728\u072a\u0003\n\u0005\u0000"+
		"\u0729\u0728\u0001\u0000\u0000\u0000\u0729\u072a\u0001\u0000\u0000\u0000"+
		"\u072a\u072b\u0001\u0000\u0000\u0000\u072b\u072e\u0003\u0116\u008b\u0000"+
		"\u072c\u072e\u0003\u00a2Q\u0000\u072d\u0729\u0001\u0000\u0000\u0000\u072d"+
		"\u072c\u0001\u0000\u0000\u0000\u072e\u0137\u0001\u0000\u0000\u0000\u072f"+
		"\u0730\u0003\u0136\u009b\u0000\u0730\u0139\u0001\u0000\u0000\u0000\u0731"+
		"\u0732\u0007\u0015\u0000\u0000\u0732\u013b\u0001\u0000\u0000\u0000\u0733"+
		"\u0734\u00055\u0000\u0000\u0734\u0735\u0003\u013e\u009f\u0000\u0735\u013d"+
		"\u0001\u0000\u0000\u0000\u0736\u0738\u0003\u0096K\u0000\u0737\u0739\u0003"+
		"\u0140\u00a0\u0000\u0738\u0737\u0001\u0000\u0000\u0000\u0738\u0739\u0001"+
		"\u0000\u0000\u0000\u0739\u013f\u0001\u0000\u0000\u0000\u073a\u073c\u0003"+
		"\u00ecv\u0000\u073b\u073d\u0003\u0140\u00a0\u0000\u073c\u073b\u0001\u0000"+
		"\u0000\u0000\u073c\u073d\u0001\u0000\u0000\u0000\u073d\u0141\u0001\u0000"+
		"\u0000\u0000\u073e\u073f\u0005\u007f\u0000\u0000\u073f\u0740\u0003\u0144"+
		"\u00a2\u0000\u0740\u0143\u0001\u0000\u0000\u0000\u0741\u0743\u0003\u0146"+
		"\u00a3\u0000\u0742\u0744\u0005\u0084\u0000\u0000\u0743\u0742\u0001\u0000"+
		"\u0000\u0000\u0743\u0744\u0001\u0000\u0000\u0000\u0744\u074c\u0001\u0000"+
		"\u0000\u0000\u0745\u0746\u0005{\u0000\u0000\u0746\u0748\u0003\u0146\u00a3"+
		"\u0000\u0747\u0749\u0005\u0084\u0000\u0000\u0748\u0747\u0001\u0000\u0000"+
		"\u0000\u0748\u0749\u0001\u0000\u0000\u0000\u0749\u074b\u0001\u0000\u0000"+
		"\u0000\u074a\u0745\u0001\u0000\u0000\u0000\u074b\u074e\u0001\u0000\u0000"+
		"\u0000\u074c\u074a\u0001\u0000\u0000\u0000\u074c\u074d\u0001\u0000\u0000"+
		"\u0000\u074d\u0145\u0001\u0000\u0000\u0000\u074e\u074c\u0001\u0000\u0000"+
		"\u0000\u074f\u0756\u0003\u0148\u00a4\u0000\u0750\u0752\u0005V\u0000\u0000"+
		"\u0751\u0753\u0003\"\u0011\u0000\u0752\u0751\u0001\u0000\u0000\u0000\u0752"+
		"\u0753\u0001\u0000\u0000\u0000\u0753\u0754\u0001\u0000\u0000\u0000\u0754"+
		"\u0757\u0005W\u0000\u0000\u0755\u0757\u0003\u0114\u008a\u0000\u0756\u0750"+
		"\u0001\u0000\u0000\u0000\u0756\u0755\u0001\u0000\u0000\u0000\u0757\u0147"+
		"\u0001\u0000\u0000\u0000\u0758\u075b\u0003\u0136\u009b\u0000\u0759\u075b"+
		"\u0005\u0085\u0000\u0000\u075a\u0758\u0001\u0000\u0000\u0000\u075a\u0759"+
		"\u0001\u0000\u0000\u0000\u075b\u0149\u0001\u0000\u0000\u0000\u075c\u075d"+
		"\u00055\u0000\u0000\u075d\u075e\u0003\u017a\u00bd\u0000\u075e\u014b\u0001"+
		"\u0000\u0000\u0000\u075f\u0763\u00055\u0000\u0000\u0760\u0764\u0003\u017c"+
		"\u00be\u0000\u0761\u0762\u0005\u0004\u0000\u0000\u0762\u0764\u0005\u0085"+
		"\u0000\u0000\u0763\u0760\u0001\u0000\u0000\u0000\u0763\u0761\u0001\u0000"+
		"\u0000\u0000\u0764\u014d\u0001\u0000\u0000\u0000\u0765\u0766\u0005E\u0000"+
		"\u0000\u0766\u0767\u0005g\u0000\u0000\u0767\u0768\u0003\u0150\u00a8\u0000"+
		"\u0768\u0769\u0005h\u0000\u0000\u0769\u076a\u0003z=\u0000\u076a\u014f"+
		"\u0001\u0000\u0000\u0000\u076b\u0770\u0003\u0152\u00a9\u0000\u076c\u076d"+
		"\u0005{\u0000\u0000\u076d\u076f\u0003\u0152\u00a9\u0000\u076e\u076c\u0001"+
		"\u0000\u0000\u0000\u076f\u0772\u0001\u0000\u0000\u0000\u0770\u076e\u0001"+
		"\u0000\u0000\u0000\u0770\u0771\u0001\u0000\u0000\u0000\u0771\u0151\u0001"+
		"\u0000\u0000\u0000\u0772\u0770\u0001\u0000\u0000\u0000\u0773\u0776\u0003"+
		"\u0154\u00aa\u0000\u0774\u0776\u0003\u0106\u0083\u0000\u0775\u0773\u0001"+
		"\u0000\u0000\u0000\u0775\u0774\u0001\u0000\u0000\u0000\u0776\u0153\u0001"+
		"\u0000\u0000\u0000\u0777\u0778\u0005E\u0000\u0000\u0778\u0779\u0005g\u0000"+
		"\u0000\u0779\u077a\u0003\u0150\u00a8\u0000\u077a\u077b\u0005h\u0000\u0000"+
		"\u077b\u077d\u0001\u0000\u0000\u0000\u077c\u0777\u0001\u0000\u0000\u0000"+
		"\u077c\u077d\u0001\u0000\u0000\u0000\u077d\u077e\u0001\u0000\u0000\u0000"+
		"\u077e\u0781\u0005\u0016\u0000\u0000\u077f\u0781\u0005M\u0000\u0000\u0780"+
		"\u077c\u0001\u0000\u0000\u0000\u0780\u077f\u0001\u0000\u0000\u0000\u0781"+
		"\u078d\u0001\u0000\u0000\u0000\u0782\u0784\u0005\u0084\u0000\u0000\u0783"+
		"\u0782\u0001\u0000\u0000\u0000\u0783\u0784\u0001\u0000\u0000\u0000\u0784"+
		"\u0786\u0001\u0000\u0000\u0000\u0785\u0787\u0005\u0085\u0000\u0000\u0786"+
		"\u0785\u0001\u0000\u0000\u0000\u0786\u0787\u0001\u0000\u0000\u0000\u0787"+
		"\u078e\u0001\u0000\u0000\u0000\u0788\u078a\u0005\u0085\u0000\u0000\u0789"+
		"\u0788\u0001\u0000\u0000\u0000\u0789\u078a\u0001\u0000\u0000\u0000\u078a"+
		"\u078b\u0001\u0000\u0000\u0000\u078b\u078c\u0005f\u0000\u0000\u078c\u078e"+
		"\u0003\u00f6{\u0000\u078d\u0783\u0001\u0000\u0000\u0000\u078d\u0789\u0001"+
		"\u0000\u0000\u0000\u078e\u0155\u0001\u0000\u0000\u0000\u078f\u0790\u0003"+
		"\u015a\u00ad\u0000\u0790\u0792\u0005g\u0000\u0000\u0791\u0793\u0003\u015c"+
		"\u00ae\u0000\u0792\u0791\u0001\u0000\u0000\u0000\u0792\u0793\u0001\u0000"+
		"\u0000\u0000\u0793\u0794\u0001\u0000\u0000\u0000\u0794\u0795\u0005h\u0000"+
		"\u0000\u0795\u0157\u0001\u0000\u0000\u0000\u0796\u07a2\u0003\u0156\u00ab"+
		"\u0000\u0797\u079a\u0003\u014a\u00a5\u0000\u0798\u079a\u0003\u014c\u00a6"+
		"\u0000\u0799\u0797\u0001\u0000\u0000\u0000\u0799\u0798\u0001\u0000\u0000"+
		"\u0000\u079a\u079b\u0001\u0000\u0000\u0000\u079b\u079d\u0005g\u0000\u0000"+
		"\u079c\u079e\u0003\u015c\u00ae\u0000\u079d\u079c\u0001\u0000\u0000\u0000"+
		"\u079d\u079e\u0001\u0000\u0000\u0000\u079e\u079f\u0001\u0000\u0000\u0000"+
		"\u079f\u07a0\u0005h\u0000\u0000\u07a0\u07a2\u0001\u0000\u0000\u0000\u07a1"+
		"\u0796\u0001\u0000\u0000\u0000\u07a1\u0799\u0001\u0000\u0000\u0000\u07a2"+
		"\u0159\u0001\u0000\u0000\u0000\u07a3\u07a4\u0005\u0085\u0000\u0000\u07a4"+
		"\u015b\u0001\u0000\u0000\u0000\u07a5\u07a7\u0003\u015e\u00af\u0000\u07a6"+
		"\u07a8\u0005\u0084\u0000\u0000\u07a7\u07a6\u0001\u0000\u0000\u0000\u07a7"+
		"\u07a8\u0001\u0000\u0000\u0000\u07a8\u07b0\u0001\u0000\u0000\u0000\u07a9"+
		"\u07aa\u0005{\u0000\u0000\u07aa\u07ac\u0003\u015e\u00af\u0000\u07ab\u07ad"+
		"\u0005\u0084\u0000\u0000\u07ac\u07ab\u0001\u0000\u0000\u0000\u07ac\u07ad"+
		"\u0001\u0000\u0000\u0000\u07ad\u07af\u0001\u0000\u0000\u0000\u07ae\u07a9"+
		"\u0001\u0000\u0000\u0000\u07af\u07b2\u0001\u0000\u0000\u0000\u07b0\u07ae"+
		"\u0001\u0000\u0000\u0000\u07b0\u07b1\u0001\u0000\u0000\u0000\u07b1\u015d"+
		"\u0001\u0000\u0000\u0000\u07b2\u07b0\u0001\u0000\u0000\u0000\u07b3\u07b7"+
		"\u0003\u00f6{\u0000\u07b4\u07b7\u0003\\.\u0000\u07b5\u07b7\u0003\u0004"+
		"\u0002\u0000\u07b6\u07b3\u0001\u0000\u0000\u0000\u07b6\u07b4\u0001\u0000"+
		"\u0000\u0000\u07b6\u07b5\u0001\u0000\u0000\u0000\u07b7\u015f\u0001\u0000"+
		"\u0000\u0000\u07b8\u07b9\u0005M\u0000\u0000\u07b9\u07bf\u0003\n\u0005"+
		"\u0000\u07ba\u07c0\u0005\u0085\u0000\u0000\u07bb\u07bd\u0005E\u0000\u0000"+
		"\u07bc\u07bb\u0001\u0000\u0000\u0000\u07bc\u07bd\u0001\u0000\u0000\u0000"+
		"\u07bd\u07be\u0001\u0000\u0000\u0000\u07be\u07c0\u0003\u0156\u00ab\u0000"+
		"\u07bf\u07ba\u0001\u0000\u0000\u0000\u07bf\u07bc\u0001\u0000\u0000\u0000"+
		"\u07c0\u0161\u0001\u0000\u0000\u0000\u07c1\u07c3\u0005%\u0000\u0000\u07c2"+
		"\u07c1\u0001\u0000\u0000\u0000\u07c2\u07c3\u0001\u0000\u0000\u0000\u07c3"+
		"\u07c4\u0001\u0000\u0000\u0000\u07c4\u07c5\u0005E\u0000\u0000\u07c5\u07c6"+
		"\u0003z=\u0000\u07c6\u0163\u0001\u0000\u0000\u0000\u07c7\u07c8\u0005E"+
		"\u0000\u0000\u07c8\u07c9\u0005g\u0000\u0000\u07c9\u07ca\u0005h\u0000\u0000"+
		"\u07ca\u07cb\u0003z=\u0000\u07cb\u0165\u0001\u0000\u0000\u0000\u07cc\u07cd"+
		"\u0005J\u0000\u0000\u07cd\u07ce\u0003d2\u0000\u07ce\u07cf\u0003\u016a"+
		"\u00b5\u0000\u07cf\u0167\u0001\u0000\u0000\u0000\u07d0\u07d2\u0005J\u0000"+
		"\u0000\u07d1\u07d3\u0003\u0142\u00a1\u0000\u07d2\u07d1\u0001\u0000\u0000"+
		"\u0000\u07d2\u07d3\u0001\u0000\u0000\u0000\u07d3\u07d4\u0001\u0000\u0000"+
		"\u0000\u07d4\u07d5\u0003d2\u0000\u07d5\u07d6\u0003\u016a\u00b5\u0000\u07d6"+
		"\u0169\u0001\u0000\u0000\u0000\u07d7\u07d9\u0003\u016c\u00b6\u0000\u07d8"+
		"\u07d7\u0001\u0000\u0000\u0000\u07d9\u07da\u0001\u0000\u0000\u0000\u07da"+
		"\u07d8\u0001\u0000\u0000\u0000\u07da\u07db\u0001\u0000\u0000\u0000\u07db"+
		"\u016b\u0001\u0000\u0000\u0000\u07dc\u07dd\u0005\u0012\u0000\u0000\u07dd"+
		"\u07de\u0005V\u0000\u0000\u07de\u07df\u0003\u016e\u00b7\u0000\u07df\u07e0"+
		"\u0005W\u0000\u0000\u07e0\u07e1\u0003d2\u0000\u07e1\u016d\u0001\u0000"+
		"\u0000\u0000\u07e2\u07e4\u0003\u00ccf\u0000\u07e3\u07e2\u0001\u0000\u0000"+
		"\u0000\u07e3\u07e4\u0001\u0000\u0000\u0000\u07e4\u07e5\u0001\u0000\u0000"+
		"\u0000\u07e5\u07e8\u0003\u0096K\u0000\u07e6\u07e9\u0003\u00e2q\u0000\u07e7"+
		"\u07e9\u0003\u00f8|\u0000\u07e8\u07e6\u0001\u0000\u0000\u0000\u07e8\u07e7"+
		"\u0001\u0000\u0000\u0000\u07e8\u07e9\u0001\u0000\u0000\u0000\u07e9\u07ec"+
		"\u0001\u0000\u0000\u0000\u07ea\u07ec\u0005\u0084\u0000\u0000\u07eb\u07e3"+
		"\u0001\u0000\u0000\u0000\u07eb\u07ea\u0001\u0000\u0000\u0000\u07ec\u016f"+
		"\u0001\u0000\u0000\u0000\u07ed\u07ef\u0005H\u0000\u0000\u07ee\u07f0\u0003"+
		"V+\u0000\u07ef\u07ee\u0001\u0000\u0000\u0000\u07ef\u07f0\u0001\u0000\u0000"+
		"\u0000\u07f0\u0171\u0001\u0000\u0000\u0000\u07f1\u07f4\u0003\u0174\u00ba"+
		"\u0000\u07f2\u07f4\u0003\u0178\u00bc\u0000\u07f3\u07f1\u0001\u0000\u0000"+
		"\u0000\u07f3\u07f2\u0001\u0000\u0000\u0000\u07f4\u0173\u0001\u0000\u0000"+
		"\u0000\u07f5\u07f6\u0005H\u0000\u0000\u07f6\u07f8\u0005V\u0000\u0000\u07f7"+
		"\u07f9\u0003\u0176\u00bb\u0000\u07f8\u07f7\u0001\u0000\u0000\u0000\u07f8"+
		"\u07f9\u0001\u0000\u0000\u0000\u07f9\u07fa\u0001\u0000\u0000\u0000\u07fa"+
		"\u07fb\u0005W\u0000\u0000\u07fb\u0175\u0001\u0000\u0000\u0000\u07fc\u07fe"+
		"\u0003\u00f6{\u0000\u07fd\u07ff\u0005\u0084\u0000\u0000\u07fe\u07fd\u0001"+
		"\u0000\u0000\u0000\u07fe\u07ff\u0001\u0000\u0000\u0000\u07ff\u0807\u0001"+
		"\u0000\u0000\u0000\u0800\u0801\u0005{\u0000\u0000\u0801\u0803\u0003\u00f6"+
		"{\u0000\u0802\u0804\u0005\u0084\u0000\u0000\u0803\u0802\u0001\u0000\u0000"+
		"\u0000\u0803\u0804\u0001\u0000\u0000\u0000\u0804\u0806\u0001\u0000\u0000"+
		"\u0000\u0805\u0800\u0001\u0000\u0000\u0000\u0806\u0809\u0001\u0000\u0000"+
		"\u0000\u0807\u0805\u0001\u0000\u0000\u0000\u0807\u0808\u0001\u0000\u0000"+
		"\u0000\u0808\u0177\u0001\u0000\u0000\u0000\u0809\u0807\u0001\u0000\u0000"+
		"\u0000\u080a\u080b\u00053\u0000\u0000\u080b\u080c\u0005V\u0000\u0000\u080c"+
		"\u080d\u0003\\.\u0000\u080d\u080e\u0005W\u0000\u0000\u080e\u0811\u0001"+
		"\u0000\u0000\u0000\u080f\u0811\u00053\u0000\u0000\u0810\u080a\u0001\u0000"+
		"\u0000\u0000\u0810\u080f\u0001\u0000\u0000\u0000\u0811\u0179\u0001\u0000"+
		"\u0000\u0000\u0812\u0815\u00052\u0000\u0000\u0813\u0814\u0005X\u0000\u0000"+
		"\u0814\u0816\u0005Y\u0000\u0000\u0815\u0813\u0001\u0000\u0000\u0000\u0815"+
		"\u0816\u0001\u0000\u0000\u0000\u0816\u0846\u0001\u0000\u0000\u0000\u0817"+
		"\u081a\u0005\u001d\u0000\u0000\u0818\u0819\u0005X\u0000\u0000\u0819\u081b"+
		"\u0005Y\u0000\u0000\u081a\u0818\u0001\u0000\u0000\u0000\u081a\u081b\u0001"+
		"\u0000\u0000\u0000\u081b\u0846\u0001\u0000\u0000\u0000\u081c\u0846\u0005"+
		"\\\u0000\u0000\u081d\u0846\u0005]\u0000\u0000\u081e\u0846\u0005^\u0000"+
		"\u0000\u081f\u0846\u0005_\u0000\u0000\u0820\u0846\u0005`\u0000\u0000\u0821"+
		"\u0846\u0005a\u0000\u0000\u0822\u0846\u0005b\u0000\u0000\u0823\u0846\u0005"+
		"c\u0000\u0000\u0824\u0846\u0005d\u0000\u0000\u0825\u0846\u0005e\u0000"+
		"\u0000\u0826\u0846\u0005f\u0000\u0000\u0827\u0846\u0005h\u0000\u0000\u0828"+
		"\u0846\u0005g\u0000\u0000\u0829\u0846\u0005v\u0000\u0000\u082a\u0846\u0005"+
		"i\u0000\u0000\u082b\u0846\u0005j\u0000\u0000\u082c\u0846\u0005k\u0000"+
		"\u0000\u082d\u0846\u0005m\u0000\u0000\u082e\u0846\u0005n\u0000\u0000\u082f"+
		"\u0846\u0005o\u0000\u0000\u0830\u0846\u0005p\u0000\u0000\u0831\u0832\u0005"+
		"g\u0000\u0000\u0832\u0846\u0005g\u0000\u0000\u0833\u0834\u0005h\u0000"+
		"\u0000\u0834\u0846\u0005h\u0000\u0000\u0835\u0846\u0005r\u0000\u0000\u0836"+
		"\u0846\u0005q\u0000\u0000\u0837\u0846\u0005s\u0000\u0000\u0838\u0846\u0005"+
		"t\u0000\u0000\u0839\u0846\u0005u\u0000\u0000\u083a\u0846\u0005w\u0000"+
		"\u0000\u083b\u0846\u0005x\u0000\u0000\u083c\u0846\u0005y\u0000\u0000\u083d"+
		"\u0846\u0005z\u0000\u0000\u083e\u0846\u0005{\u0000\u0000\u083f\u0846\u0005"+
		"|\u0000\u0000\u0840\u0846\u0005}\u0000\u0000\u0841\u0842\u0005V\u0000"+
		"\u0000\u0842\u0846\u0005W\u0000\u0000\u0843\u0844\u0005X\u0000\u0000\u0844"+
		"\u0846\u0005Y\u0000\u0000\u0845\u0812\u0001\u0000\u0000\u0000\u0845\u0817"+
		"\u0001\u0000\u0000\u0000\u0845\u081c\u0001\u0000\u0000\u0000\u0845\u081d"+
		"\u0001\u0000\u0000\u0000\u0845\u081e\u0001\u0000\u0000\u0000\u0845\u081f"+
		"\u0001\u0000\u0000\u0000\u0845\u0820\u0001\u0000\u0000\u0000\u0845\u0821"+
		"\u0001\u0000\u0000\u0000\u0845\u0822\u0001\u0000\u0000\u0000\u0845\u0823"+
		"\u0001\u0000\u0000\u0000\u0845\u0824\u0001\u0000\u0000\u0000\u0845\u0825"+
		"\u0001\u0000\u0000\u0000\u0845\u0826\u0001\u0000\u0000\u0000\u0845\u0827"+
		"\u0001\u0000\u0000\u0000\u0845\u0828\u0001\u0000\u0000\u0000\u0845\u0829"+
		"\u0001\u0000\u0000\u0000\u0845\u082a\u0001\u0000\u0000\u0000\u0845\u082b"+
		"\u0001\u0000\u0000\u0000\u0845\u082c\u0001\u0000\u0000\u0000\u0845\u082d"+
		"\u0001\u0000\u0000\u0000\u0845\u082e\u0001\u0000\u0000\u0000\u0845\u082f"+
		"\u0001\u0000\u0000\u0000\u0845\u0830\u0001\u0000\u0000\u0000\u0845\u0831"+
		"\u0001\u0000\u0000\u0000\u0845\u0833\u0001\u0000\u0000\u0000\u0845\u0835"+
		"\u0001\u0000\u0000\u0000\u0845\u0836\u0001\u0000\u0000\u0000\u0845\u0837"+
		"\u0001\u0000\u0000\u0000\u0845\u0838\u0001\u0000\u0000\u0000\u0845\u0839"+
		"\u0001\u0000\u0000\u0000\u0845\u083a\u0001\u0000\u0000\u0000\u0845\u083b"+
		"\u0001\u0000\u0000\u0000\u0845\u083c\u0001\u0000\u0000\u0000\u0845\u083d"+
		"\u0001\u0000\u0000\u0000\u0845\u083e\u0001\u0000\u0000\u0000\u0845\u083f"+
		"\u0001\u0000\u0000\u0000\u0845\u0840\u0001\u0000\u0000\u0000\u0845\u0841"+
		"\u0001\u0000\u0000\u0000\u0845\u0843\u0001\u0000\u0000\u0000\u0846\u017b"+
		"\u0001\u0000\u0000\u0000\u0847\u0848\u0007\u0016\u0000\u0000\u0848\u017d"+
		"\u0001\u0000\u0000\u0000\u0135\u017f\u0186\u018f\u0193\u019c\u019f\u01a3"+
		"\u01ab\u01b2\u01b5\u01ba\u01bf\u01c5\u01cd\u01cf\u01d8\u01dc\u01e0\u01e3"+
		"\u01e7\u01ea\u01f1\u01f5\u01f8\u01fb\u01fe\u0204\u0208\u020c\u021a\u021e"+
		"\u0224\u022b\u0231\u0235\u0239\u023b\u0243\u0248\u0255\u025c\u0268\u0272"+
		"\u0277\u027b\u0282\u0285\u028d\u0291\u0294\u029b\u02a2\u02a6\u02ab\u02af"+
		"\u02b2\u02b7\u02c2\u02c5\u02cc\u02d3\u02db\u02e3\u02ec\u02f3\u02fa\u0302"+
		"\u030a\u0312\u031a\u0322\u032a\u0333\u033b\u0344\u034c\u0354\u0356\u0359"+
		"\u035f\u0365\u036b\u0372\u037b\u0383\u0387\u038e\u0390\u03a4\u03a8\u03ae"+
		"\u03b3\u03b7\u03ba\u03c1\u03c8\u03cc\u03d5\u03e0\u03ea\u03ef\u03f6\u03f9"+
		"\u03fe\u0403\u040c\u041c\u0421\u0424\u042f\u0435\u043a\u043d\u0442\u0445"+
		"\u044c\u0454\u0459\u045c\u0460\u0464\u0468\u046d\u0472\u0479\u047f\u0485"+
		"\u048b\u0491\u0494\u049a\u049e\u04a2\u04a5\u04ad\u04af\u04b5\u04b8\u04bb"+
		"\u04be\u04c2\u04c6\u04cc\u04d6\u04dc\u04e2\u04e7\u04ec\u04f0\u04fd\u0503"+
		"\u0507\u050d\u0512\u051c\u0525\u0529\u052e\u0533\u0538\u053e\u0541\u054a"+
		"\u054e\u0553\u0557\u055d\u0564\u0575\u0577\u057e\u0583\u058a\u058e\u0592"+
		"\u059a\u05a0\u05a6\u05aa\u05ac\u05b0\u05b5\u05b9\u05bc\u05bf\u05c2\u05c7"+
		"\u05cb\u05ce\u05d2\u05d5\u05d7\u05dc\u05e3\u05e9\u05ed\u05f3\u05f9\u05fc"+
		"\u05fe\u0604\u0608\u060e\u0615\u0619\u061b\u061f\u0625\u0631\u0635\u0637"+
		"\u063b\u0641\u0644\u0646\u064d\u0651\u0656\u0658\u065c\u065f\u0662\u0666"+
		"\u066b\u0672\u0679\u067e\u0682\u0686\u068b\u068f\u0695\u0697\u069d\u06a2"+
		"\u06a8\u06ac\u06ae\u06b1\u06b5\u06b9\u06bb\u06bd\u06c0\u06cc\u06ce\u06d1"+
		"\u06d4\u06d7\u06e0\u06e7\u06ec\u06ef\u06f2\u06f5\u06f9\u06fe\u070b\u0710"+
		"\u0714\u0718\u071d\u0722\u0726\u0729\u072d\u0738\u073c\u0743\u0748\u074c"+
		"\u0752\u0756\u075a\u0763\u0770\u0775\u077c\u0780\u0783\u0786\u0789\u078d"+
		"\u0792\u0799\u079d\u07a1\u07a7\u07ac\u07b0\u07b6\u07bc\u07bf\u07c2\u07d2"+
		"\u07da\u07e3\u07e8\u07eb\u07ef\u07f3\u07f8\u07fe\u0803\u0807\u0810\u0815"+
		"\u081a\u0845";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}