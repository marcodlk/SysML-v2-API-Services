package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface ConstraintUsage extends BooleanExpression, Usage, MofObject {
    Predicate getConstraintDefinition();

    Usage getConstraintOwningUsage();

    Definition getConstraintOwningDefinition();
}