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

import javax.faces.component.UIComponent;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXComponentBase;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * frameBorderLayout is a layout bean which can be used to place seven
 *           frames at left, right, top, bottom, innerLeft, innerRight and center
 *           positions.  It does not render any children except for the specified
 *           facets which must all be either frames or
 *           frameBorderLayouts. The user may use either left/right or
 *           start/end as facets, but not both.  Left/right takes
 *           precedence over start/end.
 * 
 *           <html:p>
 *           On mobile devices a list linking to each frame is rendered.
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
public class HtmlFrameBorderLayout extends UIXComponentBase
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey ONLOAD_KEY =
    TYPE.registerKey("onload", String.class);
  static public final PropertyKey ONUNLOAD_KEY =
    TYPE.registerKey("onunload", String.class);
  static public final PropertyKey WIDTH_KEY =
    TYPE.registerKey("width", String.class);
  static public final PropertyKey HEIGHT_KEY =
    TYPE.registerKey("height", String.class);
  static public final PropertyKey FRAME_SPACING_KEY =
    TYPE.registerKey("frameSpacing", Integer.class);
  static public final PropertyKey BORDER_WIDTH_KEY =
    TYPE.registerKey("borderWidth", Integer.class);
  static public final PropertyKey FRAME_BORDER_WIDTH_KEY =
    TYPE.registerKey("frameBorderWidth", Integer.class);
  static public final PropertyKey SHORT_DESC_KEY =
    TYPE.registerKey("shortDesc", String.class);
  static public final PropertyKey PARTIAL_TRIGGERS_KEY =
    TYPE.registerKey("partialTriggers", String[].class);
  static public final PropertyKey STYLE_CLASS_KEY =
    TYPE.registerKey("styleClass", String.class);
  static public final PropertyKey INLINE_STYLE_KEY =
    TYPE.registerKey("inlineStyle", String.class);
  static public final String CENTER_FACET = "center";
  static public final String TOP_FACET = "top";
  static public final String BOTTOM_FACET = "bottom";
  static public final String LEFT_FACET = "left";
  static public final String RIGHT_FACET = "right";
  static public final String START_FACET = "start";
  static public final String END_FACET = "end";
  static public final String INNER_LEFT_FACET = "innerLeft";
  static public final String INNER_RIGHT_FACET = "innerRight";
  static public final String INNER_START_FACET = "innerStart";
  static public final String INNER_END_FACET = "innerEnd";
  static public final String ALTERNATE_CONTENT_FACET = "alternateContent";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.FrameBorderLayout";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.HtmlFrameBorderLayout";

  /**
   * Construct an instance of the HtmlFrameBorderLayout.
   */
  public HtmlFrameBorderLayout()
  {
    super("org.apache.myfaces.trinidad.FrameBorderLayout");
  }

  /**
   * The frame to be rendered in the center.
   */
  final public UIComponent getCenter()
  {
    return getFacet(CENTER_FACET);
  }

  /**
   * The frame to be rendered in the center.
   */
  @SuppressWarnings("unchecked")
  final public void setCenter(UIComponent centerFacet)
  {
    getFacets().put(CENTER_FACET, centerFacet);
  }

  /**
   * The frame to be rendered above the center frame.
   *                 This frame's height attribute is used to allocate
   *                 its height.
   */
  final public UIComponent getTop()
  {
    return getFacet(TOP_FACET);
  }

  /**
   * The frame to be rendered above the center frame.
   *                 This frame's height attribute is used to allocate
   *                 its height.
   */
  @SuppressWarnings("unchecked")
  final public void setTop(UIComponent topFacet)
  {
    getFacets().put(TOP_FACET, topFacet);
  }

  /**
   * The frame to be rendered below the center frame.
   *                 This frame's height attribute is used to allocate
   *                 its height.
   */
  final public UIComponent getBottom()
  {
    return getFacet(BOTTOM_FACET);
  }

  /**
   * The frame to be rendered below the center frame.
   *                 This frame's height attribute is used to allocate
   *                 its height.
   */
  @SuppressWarnings("unchecked")
  final public void setBottom(UIComponent bottomFacet)
  {
    getFacets().put(BOTTOM_FACET, bottomFacet);
  }

  /**
   * The frame to be rendered to the left of the center frame.
   *                 This frame's width attribute is used to allocate
   *                 its width.
   */
  final public UIComponent getLeft()
  {
    return getFacet(LEFT_FACET);
  }

  /**
   * The frame to be rendered to the left of the center frame.
   *                 This frame's width attribute is used to allocate
   *                 its width.
   */
  @SuppressWarnings("unchecked")
  final public void setLeft(UIComponent leftFacet)
  {
    getFacets().put(LEFT_FACET, leftFacet);
  }

  /**
   * The frame to be rendered to the right of the center frame.
   *                 This frame's width attribute is used to allocate
   *                 its width.
   */
  final public UIComponent getRight()
  {
    return getFacet(RIGHT_FACET);
  }

  /**
   * The frame to be rendered to the right of the center frame.
   *                 This frame's width attribute is used to allocate
   *                 its width.
   */
  @SuppressWarnings("unchecked")
  final public void setRight(UIComponent rightFacet)
  {
    getFacets().put(RIGHT_FACET, rightFacet);
  }

  /**
   * The frame to be rendered to the left of the center frame,
   *                 if the
   *                 reading direction is left-to-right, or right otherwise.
   *                 This frame's width attribute is used to allocate
   *                 its width.
   */
  final public UIComponent getStart()
  {
    return getFacet(START_FACET);
  }

  /**
   * The frame to be rendered to the left of the center frame,
   *                 if the
   *                 reading direction is left-to-right, or right otherwise.
   *                 This frame's width attribute is used to allocate
   *                 its width.
   */
  @SuppressWarnings("unchecked")
  final public void setStart(UIComponent startFacet)
  {
    getFacets().put(START_FACET, startFacet);
  }

  /**
   * The frame to be rendered to the right of the center frame,
   *                 if the
   *                 reading direction is left-to-right, or left otherwise.
   *                 This frame's width attribute is used to allocate
   *                 its width.
   */
  final public UIComponent getEnd()
  {
    return getFacet(END_FACET);
  }

  /**
   * The frame to be rendered to the right of the center frame,
   *                 if the
   *                 reading direction is left-to-right, or left otherwise.
   *                 This frame's width attribute is used to allocate
   *                 its width.
   */
  @SuppressWarnings("unchecked")
  final public void setEnd(UIComponent endFacet)
  {
    getFacets().put(END_FACET, endFacet);
  }

  /**
   * The frame to be rendered between the left frame and
   *                 the center frame.
   *                 This frame's width attribute is used to allocate
   *                 its width.
   */
  final public UIComponent getInnerLeft()
  {
    return getFacet(INNER_LEFT_FACET);
  }

  /**
   * The frame to be rendered between the left frame and
   *                 the center frame.
   *                 This frame's width attribute is used to allocate
   *                 its width.
   */
  @SuppressWarnings("unchecked")
  final public void setInnerLeft(UIComponent innerLeftFacet)
  {
    getFacets().put(INNER_LEFT_FACET, innerLeftFacet);
  }

  /**
   * The frame to be rendered between the right frame and
   *                 the center frame.
   *                 This frame's width attribute is used to allocate
   *                 its width.
   */
  final public UIComponent getInnerRight()
  {
    return getFacet(INNER_RIGHT_FACET);
  }

  /**
   * The frame to be rendered between the right frame and
   *                 the center frame.
   *                 This frame's width attribute is used to allocate
   *                 its width.
   */
  @SuppressWarnings("unchecked")
  final public void setInnerRight(UIComponent innerRightFacet)
  {
    getFacets().put(INNER_RIGHT_FACET, innerRightFacet);
  }

  /**
   * The frame to be rendered as the innerLeft frame,
   *                 if the reading direction is left-to-right,
   *                 or innerRight frame otherwise.
   *                 This frame's width attribute is used to allocate
   *                 its width.
   */
  final public UIComponent getInnerStart()
  {
    return getFacet(INNER_START_FACET);
  }

  /**
   * The frame to be rendered as the innerLeft frame,
   *                 if the reading direction is left-to-right,
   *                 or innerRight frame otherwise.
   *                 This frame's width attribute is used to allocate
   *                 its width.
   */
  @SuppressWarnings("unchecked")
  final public void setInnerStart(UIComponent innerStartFacet)
  {
    getFacets().put(INNER_START_FACET, innerStartFacet);
  }

  /**
   * The frame to be rendered as the innerRight frame,
   *                 if the reading direction is left-to-right,
   *                 or innerLeft frame otherwise.
   *                 This frame's width attribute is used to allocate
   *                 its width.
   */
  final public UIComponent getInnerEnd()
  {
    return getFacet(INNER_END_FACET);
  }

  /**
   * The frame to be rendered as the innerRight frame,
   *                 if the reading direction is left-to-right,
   *                 or innerLeft frame otherwise.
   *                 This frame's width attribute is used to allocate
   *                 its width.
   */
  @SuppressWarnings("unchecked")
  final public void setInnerEnd(UIComponent innerEndFacet)
  {
    getFacets().put(INNER_END_FACET, innerEndFacet);
  }

  /**
   * These contents will be rendered inside HTML
   *               <code>NOFRAMES</code> tags. Browsers that do not
   *               support frames will render these contents.
   */
  final public UIComponent getAlternateContent()
  {
    return getFacet(ALTERNATE_CONTENT_FACET);
  }

  /**
   * These contents will be rendered inside HTML
   *               <code>NOFRAMES</code> tags. Browsers that do not
   *               support frames will render these contents.
   */
  @SuppressWarnings("unchecked")
  final public void setAlternateContent(UIComponent alternateContentFacet)
  {
    getFacets().put(ALTERNATE_CONTENT_FACET, alternateContentFacet);
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
   * Gets The proposed width of this frameBorderLayout.  This can be in
   *            pixels or percentage. This attribute is used only if this a nested
   *            frameBorderLayout in a left/right facet of a
   *            frameBorderLayout.
   *
   * @return  the new width value
   */
  final public String getWidth()
  {
    return ComponentUtils.resolveString(getProperty(WIDTH_KEY));
  }

  /**
   * Sets The proposed width of this frameBorderLayout.  This can be in
   *            pixels or percentage. This attribute is used only if this a nested
   *            frameBorderLayout in a left/right facet of a
   *            frameBorderLayout.
   * 
   * @param width  the new width value
   */
  final public void setWidth(String width)
  {
    setProperty(WIDTH_KEY, (width));
  }

  /**
   * Gets The proposed height of this frameBorderLayout.  This can be in
   *            pixels or percentage. This attribute is used only if this a nested
   *            frameBorderLayout in a top/bottom facet of a
   *            frameBorderLayout.
   *
   * @return  the new height value
   */
  final public String getHeight()
  {
    return ComponentUtils.resolveString(getProperty(HEIGHT_KEY));
  }

  /**
   * Sets The proposed height of this frameBorderLayout.  This can be in
   *            pixels or percentage. This attribute is used only if this a nested
   *            frameBorderLayout in a top/bottom facet of a
   *            frameBorderLayout.
   * 
   * @param height  the new height value
   */
  final public void setHeight(String height)
  {
    setProperty(HEIGHT_KEY, (height));
  }

  /**
   * Gets The size of frame spacing to be rendered.
   *
   * @return  the new frameSpacing value
   */
  final public int getFrameSpacing()
  {
    return ComponentUtils.resolveInteger(getProperty(FRAME_SPACING_KEY));
  }

  /**
   * Sets The size of frame spacing to be rendered.
   * 
   * @param frameSpacing  the new frameSpacing value
   */
  final public void setFrameSpacing(int frameSpacing)
  {
    setProperty(FRAME_SPACING_KEY, Integer.valueOf(frameSpacing));
  }

  /**
   * Gets The size for the border width to be rendered.
   *
   * @return  the new borderWidth value
   */
  final public int getBorderWidth()
  {
    return ComponentUtils.resolveInteger(getProperty(BORDER_WIDTH_KEY));
  }

  /**
   * Sets The size for the border width to be rendered.
   * 
   * @param borderWidth  the new borderWidth value
   */
  final public void setBorderWidth(int borderWidth)
  {
    setProperty(BORDER_WIDTH_KEY, Integer.valueOf(borderWidth));
  }

  /**
   * Gets The size for the frame border width to be rendered.
   *
   * @return  the new frameBorderWidth value
   */
  final public int getFrameBorderWidth()
  {
    return ComponentUtils.resolveInteger(getProperty(FRAME_BORDER_WIDTH_KEY));
  }

  /**
   * Sets The size for the frame border width to be rendered.
   * 
   * @param frameBorderWidth  the new frameBorderWidth value
   */
  final public void setFrameBorderWidth(int frameBorderWidth)
  {
    setProperty(FRAME_BORDER_WIDTH_KEY, Integer.valueOf(frameBorderWidth));
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
   * Construct an instance of the HtmlFrameBorderLayout.
   */
  protected HtmlFrameBorderLayout(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.FrameBorderLayout","org.apache.myfaces.trinidad.FrameBorderLayout");
  }
}
