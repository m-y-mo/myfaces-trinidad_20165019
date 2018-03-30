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
 *           The html tag generates the &lt;html&gt; element for an HTML page.
 * It will automatically generate &quot;locale&quot; and &quot;dir&quot; attributes
 * based on the current locale.
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
public class HtmlHtml extends UIXComponentBase
{
  static public final String MODE_DEFAULT = "default";
  static public final String MODE_STRICT = "strict";
  static public final String MODE_QUIRKS = "quirks";
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey MODE_KEY =
    TYPE.registerKey("mode", String.class, "default");

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Html";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.HtmlHtml";

  /**
   * Construct an instance of the HtmlHtml.
   */
  public HtmlHtml()
  {
    super("org.apache.myfaces.trinidad.Html");
  }

  /**
   * Gets Set if the page should render in default standards mode, quirks mode, or strict mode.  Behavior of the modes are:<ul>
   * <li>"default": renders as transitional doctypes for both XHTML and HTML,
   * with <a href="http://developer.mozilla.org/en/docs/Gecko's_%22Almost_Standards%22_Mode">"almost standards"</a> rendering mode</li>
   * <li>"strict": renders as a strict doctype for both XHTML and HTML, also
   * in standards rendering mode</li>
   * <li>"quirks": renders HTML pages in quirks mode, and XHTML with
   * a transitional doctype, but standards mode  (there is no quirks mode for
   * XHTML).</li></ul>
   *
   * @return  the new mode value
   */
  final public String getMode()
  {
    return ComponentUtils.resolveString(getProperty(MODE_KEY), "default");
  }

  /**
   * Sets Set if the page should render in default standards mode, quirks mode, or strict mode.  Behavior of the modes are:<ul>
   * <li>"default": renders as transitional doctypes for both XHTML and HTML,
   * with <a href="http://developer.mozilla.org/en/docs/Gecko's_%22Almost_Standards%22_Mode">"almost standards"</a> rendering mode</li>
   * <li>"strict": renders as a strict doctype for both XHTML and HTML, also
   * in standards rendering mode</li>
   * <li>"quirks": renders HTML pages in quirks mode, and XHTML with
   * a transitional doctype, but standards mode  (there is no quirks mode for
   * XHTML).</li></ul>
   * 
   * @param mode  the new mode value
   */
  final public void setMode(String mode)
  {
    setProperty(MODE_KEY, (mode));
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
   * Construct an instance of the HtmlHtml.
   */
  protected HtmlHtml(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Html","org.apache.myfaces.trinidad.Html");
  }
}
