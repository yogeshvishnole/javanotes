/*
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the "License").  You may not use this file except
 * in compliance with the License.
 *
 * You can obtain a copy of the license at
 * glassfish/bootstrap/legal/CDDLv1.0.txt or
 * https://glassfish.dev.java.net/public/CDDLv1.0.html.
 * See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * HEADER in each file and include the License file at
 * glassfish/bootstrap/legal/CDDLv1.0.txt.  If applicable,
 * add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your
 * own identifying information: Portions Copyright [yyyy]
 * [name of copyright owner]
 *
 * Copyright 2005 Sun Microsystems, Inc. All rights reserved.
 *
 * Portions Copyright Apache Software Foundation.
 */ 

package org.apache.taglibs.standard.tag.el.core;

import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.jstl.core.LoopTag;
import javax.servlet.jsp.tagext.IterationTag;

import org.apache.taglibs.standard.lang.support.ExpressionEvaluatorManager;
import org.apache.taglibs.standard.tag.common.core.ForEachSupport;
import org.apache.taglibs.standard.tag.common.core.NullAttributeException;

/**
 * <p>A handler for &lt;forEach&gt; that accepts attributes as Strings
 * and evaluates them as expressions at runtime.</p>
 *
 * @author Shawn Bayern
 */

public class ForEachTag
    extends ForEachSupport
    implements LoopTag, IterationTag
{

    //*********************************************************************
    // 'Private' state (implementation details)

    private String begin_;                      // stores EL-based property
    private String end_;                        // stores EL-based property
    private String step_;                       // stores EL-based property
    private String items_;			// stores EL-based property


    //*********************************************************************
    // Constructor

    public ForEachTag() {
        super();
        init();
    }


    //*********************************************************************
    // Tag logic

    /* Begins iterating by processing the first item. */
    public int doStartTag() throws JspException {

        // evaluate any expressions we were passed, once per invocation
        evaluateExpressions();

	// chain to the parent implementation
	return super.doStartTag();
    }


    // Releases any resources we may have (or inherit)
    public void release() {
        super.release();
        init();
    }


    //*********************************************************************
    // Accessor methods

    // for EL-based attribute
    public void setBegin(String begin_) {
        this.begin_ = begin_;
        this.beginSpecified = true;
    }

    // for EL-based attribute
    public void setEnd(String end_) {
        this.end_ = end_;
        this.endSpecified = true;
    }

    // for EL-based attribute
    public void setStep(String step_) {
        this.step_ = step_;
        this.stepSpecified = true;
    }

    public void setItems(String items_) {
        this.items_ = items_;
    }

    //*********************************************************************
    // Private (utility) methods

    // (re)initializes state (during release() or construction)
    private void init() {
        // defaults for interface with page author
        begin_ = null;          // (no expression)
        end_ = null;            // (no expression)
        step_ = null;           // (no expression)
	items_ = null;		// (no expression)
    }

    /* Evaluates expressions as necessary */
    private void evaluateExpressions() throws JspException {
        /* 
         * Note: we don't check for type mismatches here; we assume
         * the expression evaluator will return the expected type
         * (by virtue of knowledge we give it about what that type is).
         * A ClassCastException here is truly unexpected, so we let it
         * propagate up.
         */

        if (begin_ != null) {
            Object r = ExpressionEvaluatorManager.evaluate(
                "begin", begin_, Integer.class, this, pageContext);
	    if (r == null)
		throw new NullAttributeException("forEach", "begin");
            begin = ((Integer) r).intValue();
            validateBegin();
        }

        if (end_ != null) {
            Object r = ExpressionEvaluatorManager.evaluate(
                "end", end_, Integer.class, this, pageContext);
	    if (r == null)
		throw new NullAttributeException("forEach", "end");
            end = ((Integer) r).intValue();
            validateEnd();
        }

        if (step_ != null) {
            Object r = ExpressionEvaluatorManager.evaluate(
                "step", step_, Integer.class, this, pageContext);
	    if (r == null)
		throw new NullAttributeException("forEach", "step");
            step = ((Integer) r).intValue();
            validateStep();
        }

	if (items_ != null) {
            rawItems = ExpressionEvaluatorManager.evaluate(
                "items", items_, Object.class, this, pageContext);
	    // use an empty list to indicate "no iteration", if relevant
	    if (rawItems == null)
		rawItems = new ArrayList();
        }
    }
}
