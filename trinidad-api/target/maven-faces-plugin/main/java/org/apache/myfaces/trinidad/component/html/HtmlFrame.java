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
 * The frame is used to specify attributes needed by an
 *           HTML frame. It does not render any child nodes, and should only be used as
 *           a facet on a frameBorderLayout component. The contents of a frame is selected
 *           by using the source attribute.
 *           <html:p>
 *           On mobile devices a list links to each frame is rendered
 *           for a frameBorderLayout, and each frame is brought up
 *           as a separate page.
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
public class HtmlFrame extends UIXComponentBase
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey SOURCE_KEY =
    TYPE.registerKey("source", String.class);
  static public final PropertyKey LONG_DESC_URL_KEY =
    TYPE.registerKey("longDescURL", String.class);
  static public final PropertyKey NAME_KEY =
    TYPE.registerKey("name", String.class);
  static public final PropertyKey WIDTH_KEY =
    TYPE.registerKey("width", String.class);
  static public final PropertyKey HEIGHT_KEY =
    TYPE.registerKey("height", String.class);
  static public final PropertyKey MARGIN_WIDTH_KEY =
    TYPE.registerKey("marginWidth", Integer.class);
  static public final PropertyKey MARGIN_HEIGHT_KEY =
    TYPE.registerKey("marginHeight", Integer.class);
  static public final PropertyKey SCROLLING_KEY =
    TYPE.registerKey("scrolling", String.class, "auto");
  static public final PropertyKey SHORT_DESC_KEY =
    TYPE.registerKey("shortDesc", String.class);
  static public final PropertyKey PARTIAL_TRIGGERS_KEY =
    TYPE.registerKey("partialTriggers", String[].class);
  static public final PropertyKey STYLE_CLASS_KEY =
    TYPE.registerKey("styleClass", String.class);
  static public final PropertyKey INLINE_STYLE_KEY =
    TYPE.registerKey("inlineStyle", String.class);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Frame";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.HtmlFrame";

  /**
   * Construct an instance of the HtmlFrame.
   */
  public HtmlFrame()
  {
    super("org.apache.myfaces.trinidad.Frame");
  }

  /**
   * Gets the URI for the source of this frame
   * <p>
   * This is a required property on the component.
   * </p>
   *
   * @return  the new source value
   */
  final public String getSource()
  {
    return ComponentUtils.resolveString(getProperty(SOURCE_KEY));
  }

  /**
   * Sets the URI for the source of this frame
   * <p>
   * This is a required property on the component.
   * 
   * @param source  the new source value
   */
  final public void setSource(String source)
  {
    setProperty(SOURCE_KEY, (source));
  }

  /**
   * Gets <html> This attribute specifies a link to a long description of the
   *              frame. This description should supplement the short description
   *              provided using the <code>shortDesc</code> attribute, and
   *              may be particularly useful for non-visual user agents.</html>
   *
   * @return  the new longDescURL value
   */
  final public String getLongDescURL()
  {
    return ComponentUtils.resolveString(getProperty(LONG_DESC_URL_KEY));
  }

  /**
   * Sets <html> This attribute specifies a link to a long description of the
   *              frame. This description should supplement the short description
   *              provided using the <code>shortDesc</code> attribute, and
   *              may be particularly useful for non-visual user agents.</html>
   * 
   * @param longDescURL  the new longDescURL value
   */
  final public void setLongDescURL(String longDescURL)
  {
    setProperty(LONG_DESC_URL_KEY, (longDescURL));
  }

  /**
   * Gets the name used to identify this frame
   *
   * @return  the new name value
   */
  final public String getName()
  {
    return ComponentUtils.resolveString(getProperty(NAME_KEY));
  }

  /**
   * Sets the name used to identify this frame
   * 
   * @param name  the new name value
   */
  final public void setName(String name)
  {
    setProperty(NAME_KEY, (name));
  }

  /**
   * Gets the proposed width of this frame
   *               This can be in pixels or percentage. This attribute is used only if this
   *               frame is a left/right facet of a frameBorderLayout component.
   *
   * @return  the new width value
   */
  final public String getWidth()
  {
    return ComponentUtils.resolveString(getProperty(WIDTH_KEY));
  }

  /**
   * Sets the proposed width of this frame
   *               This can be in pixels or percentage. This attribute is used only if this
   *               frame is a left/right facet of a frameBorderLayout component.
   * 
   * @param width  the new width value
   */
  final public void setWidth(String width)
  {
    setProperty(WIDTH_KEY, (width));
  }

  /**
   * Gets the proposed height of this frame.
   *               This can be in pixels or percentage. This attribute is used only if this
   *               frame is a top/bottom facet of a frameBorderLayout component.
   *
   * @return  the new height value
   */
  final public String getHeight()
  {
    return ComponentUtils.resolveString(getProperty(HEIGHT_KEY));
  }

  /**
   * Sets the proposed height of this frame.
   *               This can be in pixels or percentage. This attribute is used only if this
   *               frame is a top/bottom facet of a frameBorderLayout component.
   * 
   * @param height  the new height value
   */
  final public void setHeight(String height)
  {
    setProperty(HEIGHT_KEY, (height));
  }

  /**
   * Gets the width of the frame margin. The value must be greater than zero (pixels).
   *
   * @return  the new marginWidth value
   */
  final public int getMarginWidth()
  {
    return ComponentUtils.resolveInteger(getProperty(MARGIN_WIDTH_KEY));
  }

  /**
   * Sets the width of the frame margin. The value must be greater than zero (pixels).
   * 
   * @param marginWidth  the new marginWidth value
   */
  final public void setMarginWidth(int marginWidth)
  {
    setProperty(MARGIN_WIDTH_KEY, Integer.valueOf(marginWidth));
  }

  /**
   * Gets the width of the frame margin. The value must be greater than zero (pixels).
   *
   * @return  the new marginHeight value
   */
  final public int getMarginHeight()
  {
    return ComponentUtils.resolveInteger(getProperty(MARGIN_HEIGHT_KEY));
  }

  /**
   * Sets the width of the frame margin. The value must be greater than zero (pixels).
   * 
   * @param marginHeight  the new marginHeight value
   */
  final public void setMarginHeight(int marginHeight)
  {
    setProperty(MARGIN_HEIGHT_KEY, Integer.valueOf(marginHeight));
  }

  /**
   * Gets <html> whether or not scrollbars are available on this
   *               frame. Valid values for this attribute are the following
   *               constants:<br/>
   * 
   * 
   *      "yes" specifies that scrollbars are always available. <br/>
   *      "no" specifies that scrollbars are never available. <br/>
   *      "auto" specifies that the browser determines whether to display scroll
   *               bars based on the size of the frame and its content. If
   *               you do not specify a value for scrolling, the default
   *               value is "auto"</html>
   *
   * @return  the new scrolling value
   */
  final public String getScrolling()
  {
    return ComponentUtils.resolveString(getProperty(SCROLLING_KEY), "auto");
  }

  /**
   * Sets <html> whether or not scrollbars are available on this
   *               frame. Valid values for this attribute are the following
   *               constants:<br/>
   * 
   * 
   *      "yes" specifies that scrollbars are always available. <br/>
   *      "no" specifies that scrollbars are never available. <br/>
   *      "auto" specifies that the browser determines whether to display scroll
   *               bars based on the size of the frame and its content. If
   *               you do not specify a value for scrolling, the default
   *               value is "auto"</html>
   * 
   * @param scrolling  the new scrolling value
   */
  final public void setScrolling(String scrolling)
  {
    setProperty(SCROLLING_KEY, (scrolling));
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

  /**
   * Gets the CSS style class of the bean.
   *
   * @return  the new styleClass value
   */
  final public String getStyleClass()
  {
    return ComponentUtils.resolveString(getProperty(STYLE_CLASS_KEY));
  }

  /**
   * Sets the CSS style class of the bean.
   * 
   * @param styleClass  the new styleClass value
   */
  final public void setStyleClass(String styleClass)
  {
    setProperty(STYLE_CLASS_KEY, (styleClass));
  }

  /**
   * Gets the inline CSS style for this element
   *
   * @return  the new inlineStyle value
   */
  final public String getInlineStyle()
  {
    return ComponentUtils.resolveString(getProperty(INLINE_STYLE_KEY));
  }

  /**
   * Sets the inline CSS style for this element
   * 
   * @param inlineStyle  the new inlineStyle value
   */
  final public void setInlineStyle(String inlineStyle)
  {
    setProperty(INLINE_STYLE_KEY, (inlineStyle));
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
   * Construct an instance of the HtmlFrame.
   */
  protected HtmlFrame(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Frame","org.apache.myfaces.trinidad.Frame");
  }
}
