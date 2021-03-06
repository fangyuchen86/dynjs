package org.dynjs.ir.operands;

import java.util.List;
import org.dynjs.ir.Operand;
import org.dynjs.ir.OperandType;
import org.dynjs.runtime.ExecutionContext;

public class StringLiteral extends Operand {
    private String value;

    public StringLiteral(String value) {
        super(OperandType.STRING);
        this.value = value;
    }

    public void addUsedVariables(List<Variable> l) {
    }

    @Override
    public String toString() {
        return "\"" + value + "\"";
    }

    @Override
    public Object retrieve(ExecutionContext context, Object[] temps) {
        return this.value;
    }
}
