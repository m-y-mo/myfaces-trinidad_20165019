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

import javax.faces.context.FacesContext;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
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
public class UIXForm extends UIXComponentBase
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey SUBMITTED_KEY =
    TYPE.registerKey("submitted", Boolean.class, Boolean.FALSE, PropertyKey.CAP_TRANSIENT);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Form";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Form";

  /**
   * Construct an instance of the UIXForm.
   */
  public UIXForm()
  {
    super("org.apache.myfaces.trinidad.Form");
  }
    
  @Override
  public void processDecodes(FacesContext context)
  {
    if (!isRendered())
      return;

    decode(context);
    if (!isSubmitted())
      return;

    decodeChildren(context);
  }

  @Override
  public void processValidators(FacesContext context)
  {
    if (isSubmitted())
      super.processValidators(context);
  }

  @Override
  public void processUpdates(FacesContext context)
  {
    if (isSubmitted())
      super.processUpdates(context);
  }

  /**
   * Gets whether the form was submitted on this request
   *
   * @return  the new submitted value
   */
  final public boolean isSubmitted()
  {
    return ComponentUtils.resolveBoolean(getProperty(SUBMITTED_KEY), false);
  }

  /**
   * Sets whether the form was submitted on this request
   * 
   * @param submitted  the new submitted value
   */
  final public void setSubmitted(boolean submitted)
  {
    setProperty(SUBMITTED_KEY, submitted ? Boolean.TRUE : Boolean.FALSE);
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
   * Construct an instance of the UIXForm.
   */
  protected UIXForm(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Form","org.apache.myfaces.trinidad.Form");
  }
}
