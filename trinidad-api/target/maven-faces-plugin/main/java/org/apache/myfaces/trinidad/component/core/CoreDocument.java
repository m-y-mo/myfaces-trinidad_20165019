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
package org.apache.myfaces.trinidad.component.core;

import javax.faces.component.UIComponent;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXDocument;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * The CoreDocument creates each of the standard root elements of an HTML page:  &lt;html&gt;, &lt;body&gt;, and &lt;head&gt;, but by abstracting away from those components, can be used in non-HTML pages as well.
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
public class CoreDocument extends UIXDocument
{
  static public final String MODE_DEFAULT = "default";
  static public final String MODE_STRICT = "strict";
  static public final String MODE_QUIRKS = "quirks";
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXDocument.TYPE);
  static public final PropertyKey TITLE_KEY =
    TYPE.registerKey("title", String.class);
  static public final PropertyKey MODE_KEY =
    TYPE.registerKey("mode", String.class, "default");
  static public final PropertyKey INLINE_STYLE_KEY =
    TYPE.registerKey("inlineStyle", String.class);
  static public final PropertyKey STYLE_CLASS_KEY =
    TYPE.registerKey("styleClass", String.class);
  static public final PropertyKey SHORT_DESC_KEY =
    TYPE.registerKey("shortDesc", String.class);
  static public final PropertyKey PARTIAL_TRIGGERS_KEY =
    TYPE.registerKey("partialTriggers", String[].class);
  static public final PropertyKey ONCLICK_KEY =
    TYPE.registerKey("onclick", String.class);
  static public final PropertyKey ONDBLCLICK_KEY =
    TYPE.registerKey("ondblclick", String.class);
  static public final PropertyKey ONMOUSEDOWN_KEY =
    TYPE.registerKey("onmousedown", String.class);
  static public final PropertyKey ONMOUSEUP_KEY =
    TYPE.registerKey("onmouseup", String.class);
  static public final PropertyKey ONMOUSEOVER_KEY =
    TYPE.registerKey("onmouseover", String.class);
  static public final PropertyKey ONMOUSEMOVE_KEY =
    TYPE.registerKey("onmousemove", String.class);
  static public final PropertyKey ONMOUSEOUT_KEY =
    TYPE.registerKey("onmouseout", String.class);
  static public final PropertyKey ONKEYPRESS_KEY =
    TYPE.registerKey("onkeypress", String.class);
  static public final PropertyKey ONKEYDOWN_KEY =
    TYPE.registerKey("onkeydown", String.class);
  static public final PropertyKey ONKEYUP_KEY =
    TYPE.registerKey("onkeyup", String.class);
  static public final PropertyKey ONLOAD_KEY =
    TYPE.registerKey("onload", String.class);
  static public final PropertyKey ONUNLOAD_KEY =
    TYPE.registerKey("onunload", String.class);
  static public final PropertyKey INITIAL_FOCUS_ID_KEY =
    TYPE.registerKey("initialFocusId", String.class);
  static public final String META_CONTAINER_FACET = "metaContainer";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Document";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CoreDocument";

  /**
   * Construct an instance of the CoreDocument.
   */
  public CoreDocument()
  {
    super("org.apache.myfaces.trinidad.Document");
  }

  /**
   * Content to be rendered as meta data inside the "head" section.
   */
  final public UIComponent getMetaContainer()
  {
    return getFacet(META_CONTAINER_FACET);
  }

  /**
   * Content to be rendered as meta data inside the "head" section.
   */
  @SuppressWarnings("unchecked")
  final public void setMetaContainer(UIComponent metaContainerFacet)
  {
    getFacets().put(META_CONTAINER_FACET, metaContainerFacet);
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

  /**
   * Gets the CSS styles to use for this component.
   *
   * @return  the new inlineStyle value
   */
  final public String getInlineStyle()
  {
    return ComponentUtils.resolveString(getProperty(INLINE_STYLE_KEY));
  }

  /**
   * Sets the CSS styles to use for this component.
   * 
   * @param inlineStyle  the new inlineStyle value
   */
  final public void setInlineStyle(String inlineStyle)
  {
    setProperty(INLINE_STYLE_KEY, (inlineStyle));
  }

  /**
   * Gets a CSS style class to use for this component.
   *
   * @return  the new styleClass value
   */
  final public String getStyleClass()
  {
    return ComponentUtils.resolveString(getProperty(STYLE_CLASS_KEY));
  }

  /**
   * Sets a CSS style class to use for this component.
   * 
   * @param styleClass  the new styleClass value
   */
  final public void setStyleClass(String styleClass)
  {
    setProperty(STYLE_CLASS_KEY, (styleClass));
  }

  /**
   * Gets The short description of the component. This text is commonly used by user agents to display tooltip help text.
   *
   * @return  the new shortDesc value
   */
  final public String getShortDesc()
  {
    return ComponentUtils.resolveString(getProperty(SHORT_DESC_KEY));
  }

  /**
   * Sets The short description of the component. This text is commonly used by user agents to display tooltip help text.
   * 
   * @param shortDesc  the new shortDesc value
   */
  final public void setShortDesc(String shortDesc)
  {
    setProperty(SHORT_DESC_KEY, (shortDesc));
  }

  /**
   * Gets the IDs of the components that should trigger a partial update.
   *         <p>
   *         This component will listen on the trigger components. If one of the
   *         trigger components receives an event that will cause it to update
   *         in some way, this component will request to be updated too.</p>
   *         <p>
   *         Separate multiple triggers with a space. e.g., partialTriggers="cmp1 cmp2"
   *         </p>
   *         <p>
   *         Identifiers must account for NamingContainers.  You can use a single colon to start the search from the root,
   *         or use multiple colons to move up through the NamingContainer. For example,
   *         "::" will pop out of this component's naming container (it pops out of itself if it is a naming container), 
   *         ":::" will pop out of two naming containers, etc. The search for
   *         the partialTrigger begins from there. e.g., partialTriggers=":::commandButton1" the search begins for the 
   *         component with id = commandButton1 after popping out of two naming containers relative to this component.
   *         To go into naming containers, you separate the naming containers with ':', e.g.,partialTriggers= "nc1:nc2:nc3:componentId".</p>
   *
   * @return  the new partialTriggers value
   */
  final public String[] getPartialTriggers()
  {
    return (String[])getProperty(PARTIAL_TRIGGERS_KEY);
  }

  /**
   * Sets the IDs of the components that should trigger a partial update.
   *         <p>
   *         This component will listen on the trigger components. If one of the
   *         trigger components receives an event that will cause it to update
   *         in some way, this component will request to be updated too.</p>
   *         <p>
   *         Separate multiple triggers with a space. e.g., partialTriggers="cmp1 cmp2"
   *         </p>
   *         <p>
   *         Identifiers must account for NamingContainers.  You can use a single colon to start the search from the root,
   *         or use multiple colons to move up through the NamingContainer. For example,
   *         "::" will pop out of this component's naming container (it pops out of itself if it is a naming container), 
   *         ":::" will pop out of two naming containers, etc. The search for
   *         the partialTrigger begins from there. e.g., partialTriggers=":::commandButton1" the search begins for the 
   *         component with id = commandButton1 after popping out of two naming containers relative to this component.
   *         To go into naming containers, you separate the naming containers with ':', e.g.,partialTriggers= "nc1:nc2:nc3:componentId".</p>
   * 
   * @param partialTriggers  the new partialTriggers value
   */
  final public void setPartialTriggers(String[] partialTriggers)
  {
    setProperty(PARTIAL_TRIGGERS_KEY, (partialTriggers));
  }

  /**
   * Gets an onclick Javascript handler.
   *
   * @return  the new onclick value
   */
  final public String getOnclick()
  {
    return ComponentUtils.resolveString(getProperty(ONCLICK_KEY));
  }

  /**
   * Sets an onclick Javascript handler.
   * 
   * @param onclick  the new onclick value
   */
  final public void setOnclick(String onclick)
  {
    setProperty(ONCLICK_KEY, (onclick));
  }

  /**
   * Gets an ondblclick Javascript handler.
   *
   * @return  the new ondblclick value
   */
  final public String getOndblclick()
  {
    return ComponentUtils.resolveString(getProperty(ONDBLCLICK_KEY));
  }

  /**
   * Sets an ondblclick Javascript handler.
   * 
   * @param ondblclick  the new ondblclick value
   */
  final public void setOndblclick(String ondblclick)
  {
    setProperty(ONDBLCLICK_KEY, (ondblclick));
  }

  /**
   * Gets an onmousedown Javascript handler.
   *
   * @return  the new onmousedown value
   */
  final public String getOnmousedown()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEDOWN_KEY));
  }

  /**
   * Sets an onmousedown Javascript handler.
   * 
   * @param onmousedown  the new onmousedown value
   */
  final public void setOnmousedown(String onmousedown)
  {
    setProperty(ONMOUSEDOWN_KEY, (onmousedown));
  }

  /**
   * Gets an onmouseup Javascript handler.
   *
   * @return  the new onmouseup value
   */
  final public String getOnmouseup()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEUP_KEY));
  }

  /**
   * Sets an onmouseup Javascript handler.
   * 
   * @param onmouseup  the new onmouseup value
   */
  final public void setOnmouseup(String onmouseup)
  {
    setProperty(ONMOUSEUP_KEY, (onmouseup));
  }

  /**
   * Gets an onmouseover Javascript handler.
   *
   * @return  the new onmouseover value
   */
  final public String getOnmouseover()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEOVER_KEY));
  }

  /**
   * Sets an onmouseover Javascript handler.
   * 
   * @param onmouseover  the new onmouseover value
   */
  final public void setOnmouseover(String onmouseover)
  {
    setProperty(ONMOUSEOVER_KEY, (onmouseover));
  }

  /**
   * Gets an onmousemove Javascript handler.
   *
   * @return  the new onmousemove value
   */
  final public String getOnmousemove()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEMOVE_KEY));
  }

  /**
   * Sets an onmousemove Javascript handler.
   * 
   * @param onmousemove  the new onmousemove value
   */
  final public void setOnmousemove(String onmousemove)
  {
    setProperty(ONMOUSEMOVE_KEY, (onmousemove));
  }

  /**
   * Gets an onmouseout Javascript handler.
   *
   * @return  the new onmouseout value
   */
  final public String getOnmouseout()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEOUT_KEY));
  }

  /**
   * Sets an onmouseout Javascript handler.
   * 
   * @param onmouseout  the new onmouseout value
   */
  final public void setOnmouseout(String onmouseout)
  {
    setProperty(ONMOUSEOUT_KEY, (onmouseout));
  }

  /**
   * Gets an onkeypress Javascript handler.
   *
   * @return  the new onkeypress value
   */
  final public String getOnkeypress()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYPRESS_KEY));
  }

  /**
   * Sets an onkeypress Javascript handler.
   * 
   * @param onkeypress  the new onkeypress value
   */
  final public void setOnkeypress(String onkeypress)
  {
    setProperty(ONKEYPRESS_KEY, (onkeypress));
  }

  /**
   * Gets an onkeydown Javascript handler.
   *
   * @return  the new onkeydown value
   */
  final public String getOnkeydown()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYDOWN_KEY));
  }

  /**
   * Sets an onkeydown Javascript handler.
   * 
   * @param onkeydown  the new onkeydown value
   */
  final public void setOnkeydown(String onkeydown)
  {
    setProperty(ONKEYDOWN_KEY, (onkeydown));
  }

  /**
   * Gets an onkeyup Javascript handler.
   *
   * @return  the new onkeyup value
   */
  final public String getOnkeyup()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYUP_KEY));
  }

  /**
   * Sets an onkeyup Javascript handler.
   * 
   * @param onkeyup  the new onkeyup value
   */
  final public void setOnkeyup(String onkeyup)
  {
    setProperty(ONKEYUP_KEY, (onkeyup));
  }

  /**
   * Gets an onload Javascript handler.
   *
   * @return  the new onload value
   */
  final public String getOnload()
  {
    return ComponentUtils.resolveString(getProperty(ONLOAD_KEY));
  }

  /**
   * Sets an onload Javascript handler.
   * 
   * @param onload  the new onload value
   */
  final public void setOnload(String onload)
  {
    setProperty(ONLOAD_KEY, (onload));
  }

  /**
   * Gets an onunload Javascript handler.
   *
   * @return  the new onunload value
   */
  final public String getOnunload()
  {
    return ComponentUtils.resolveString(getProperty(ONUNLOAD_KEY));
  }

  /**
   * Sets an onunload Javascript handler.
   * 
   * @param onunload  the new onunload value
   */
  final public void setOnunload(String onunload)
  {
    setProperty(ONUNLOAD_KEY, (onunload));
  }

  /**
   * Gets the id of the component to which you want the
   *         focus to be when the full page renders. The accessibility-mode
   *         must be set to "inaccessible" for this feature to be on.
   *
   * @return  the new initialFocusId value
   */
  final public String getInitialFocusId()
  {
    return ComponentUtils.resolveString(getProperty(INITIAL_FOCUS_ID_KEY));
  }

  /**
   * Sets the id of the component to which you want the
   *         focus to be when the full page renders. The accessibility-mode
   *         must be set to "inaccessible" for this feature to be on.
   * 
   * @param initialFocusId  the new initialFocusId value
   */
  final public void setInitialFocusId(String initialFocusId)
  {
    setProperty(INITIAL_FOCUS_ID_KEY, (initialFocusId));
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
   * Construct an instance of the CoreDocument.
   */
  protected CoreDocument(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Document","org.apache.myfaces.trinidad.Document");
  }
}
