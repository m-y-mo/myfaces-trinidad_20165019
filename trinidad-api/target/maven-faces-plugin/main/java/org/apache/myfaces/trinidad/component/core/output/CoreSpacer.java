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
package org.apache.myfaces.trinidad.component.core.output;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXObject;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * spacer occupies a fixed amount of space in a layout, specified by
 *           its width and height attributes. If the width is not specified, but
 *           height specified, a block level HTML element is rendered, thereby
 *           introducing a new line effect. If width is specified, then,
 *           irrespective of the specified value of height, it may not get shorter
 *           than the applicable line-height, in user agents that strictly support
 *           standards mode HTML.
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
public class CoreSpacer extends UIXObject
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXObject.TYPE);
  static public final PropertyKey WIDTH_KEY =
    TYPE.registerKey("width", String.class);
  static public final PropertyKey HEIGHT_KEY =
    TYPE.registerKey("height", String.class);
  static public final PropertyKey SHORT_DESC_KEY =
    TYPE.registerKey("shortDesc", String.class);
  static public final PropertyKey PARTIAL_TRIGGERS_KEY =
    TYPE.registerKey("partialTriggers", String[].class);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Object";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CoreSpacer";

  /**
   * Construct an instance of the CoreSpacer.
   */
  public CoreSpacer()
  {
    super("org.apache.myfaces.trinidad.Spacer");
  }

  /**
   * Gets the width of the spacer item.
   *
   * @return  the new width value
   */
  final public String getWidth()
  {
    return ComponentUtils.resolveString(getProperty(WIDTH_KEY));
  }

  /**
   * Sets the width of the spacer item.
   * 
   * @param width  the new width value
   */
  final public void setWidth(String width)
  {
    setProperty(WIDTH_KEY, (width));
  }

  /**
   * Sets the width of the spacer item.
   * 
   * @param width  the new width value
   */
  final public void setWidth(int width)
  {
    setProperty(WIDTH_KEY, Integer.valueOf(width));
  }

  /**
   * Gets the height of the spacer item.
   *
   * @return  the new height value
   */
  final public String getHeight()
  {
    return ComponentUtils.resolveString(getProperty(HEIGHT_KEY));
  }

  /**
   * Sets the height of the spacer item.
   * 
   * @param height  the new height value
   */
  final public void setHeight(String height)
  {
    setProperty(HEIGHT_KEY, (height));
  }

  /**
   * Sets the height of the spacer item.
   * 
   * @param height  the new height value
   */
  final public void setHeight(int height)
  {
    setProperty(HEIGHT_KEY, Integer.valueOf(height));
  }

  /**
   * Gets the short description of the bean.  This text
   *          is commonly used by user agents to display tooltip help text.
   *
   * @return  the new shortDesc value
   */
  final public String getShortDesc()
  {
    return ComponentUtils.resolveString(getProperty(SHORT_DESC_KEY));
  }

  /**
   * Sets the short description of the bean.  This text
   *          is commonly used by user agents to display tooltip help text.
   * 
   * @param shortDesc  the new shortDesc value
   */
  final public void setShortDesc(String shortDesc)
  {
    setProperty(SHORT_DESC_KEY, (shortDesc));
  }

  /**
   * Gets the IDs of the components that should trigger a partial update.
   *          This component will listen on the trigger components. If one of the
   *          trigger components receives an event that will cause it to update
   *          in some way, this component will request to be updated too.
   *
   * @return  the new partialTriggers value
   */
  final public String[] getPartialTriggers()
  {
    return (String[])getProperty(PARTIAL_TRIGGERS_KEY);
  }

  /**
   * Sets the IDs of the components that should trigger a partial update.
   *          This component will listen on the trigger components. If one of the
   *          trigger components receives an event that will cause it to update
   *          in some way, this component will request to be updated too.
   * 
   * @param partialTriggers  the new partialTriggers value
   */
  final public void setPartialTriggers(String[] partialTriggers)
  {
    setProperty(PARTIAL_TRIGGERS_KEY, (partialTriggers));
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
   * Construct an instance of the CoreSpacer.
   */
  protected CoreSpacer(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Object","org.apache.myfaces.trinidad.Spacer");
  }
}
