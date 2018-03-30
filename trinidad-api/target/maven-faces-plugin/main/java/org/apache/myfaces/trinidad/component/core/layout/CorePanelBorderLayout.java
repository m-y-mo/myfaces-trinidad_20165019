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
package org.apache.myfaces.trinidad.component.core.layout;

import javax.faces.component.UIComponent;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXPanel;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * The panelBorderLayout component is a layout element which lays out all of its
 *           children consecutively in its middle, and supports twelve other
 *           facets: top, bottom, left, right, start and end. Clients should use only
 *           one of left/right or start/end for each side, in any one container, but if both are used,
 *           left/right &quot;wins&quot;.
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
public class CorePanelBorderLayout extends UIXPanel
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXPanel.TYPE);
  static public final PropertyKey LAYOUT_KEY =
    TYPE.registerKey("layout", String.class, "expand");
  static public final PropertyKey TOP_HEIGHT_KEY =
    TYPE.registerKey("topHeight", String.class, "25%");
  static public final PropertyKey BOTTOM_HEIGHT_KEY =
    TYPE.registerKey("bottomHeight", String.class, "25%");
  static public final PropertyKey INNER_TOP_HEIGHT_KEY =
    TYPE.registerKey("innerTopHeight", String.class, "25%");
  static public final PropertyKey INNER_BOTTOM_HEIGHT_KEY =
    TYPE.registerKey("innerBottomHeight", String.class, "25%");
  static public final PropertyKey START_WIDTH_KEY =
    TYPE.registerKey("startWidth", String.class, "25%");
  static public final PropertyKey END_WIDTH_KEY =
    TYPE.registerKey("endWidth", String.class, "25%");
  static public final PropertyKey LEFT_WIDTH_KEY =
    TYPE.registerKey("leftWidth", String.class, "25%");
  static public final PropertyKey RIGHT_WIDTH_KEY =
    TYPE.registerKey("rightWidth", String.class, "25%");
  static public final PropertyKey INNER_START_WIDTH_KEY =
    TYPE.registerKey("innerStartWidth", String.class, "25%");
  static public final PropertyKey INNER_END_WIDTH_KEY =
    TYPE.registerKey("innerEndWidth", String.class, "25%");
  static public final PropertyKey INNER_LEFT_WIDTH_KEY =
    TYPE.registerKey("innerLeftWidth", String.class, "25%");
  static public final PropertyKey INNER_RIGHT_WIDTH_KEY =
    TYPE.registerKey("innerRightWidth", String.class, "25%");
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
  static public final String TOP_FACET = "top";
  static public final String BOTTOM_FACET = "bottom";
  static public final String LEFT_FACET = "left";
  static public final String RIGHT_FACET = "right";
  static public final String START_FACET = "start";
  static public final String END_FACET = "end";
  static public final String INNER_TOP_FACET = "innerTop";
  static public final String INNER_BOTTOM_FACET = "innerBottom";
  static public final String INNER_LEFT_FACET = "innerLeft";
  static public final String INNER_RIGHT_FACET = "innerRight";
  static public final String INNER_START_FACET = "innerStart";
  static public final String INNER_END_FACET = "innerEnd";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Panel";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CorePanelBorderLayout";

  /**
   * Construct an instance of the CorePanelBorderLayout.
   */
  public CorePanelBorderLayout()
  {
    super("org.apache.myfaces.trinidad.BorderLayout");
  }

  /**
   * Content to be rendered above the children.
   */
  final public UIComponent getTop()
  {
    return getFacet(TOP_FACET);
  }

  /**
   * Content to be rendered above the children.
   */
  @SuppressWarnings("unchecked")
  final public void setTop(UIComponent topFacet)
  {
    getFacets().put(TOP_FACET, topFacet);
  }

  /**
   * Content to be rendered below the children.
   */
  final public UIComponent getBottom()
  {
    return getFacet(BOTTOM_FACET);
  }

  /**
   * Content to be rendered below the children.
   */
  @SuppressWarnings("unchecked")
  final public void setBottom(UIComponent bottomFacet)
  {
    getFacets().put(BOTTOM_FACET, bottomFacet);
  }

  /**
   * Content to be rendered to the left of the children and
   *                 between any top and bottom facets.
   */
  final public UIComponent getLeft()
  {
    return getFacet(LEFT_FACET);
  }

  /**
   * Content to be rendered to the left of the children and
   *                 between any top and bottom facets.
   */
  @SuppressWarnings("unchecked")
  final public void setLeft(UIComponent leftFacet)
  {
    getFacets().put(LEFT_FACET, leftFacet);
  }

  /**
   * Content to be rendered to the right of the children and
   *                 between any top and bottom facets.
   */
  final public UIComponent getRight()
  {
    return getFacet(RIGHT_FACET);
  }

  /**
   * Content to be rendered to the right of the children and
   *                 between any top and bottom facets.
   */
  @SuppressWarnings("unchecked")
  final public void setRight(UIComponent rightFacet)
  {
    getFacets().put(RIGHT_FACET, rightFacet);
  }

  /**
   * Content to be rendered to the left of the children and
   *                 between any top and bottom facets, if the reading direction is
   *                 left-to-right, on the right otherwise.
   */
  final public UIComponent getStart()
  {
    return getFacet(START_FACET);
  }

  /**
   * Content to be rendered to the left of the children and
   *                 between any top and bottom facets, if the reading direction is
   *                 left-to-right, on the right otherwise.
   */
  @SuppressWarnings("unchecked")
  final public void setStart(UIComponent startFacet)
  {
    getFacets().put(START_FACET, startFacet);
  }

  /**
   * Content to be rendered to the right of the children and
   *                 between any top and bottom facets, if the reading direction is
   *                 left-to-right, on the left otherwise.
   */
  final public UIComponent getEnd()
  {
    return getFacet(END_FACET);
  }

  /**
   * Content to be rendered to the right of the children and
   *                 between any top and bottom facets, if the reading direction is
   *                 left-to-right, on the left otherwise.
   */
  @SuppressWarnings("unchecked")
  final public void setEnd(UIComponent endFacet)
  {
    getFacets().put(END_FACET, endFacet);
  }

  /**
   * Content to be rendered above the children, inside of 'top'.
   */
  final public UIComponent getInnerTop()
  {
    return getFacet(INNER_TOP_FACET);
  }

  /**
   * Content to be rendered above the children, inside of 'top'.
   */
  @SuppressWarnings("unchecked")
  final public void setInnerTop(UIComponent innerTopFacet)
  {
    getFacets().put(INNER_TOP_FACET, innerTopFacet);
  }

  /**
   * Content to be rendered below the children, but above 'bottom'.
   */
  final public UIComponent getInnerBottom()
  {
    return getFacet(INNER_BOTTOM_FACET);
  }

  /**
   * Content to be rendered below the children, but above 'bottom'.
   */
  @SuppressWarnings("unchecked")
  final public void setInnerBottom(UIComponent innerBottomFacet)
  {
    getFacets().put(INNER_BOTTOM_FACET, innerBottomFacet);
  }

  /**
   * Content to be rendered to the left of the children and
   *                 between any innerTop and innerBottom facets, to the right of the left facet.
   */
  final public UIComponent getInnerLeft()
  {
    return getFacet(INNER_LEFT_FACET);
  }

  /**
   * Content to be rendered to the left of the children and
   *                 between any innerTop and innerBottom facets, to the right of the left facet.
   */
  @SuppressWarnings("unchecked")
  final public void setInnerLeft(UIComponent innerLeftFacet)
  {
    getFacets().put(INNER_LEFT_FACET, innerLeftFacet);
  }

  /**
   * Content to be rendered to the right of the children and
   *                 between any innerTop and innerBottom facets.
   */
  final public UIComponent getInnerRight()
  {
    return getFacet(INNER_RIGHT_FACET);
  }

  /**
   * Content to be rendered to the right of the children and
   *                 between any innerTop and innerBottom facets.
   */
  @SuppressWarnings("unchecked")
  final public void setInnerRight(UIComponent innerRightFacet)
  {
    getFacets().put(INNER_RIGHT_FACET, innerRightFacet);
  }

  /**
   * the equivalent of innerLeft on left-to-right clients and innerRight on right-to-left clients.
   */
  final public UIComponent getInnerStart()
  {
    return getFacet(INNER_START_FACET);
  }

  /**
   * the equivalent of innerLeft on left-to-right clients and innerRight on right-to-left clients.
   */
  @SuppressWarnings("unchecked")
  final public void setInnerStart(UIComponent innerStartFacet)
  {
    getFacets().put(INNER_START_FACET, innerStartFacet);
  }

  /**
   * the equivalent of innerRight on left-to-right clients and innerLeft on right-to-left clients.
   */
  final public UIComponent getInnerEnd()
  {
    return getFacet(INNER_END_FACET);
  }

  /**
   * the equivalent of innerRight on left-to-right clients and innerLeft on right-to-left clients.
   */
  @SuppressWarnings("unchecked")
  final public void setInnerEnd(UIComponent innerEndFacet)
  {
    getFacets().put(INNER_END_FACET, innerEndFacet);
  }

  /**
   * Gets Changes how the panel is rendered. The default is to expand the panel to fix the size of its contents.
   *         Setting the value to positioned will force the panel to use the size given to it via CSS (either via the
   *         styleClass, inlineStyle or via the skin). The facets are sized using the height and width attributes and
   *         the center is given the remainder. With a positioned layout the height and width should be set and the
   *         position should be set to relative or absolute. Note that due to limitations in IE6, the positioned layout
   *         uses JavaScript resizing that will affect performance. Expand is the default.
   *
   * @return  the new layout value
   */
  final public String getLayout()
  {
    return ComponentUtils.resolveString(getProperty(LAYOUT_KEY), "expand");
  }

  /**
   * Sets Changes how the panel is rendered. The default is to expand the panel to fix the size of its contents.
   *         Setting the value to positioned will force the panel to use the size given to it via CSS (either via the
   *         styleClass, inlineStyle or via the skin). The facets are sized using the height and width attributes and
   *         the center is given the remainder. With a positioned layout the height and width should be set and the
   *         position should be set to relative or absolute. Note that due to limitations in IE6, the positioned layout
   *         uses JavaScript resizing that will affect performance. Expand is the default.
   * 
   * @param layout  the new layout value
   */
  final public void setLayout(String layout)
  {
    setProperty(LAYOUT_KEY, (layout));
  }

  /**
   * Gets Specifies the CSS height to give to the top facet in valid CSS units.
   *         Used if the layout is positioned and the top facet is present and rendered. Defaults to 25%.
   *
   * @return  the new topHeight value
   */
  final public String getTopHeight()
  {
    return ComponentUtils.resolveString(getProperty(TOP_HEIGHT_KEY), "25%");
  }

  /**
   * Sets Specifies the CSS height to give to the top facet in valid CSS units.
   *         Used if the layout is positioned and the top facet is present and rendered. Defaults to 25%.
   * 
   * @param topHeight  the new topHeight value
   */
  final public void setTopHeight(String topHeight)
  {
    setProperty(TOP_HEIGHT_KEY, (topHeight));
  }

  /**
   * Gets Specifies the CSS height to give to the bottom facet in valid CSS units.
   *         Used if the layout is positioned and the bottom facet is present and rendered. Defaults to 25%.
   *
   * @return  the new bottomHeight value
   */
  final public String getBottomHeight()
  {
    return ComponentUtils.resolveString(getProperty(BOTTOM_HEIGHT_KEY), "25%");
  }

  /**
   * Sets Specifies the CSS height to give to the bottom facet in valid CSS units.
   *         Used if the layout is positioned and the bottom facet is present and rendered. Defaults to 25%.
   * 
   * @param bottomHeight  the new bottomHeight value
   */
  final public void setBottomHeight(String bottomHeight)
  {
    setProperty(BOTTOM_HEIGHT_KEY, (bottomHeight));
  }

  /**
   * Gets Specifies the CSS height to give to the inner top facet in valid CSS units.
   *         Used if the layout is positioned and the inner top facet is present and rendered. Defaults to 25%.
   *
   * @return  the new innerTopHeight value
   */
  final public String getInnerTopHeight()
  {
    return ComponentUtils.resolveString(getProperty(INNER_TOP_HEIGHT_KEY), "25%");
  }

  /**
   * Sets Specifies the CSS height to give to the inner top facet in valid CSS units.
   *         Used if the layout is positioned and the inner top facet is present and rendered. Defaults to 25%.
   * 
   * @param innerTopHeight  the new innerTopHeight value
   */
  final public void setInnerTopHeight(String innerTopHeight)
  {
    setProperty(INNER_TOP_HEIGHT_KEY, (innerTopHeight));
  }

  /**
   * Gets Specifies the CSS height to give to the inner bottom facet in valid CSS units.
   *         Used if the layout is positioned and the inner bottom facet is present and rendered. Defaults to 25%.
   *
   * @return  the new innerBottomHeight value
   */
  final public String getInnerBottomHeight()
  {
    return ComponentUtils.resolveString(getProperty(INNER_BOTTOM_HEIGHT_KEY), "25%");
  }

  /**
   * Sets Specifies the CSS height to give to the inner bottom facet in valid CSS units.
   *         Used if the layout is positioned and the inner bottom facet is present and rendered. Defaults to 25%.
   * 
   * @param innerBottomHeight  the new innerBottomHeight value
   */
  final public void setInnerBottomHeight(String innerBottomHeight)
  {
    setProperty(INNER_BOTTOM_HEIGHT_KEY, (innerBottomHeight));
  }

  /**
   * Gets Specifies the CSS width to give to the start facet in valid CSS units.
   *         Used if the layout is positioned and the start facet is present and rendered and the left or right facet
   *         is not used instead. Defaults to 25%.
   *
   * @return  the new startWidth value
   */
  final public String getStartWidth()
  {
    return ComponentUtils.resolveString(getProperty(START_WIDTH_KEY), "25%");
  }

  /**
   * Sets Specifies the CSS width to give to the start facet in valid CSS units.
   *         Used if the layout is positioned and the start facet is present and rendered and the left or right facet
   *         is not used instead. Defaults to 25%.
   * 
   * @param startWidth  the new startWidth value
   */
  final public void setStartWidth(String startWidth)
  {
    setProperty(START_WIDTH_KEY, (startWidth));
  }

  /**
   * Gets Specifies the CSS width to give to the end facet in valid CSS units.
   *         Used if the layout is positioned and the end facet is present and rendered and the left or right facet
   *         is not used instead. Defaults to 25%.
   *
   * @return  the new endWidth value
   */
  final public String getEndWidth()
  {
    return ComponentUtils.resolveString(getProperty(END_WIDTH_KEY), "25%");
  }

  /**
   * Sets Specifies the CSS width to give to the end facet in valid CSS units.
   *         Used if the layout is positioned and the end facet is present and rendered and the left or right facet
   *         is not used instead. Defaults to 25%.
   * 
   * @param endWidth  the new endWidth value
   */
  final public void setEndWidth(String endWidth)
  {
    setProperty(END_WIDTH_KEY, (endWidth));
  }

  /**
   * Gets Specifies the CSS width to give to the left facet in valid CSS units.
   *         Used if the layout is positioned and the left facet is present and rendered. Defaults to 25%.
   *
   * @return  the new leftWidth value
   */
  final public String getLeftWidth()
  {
    return ComponentUtils.resolveString(getProperty(LEFT_WIDTH_KEY), "25%");
  }

  /**
   * Sets Specifies the CSS width to give to the left facet in valid CSS units.
   *         Used if the layout is positioned and the left facet is present and rendered. Defaults to 25%.
   * 
   * @param leftWidth  the new leftWidth value
   */
  final public void setLeftWidth(String leftWidth)
  {
    setProperty(LEFT_WIDTH_KEY, (leftWidth));
  }

  /**
   * Gets Specifies the CSS width to give to the right facet in valid CSS units.
   *         Used if the layout is positioned and the right facet is present and rendered. Defaults to 25%.
   *
   * @return  the new rightWidth value
   */
  final public String getRightWidth()
  {
    return ComponentUtils.resolveString(getProperty(RIGHT_WIDTH_KEY), "25%");
  }

  /**
   * Sets Specifies the CSS width to give to the right facet in valid CSS units.
   *         Used if the layout is positioned and the right facet is present and rendered. Defaults to 25%.
   * 
   * @param rightWidth  the new rightWidth value
   */
  final public void setRightWidth(String rightWidth)
  {
    setProperty(RIGHT_WIDTH_KEY, (rightWidth));
  }

  /**
   * Gets Specifies the CSS width to give to the inner start facet in valid CSS units.
   *         Used if the layout is positioned and the inner start facet is present and rendered and the inner left or right facet
   *         is not used instead. Defaults to 25%.
   *
   * @return  the new innerStartWidth value
   */
  final public String getInnerStartWidth()
  {
    return ComponentUtils.resolveString(getProperty(INNER_START_WIDTH_KEY), "25%");
  }

  /**
   * Sets Specifies the CSS width to give to the inner start facet in valid CSS units.
   *         Used if the layout is positioned and the inner start facet is present and rendered and the inner left or right facet
   *         is not used instead. Defaults to 25%.
   * 
   * @param innerStartWidth  the new innerStartWidth value
   */
  final public void setInnerStartWidth(String innerStartWidth)
  {
    setProperty(INNER_START_WIDTH_KEY, (innerStartWidth));
  }

  /**
   * Gets Specifies the CSS width to give to the inner end facet in valid CSS units.
   *         Used if the layout is positioned and the inner end facet is present and rendered and the inner left or right facet
   *         is not used instead. Defaults to 25%.
   *
   * @return  the new innerEndWidth value
   */
  final public String getInnerEndWidth()
  {
    return ComponentUtils.resolveString(getProperty(INNER_END_WIDTH_KEY), "25%");
  }

  /**
   * Sets Specifies the CSS width to give to the inner end facet in valid CSS units.
   *         Used if the layout is positioned and the inner end facet is present and rendered and the inner left or right facet
   *         is not used instead. Defaults to 25%.
   * 
   * @param innerEndWidth  the new innerEndWidth value
   */
  final public void setInnerEndWidth(String innerEndWidth)
  {
    setProperty(INNER_END_WIDTH_KEY, (innerEndWidth));
  }

  /**
   * Gets Specifies the CSS width to give to the inner left facet in valid CSS units.
   *         Used if the layout is positioned and the inner left facet is present and rendered. Defaults to 25%.
   *
   * @return  the new innerLeftWidth value
   */
  final public String getInnerLeftWidth()
  {
    return ComponentUtils.resolveString(getProperty(INNER_LEFT_WIDTH_KEY), "25%");
  }

  /**
   * Sets Specifies the CSS width to give to the inner left facet in valid CSS units.
   *         Used if the layout is positioned and the inner left facet is present and rendered. Defaults to 25%.
   * 
   * @param innerLeftWidth  the new innerLeftWidth value
   */
  final public void setInnerLeftWidth(String innerLeftWidth)
  {
    setProperty(INNER_LEFT_WIDTH_KEY, (innerLeftWidth));
  }

  /**
   * Gets Specifies the CSS width to give to the inner right facet in valid CSS units.
   *         Used if the layout is positioned and the inner right facet is present and rendered. Defaults to 25%.
   *
   * @return  the new innerRightWidth value
   */
  final public String getInnerRightWidth()
  {
    return ComponentUtils.resolveString(getProperty(INNER_RIGHT_WIDTH_KEY), "25%");
  }

  /**
   * Sets Specifies the CSS width to give to the inner right facet in valid CSS units.
   *         Used if the layout is positioned and the inner right facet is present and rendered. Defaults to 25%.
   * 
   * @param innerRightWidth  the new innerRightWidth value
   */
  final public void setInnerRightWidth(String innerRightWidth)
  {
    setProperty(INNER_RIGHT_WIDTH_KEY, (innerRightWidth));
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
   * Construct an instance of the CorePanelBorderLayout.
   */
  protected CorePanelBorderLayout(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Panel","org.apache.myfaces.trinidad.BorderLayout");
  }
}
