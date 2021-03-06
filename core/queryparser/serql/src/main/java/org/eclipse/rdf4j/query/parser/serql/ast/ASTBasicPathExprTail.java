/*******************************************************************************
 * Copyright (c) 2015 Eclipse RDF4J contributors, Aduna, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *******************************************************************************/
package org.eclipse.rdf4j.query.parser.serql.ast;

public class ASTBasicPathExprTail extends ASTPathExprTail {

	public ASTBasicPathExprTail(int id) {
		super(id);
	}

	public ASTBasicPathExprTail(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	@Override
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
		return visitor.visit(this, data);
	}

	public ASTEdge getEdge() {
		return (ASTEdge) children.get(0);
	}

	public ASTNode getNode() {
		return (ASTNode) children.get(1);
	}

	@Override
	public ASTPathExprTail getNextTail() {
		if (children.size() >= 3) {
			return (ASTPathExprTail) children.get(2);
		}

		return null;
	}
}
