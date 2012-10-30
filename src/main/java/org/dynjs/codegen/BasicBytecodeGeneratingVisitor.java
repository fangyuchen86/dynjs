package org.dynjs.codegen;

import static me.qmx.jitescript.util.CodegenUtils.p;
import static me.qmx.jitescript.util.CodegenUtils.sig;

import org.dynjs.compiler.CodeBlockUtils;
import org.dynjs.compiler.JSCompiler;
import org.dynjs.parser.ast.AdditiveExpression;
import org.dynjs.parser.ast.ArrayLiteralExpression;
import org.dynjs.parser.ast.AssignmentExpression;
import org.dynjs.parser.ast.BitwiseExpression;
import org.dynjs.parser.ast.BitwiseInversionOperatorExpression;
import org.dynjs.parser.ast.BlockStatement;
import org.dynjs.parser.ast.BooleanLiteralExpression;
import org.dynjs.parser.ast.BreakStatement;
import org.dynjs.parser.ast.CaseClause;
import org.dynjs.parser.ast.CatchClause;
import org.dynjs.parser.ast.CompoundAssignmentExpression;
import org.dynjs.parser.ast.ContinueStatement;
import org.dynjs.parser.ast.DefaultCaseClause;
import org.dynjs.parser.ast.DeleteOpExpression;
import org.dynjs.parser.ast.DoWhileStatement;
import org.dynjs.parser.ast.EmptyStatement;
import org.dynjs.parser.ast.EqualityOperatorExpression;
import org.dynjs.parser.ast.ExpressionList;
import org.dynjs.parser.ast.ExpressionStatement;
import org.dynjs.parser.ast.ForExprInStatement;
import org.dynjs.parser.ast.ForExprStatement;
import org.dynjs.parser.ast.ForVarDeclInStatement;
import org.dynjs.parser.ast.ForVarDeclStatement;
import org.dynjs.parser.ast.FunctionCallExpression;
import org.dynjs.parser.ast.FunctionDeclaration;
import org.dynjs.parser.ast.FunctionExpression;
import org.dynjs.parser.ast.IdentifierReferenceExpression;
import org.dynjs.parser.ast.IfStatement;
import org.dynjs.parser.ast.InOperatorExpression;
import org.dynjs.parser.ast.InstanceofExpression;
import org.dynjs.parser.ast.LogicalExpression;
import org.dynjs.parser.ast.LogicalNotOperatorExpression;
import org.dynjs.parser.ast.MemberExpression;
import org.dynjs.parser.ast.MultiplicativeExpression;
import org.dynjs.parser.ast.NamedValue;
import org.dynjs.parser.ast.NewOperatorExpression;
import org.dynjs.parser.ast.NullLiteralExpression;
import org.dynjs.parser.ast.NumberLiteralExpression;
import org.dynjs.parser.ast.ObjectLiteralExpression;
import org.dynjs.parser.ast.PostOpExpression;
import org.dynjs.parser.ast.PreOpExpression;
import org.dynjs.parser.ast.PrintStatement;
import org.dynjs.parser.ast.PropertyGet;
import org.dynjs.parser.ast.PropertySet;
import org.dynjs.parser.ast.RegexpLiteralExpression;
import org.dynjs.parser.ast.RelationalExpression;
import org.dynjs.parser.ast.ReturnStatement;
import org.dynjs.parser.ast.StrictEqualityOperatorExpression;
import org.dynjs.parser.ast.StringLiteralExpression;
import org.dynjs.parser.ast.SwitchStatement;
import org.dynjs.parser.ast.TernaryExpression;
import org.dynjs.parser.ast.ThisExpression;
import org.dynjs.parser.ast.ThrowStatement;
import org.dynjs.parser.ast.TryStatement;
import org.dynjs.parser.ast.TypeOfOpExpression;
import org.dynjs.parser.ast.UnaryMinusExpression;
import org.dynjs.parser.ast.UnaryPlusExpression;
import org.dynjs.parser.ast.UndefinedValueExpression;
import org.dynjs.parser.ast.VariableDeclaration;
import org.dynjs.parser.ast.VariableDeclarationStatement;
import org.dynjs.parser.ast.VoidOperatorExpression;
import org.dynjs.parser.ast.WhileStatement;
import org.dynjs.parser.ast.WithStatement;
import org.dynjs.runtime.BlockManager;
import org.dynjs.runtime.ExecutionContext;
import org.objectweb.asm.tree.LabelNode;

public class BasicBytecodeGeneratingVisitor extends AbstractCodeGeneratingVisitor {
    
    public BasicBytecodeGeneratingVisitor(BlockManager blockManager) {
        super( blockManager );
    }

    @Override
    public void visit(ExecutionContext context, AdditiveExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, BitwiseExpression bitwiseExpression, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, ArrayLiteralExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, AssignmentExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, BitwiseInversionOperatorExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, BlockStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, BooleanLiteralExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, BreakStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, CaseClause clause, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, DefaultCaseClause clause, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, CatchClause clause, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, CompoundAssignmentExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, ContinueStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, DeleteOpExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, DoWhileStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, EmptyStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, EqualityOperatorExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, ExpressionList expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, ExpressionStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, ForExprInStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, ForExprStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, ForVarDeclInStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, ForVarDeclStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, FunctionCallExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, FunctionDeclaration statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, FunctionExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, IdentifierReferenceExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, IfStatement statement, boolean strict) {
        LabelNode elseBranch = new LabelNode();
        LabelNode noElseBranch = new LabelNode();
        LabelNode end = new LabelNode();

        statement.getTest().accept(context, this, strict);
        // value
        append(jsGetValue());
        // value
        append(jsToBoolean());
        // Boolean
        invokevirtual(p(Boolean.class), "booleanValue", sig(boolean.class));
        // bool

        if (statement.getElseBlock() == null) {
            // completion bool
            iffalse(noElseBranch);
        } else {
            iffalse(elseBranch);
        }
        // <empty>

        // ----------------------------------------
        // THEN

        append(CodeBlockUtils.invokeCompiledStatementBlock(getBlockManager(), "Then", statement.getThenBlock()));
        // completion
        go_to(end);

        // ----------------------------------------
        // ELSE
        if (statement.getElseBlock() == null) {
            label(noElseBranch);
            append(normalCompletion());
        } else {
            label(elseBranch);
            // <empty>
            append(CodeBlockUtils.invokeCompiledStatementBlock(getBlockManager(), "Else", statement.getElseBlock()));
            // completion
        }

        label(end);
        // completion

        nop();

    }

    @Override
    public void visit(ExecutionContext context, InOperatorExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, InstanceofExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, LogicalExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, LogicalNotOperatorExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, MemberExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, MultiplicativeExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, NewOperatorExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, NullLiteralExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, NumberLiteralExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, ObjectLiteralExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, PostOpExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, PreOpExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, PrintStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, PropertyGet propertyGet, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, PropertySet propertySet, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, NamedValue namedValue, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, RegexpLiteralExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, RelationalExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, ReturnStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, StrictEqualityOperatorExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, StringLiteralExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, SwitchStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, TernaryExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, ThisExpression expr, boolean strict) {
        aload(JSCompiler.Arities.EXECUTION_CONTEXT);
        invokevirtual(p(ExecutionContext.class), "getThisBinding", sig(Object.class));
    }

    @Override
    public void visit(ExecutionContext context, ThrowStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, TryStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, TypeOfOpExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, UnaryMinusExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, UnaryPlusExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, UndefinedValueExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, VariableDeclaration expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, VariableDeclarationStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, VoidOperatorExpression expr, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, WhileStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(ExecutionContext context, WithStatement statement, boolean strict) {
        // TODO Auto-generated method stub

    }

}
