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

/**
 *
 * UIXSelectOne is a base abstraction for 
 *           components that allow selection of a single in a
 *     series of selectItem components.
 *           selectOne components may contain any number of
 *           &lt;f:selectItem&gt;, &lt;f:selectItems&gt;, or
 *     &lt;tr:selectItem&gt; components,  each of which
 *           represents an available option that the user may select.
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>javax.faces.event.ValueChangeEvent</code></td>
 * <td valign="top" nowrap>Process Validations<br>Apply Request Values</td>
 * <td valign="top">The valueChange event is delivered when the value
                       attribute is changed.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXSelectOne extends UIXEditableValue
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXEditableValue.TYPE);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.SelectOne";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.SelectOne";

  /**
   * Construct an instance of the UIXSelectOne.
   */
  public UIXSelectOne()
  {
    super("org.apache.myfaces.trinidad.Choice");
  }
  
  static public final String REQUIRED_MESSAGE_ID =
    "org.apache.myfaces.trinidad.UIXSelectOne.REQUIRED";

  // TODO walk through UIXSelectItem values to determine that the new
  //       value is permitted
  @Override
  public void validateValue(FacesContext context, Object newValue)
  {
    super.validateValue(context, newValue);
  }
  
  @Override
  protected String getRequiredMessageKey()
  {
    return REQUIRED_MESSAGE_ID;
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
   * Construct an instance of the UIXSelectOne.
   */
  protected UIXSelectOne(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.SelectOne","org.apache.myfaces.trinidad.Choice");
  }
}
