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
package org.apache.myfaces.trinidad.component.html;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXComponentBase;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * <html:p>
 *             Tag for the HTML head element, including the
 *             document's title and any style sheets needed by th
 *             current look-and-feel.  Page authors
 *             that use this do not need to use a styleSheet component, as it
 *             will automatically be included.
 *           </html:p>
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
public class HtmlHead extends UIXComponentBase
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey TITLE_KEY =
    TYPE.registerKey("title", String.class);
  static public final PropertyKey PARTIAL_TRIGGERS_KEY =
    TYPE.registerKey("partialTriggers", String[].class);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Head";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.HtmlHead";

  /**
   * Construct an instance of the HtmlHead.
   */
  public HtmlHead()
  {
    super("org.apache.myfaces.trinidad.Head");
  }

  /**
   * Gets The title of the document.  (This title doesn't have to match the
   *             title on any contained panelPage.)
   *
   * @return  the new title value
   */
  final public String getTitle()
  {
    return ComponentUtils.resolveString(getProperty(TITLE_KEY));
  }

  /**
   * Sets The title of the document.  (This title doesn't have to match the
   *             title on any contained panelPage.)
   * 
   * @param title  the new title value
   */
  final public void setTitle(String title)
  {
    setProperty(TITLE_KEY, (title));
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
   * Construct an instance of the HtmlHead.
   */
  protected HtmlHead(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Head","org.apache.myfaces.trinidad.Head");
  }
}
