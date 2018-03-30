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
package org.apache.myfaces.trinidad.component.core.input;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXSelectItem;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * The selectItem tag represents a single item that the user
 * may select from a list, choice, radio, or shuttle Trinidad control.
 * It may be used in place of the JSF selectItem or selectItems
 * tags, but is very similar (largely not requiring &quot;item&quot; in front
 * of its attributes.)
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
public class CoreSelectItem extends UIXSelectItem
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXSelectItem.TYPE);
  static public final PropertyKey LABEL_KEY =
    TYPE.registerKey("label", String.class);
  static public final PropertyKey DISABLED_KEY =
    TYPE.registerKey("disabled", Boolean.class, Boolean.FALSE);
  static public final PropertyKey LONG_DESC_KEY =
    TYPE.registerKey("longDesc", String.class);
  static public final PropertyKey SHORT_DESC_KEY =
    TYPE.registerKey("shortDesc", String.class);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.SelectItem";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CoreSelectItem";

  /**
   * Construct an instance of the CoreSelectItem.
   */
  public CoreSelectItem()
  {
    super(null);
  }

  /**
   * Gets the user-visible text of the item
   *
   * @return  the new label value
   */
  final public String getLabel()
  {
    return ComponentUtils.resolveString(getProperty(LABEL_KEY));
  }

  /**
   * Sets the user-visible text of the item
   * 
   * @param label  the new label value
   */
  final public void setLabel(String label)
  {
    setProperty(LABEL_KEY, (label));
  }

  /**
   * Gets whether the item is disabled.  By default, no
   *           items are disabled.
   *
   * @return  the new disabled value
   */
  final public boolean isDisabled()
  {
    return ComponentUtils.resolveBoolean(getProperty(DISABLED_KEY), false);
  }

  /**
   * Sets whether the item is disabled.  By default, no
   *           items are disabled.
   * 
   * @param disabled  the new disabled value
   */
  final public void setDisabled(boolean disabled)
  {
    setProperty(DISABLED_KEY, disabled ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets the description associated with this option.
   *         This is used in selectManyShuttle and selectOrderShuttle, and ignored otherwise.
   *
   * @return  the new longDesc value
   */
  final public String getLongDesc()
  {
    return ComponentUtils.resolveString(getProperty(LONG_DESC_KEY));
  }

  /**
   * Sets the description associated with this option.
   *         This is used in selectManyShuttle and selectOrderShuttle, and ignored otherwise.
   * 
   * @param longDesc  the new longDesc value
   */
  final public void setLongDesc(String longDesc)
  {
    setProperty(LONG_DESC_KEY, (longDesc));
  }

  /**
   * Gets The short description of the bean.  This text
   *          is commonly used by user agents to display advisory information about the option.
   *
   * @return  the new shortDesc value
   */
  final public String getShortDesc()
  {
    return ComponentUtils.resolveString(getProperty(SHORT_DESC_KEY));
  }

  /**
   * Sets The short description of the bean.  This text
   *          is commonly used by user agents to display advisory information about the option.
   * 
   * @param shortDesc  the new shortDesc value
   */
  final public void setShortDesc(String shortDesc)
  {
    setProperty(SHORT_DESC_KEY, (shortDesc));
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
   * Construct an instance of the CoreSelectItem.
   */
  protected CoreSelectItem(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lock();
  }
}
