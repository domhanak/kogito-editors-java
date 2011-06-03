package org.jboss.errai.ioc.rebind.ioc.codegen.builder;

import org.jboss.errai.ioc.rebind.ioc.codegen.Statement;
import org.jboss.errai.ioc.rebind.ioc.codegen.builder.impl.AbstractStatementBuilder;

/**
 * @author Christian Sadilek <csadilek@redhat.com>
 */
public interface ElseBlockBuilder extends Statement {
    AbstractStatementBuilder else_(Statement block);
}
