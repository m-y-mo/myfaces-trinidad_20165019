// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/
package org.apache.myfaces.trinidad.component;

import javax.faces.component.NamingContainer;
import javax.faces.context.FacesContext;
import javax.faces.event.FacesEvent;
import javax.faces.event.PhaseId;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * UIXSubform is the base abstraction for an independently submittable
 * region of a page.  The contents of a subform will only be validated
 * (or otherwise processed) if a component inside of the subform is
 * responsible for submitting the page.  This allows for comparatively
 * fine-grained control of which components will be validated and pushed
 * into the model without the compromises of using entirely separate form
 * elements.  UIXSubform is a <html:code>NamingContainer</html:code> and
 * therefore IDs can be reused between subforms.
 * 
 * <section name="Behavior of subforms">
 * <html:p>
 * A <html:code>UIXSubform</html:code> is considered &quot;submitted&quot; if an
 * event is queued by one of its children or facets for a phase later
 * than &quot;Apply Request Values&quot; (that is, for later than
 * <html:code>decode()</html:code>).  The most common example is a
 * (non-immediate) &quot;command&quot; component (like an &lt;h:commandButton&gt;
 * or &lt;tr:commandButton&gt;).
 * </html:p>
 * <html:p>
 * A <html:code>UIXSubform</html:code> will always allow the
 * &quot;Apply Request Values&quot; phase to execute for its children,
 * even when not &quot;submitted&quot;, but when not &quot;submitted&quot;, the
 * &quot;Process Validations&quot; and &quot;Update Model Values&quot; phases will
 * be skipped.  This differs from an ordinary form component,
 * which, when not submitted, does not (and cannot) run
 * &quot;Apply Request Values&quot; either.
 * </html:p>
 * </section>
 * <section name="UIXSubform and &quot;default&quot;">
 * <html:p>
 * In some scenarios, there may be buttons (or other components
 * that submit the page) outside of the main content of a page.  If
 * this main content is in a UIXSubform, it could not be fully
 * processed whenever those buttons are clicked, since those
 * buttons aren't inside of the UIXSubform.  To support this
 * scenario, Apache Trinidad supports a &quot;default&quot; property on
 * UIXSubform.  A &quot;default&quot; subform behaves like any other
 * subform in most respects, but if <html:em>no</html:em> subforms
 * are &quot;submitted&quot; - if no subform has an appropriate event
 * come from its children - then all &quot;default&quot; subforms act
 * as if they are &quot;submitted&quot;.
 * </html:p>
 * </section>
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXSubform extends UIXComponentBase
                        implements NamingContainer
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey SUBMITTED_KEY =
    TYPE.registerKey("submitted", Boolean.class, Boolean.FALSE, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_TRANSIENT);
  static public final PropertyKey DEFAULT_KEY =
    TYPE.registerKey("default", Boolean.class, Boolean.FALSE, PropertyKey.CAP_NOT_BOUND);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Subform";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Subform";

  /**
   * Construct an instance of the UIXSubform.
   */
  public UIXSubform()
  {
    super("org.apache.myfaces.trinidad.Subform");
  }
  
  @Override
  public void queueEvent(FacesEvent event)
  {
    // If the event is being queued for anything *after* APPLY_REQUEST_VALUES,
    // then this subform is active.
    if (PhaseId.APPLY_REQUEST_VALUES.compareTo(event.getPhaseId()) < 0)
    {
      _storeSomethingSubmitted(FacesContext.getCurrentInstance());
      setSubmitted(true);
    }

    super.queueEvent(event);
  }

  @Override
  public void processDecodes(FacesContext context)
  {
    setSubmitted(false);
    super.processDecodes(context);
  }

  @Override
  public void processValidators(FacesContext context)
  {
    if (!isSubmitted() && isDefault() && !_isSomethingSubmitted(context))
      setSubmitted(true);

    if (isSubmitted())
      super.processValidators(context);
  }

  @Override
  public void processUpdates(FacesContext context)
  {
    if (isSubmitted())
      super.processUpdates(context);
  }

  @SuppressWarnings("unchecked")
  static private void _storeSomethingSubmitted(FacesContext context)
  {
    context.getExternalContext().getRequestMap().put(_SOMETHING_SUBMITTED,
                                                     Boolean.TRUE);
  }

  static private boolean _isSomethingSubmitted(FacesContext context)
  {
    return Boolean.TRUE.equals(context.getExternalContext().
                               getRequestMap().get(_SOMETHING_SUBMITTED));
  }

  static private final String _SOMETHING_SUBMITTED =
    "org.apache.myfaces.trinidad.component.UIXSubformSubmitted";

  /**
   * Gets whether the subform was submitted on this request
   *
   * @return  the new submitted value
   */
  final public boolean isSubmitted()
  {
    return ComponentUtils.resolveBoolean(getProperty(SUBMITTED_KEY), false);
  }

  /**
   * Sets whether the subform was submitted on this request
   * 
   * @param submitted  the new submitted value
   */
  final public void setSubmitted(boolean submitted)
  {
    setProperty(SUBMITTED_KEY, submitted ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets whether the subform should assume it
   * has been submitted.  When set to "true", "submitted" will be
   * considered true if no other subform has been submitted.
   *
   * @return  the new default value
   */
  final public boolean isDefault()
  {
    return ComponentUtils.resolveBoolean(getProperty(DEFAULT_KEY), false);
  }

  /**
   * Sets whether the subform should assume it
   * has been submitted.  When set to "true", "submitted" will be
   * considered true if no other subform has been submitted.
   * 
   * @param defaultParam  the new default value
   */
  final public void setDefault(boolean defaultParam)
  {
    setProperty(DEFAULT_KEY, defaultParam ? Boolean.TRUE : Boolean.FALSE);
  }

  @Override
  public String getFamily()
  {
    return COMPONENT_FAMILY;
  }

  @Override
  protected FacesBean.Type getBeanType()
  {
    return TYPE;
  }

  /**
   * Construct an instance of the UIXSubform.
   */
  protected UIXSubform(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Subform","org.apache.myfaces.trinidad.Subform");
  }
}
