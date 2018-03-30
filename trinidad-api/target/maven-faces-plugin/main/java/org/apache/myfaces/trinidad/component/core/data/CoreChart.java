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
package org.apache.myfaces.trinidad.component.core.data;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXChart;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * <html:p>
 *           The Trinidad Chart is used to display data as a chart.
 *         </html:p>
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
public class CoreChart extends UIXChart
{
  static public final String TYPE_VERTICAL_BAR = "verticalBar";
  static public final String TYPE_HORIZONTAL_BAR = "horizontalBar";
  static public final String TYPE_STACKED_VERTICAL_BAR = "stackedVerticalBar";
  static public final String TYPE_STACKED_HORIZONTAL_BAR = "stackedHorizontalBar";
  static public final String TYPE_PIE = "pie";
  static public final String TYPE_AREA = "area";
  static public final String TYPE_STACKED_AREA = "stackedArea";
  static public final String TYPE_LINE = "line";
  static public final String TYPE_BAR_LINE = "barLine";
  static public final String TYPE_XYLINE = "XYLine";
  static public final String TYPE_SCATTER_PLOT = "scatterPlot";
  static public final String TYPE_RADAR = "radar";
  static public final String TYPE_RADAR_AREA = "radarArea";
  static public final String TYPE_FUNNEL = "funnel";
  static public final String TYPE_CIRCULAR_GAUGE = "circularGauge";
  static public final String TYPE_SEMI_CIRCULAR_GAUGE = "semiCircularGauge";
  static public final String LEGEND_POSITION_NONE = "none";
  static public final String LEGEND_POSITION_BOTTOM = "bottom";
  static public final String LEGEND_POSITION_END = "end";
  static public final String LEGEND_POSITION_TOP = "top";
  static public final String LEGEND_POSITION_START = "start";
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXChart.TYPE);
  static public final PropertyKey INLINE_STYLE_KEY =
    TYPE.registerKey("inlineStyle", String.class);
  static public final PropertyKey STYLE_CLASS_KEY =
    TYPE.registerKey("styleClass", String.class);
  static public final PropertyKey SHORT_DESC_KEY =
    TYPE.registerKey("shortDesc", String.class);
  static public final PropertyKey PARTIAL_TRIGGERS_KEY =
    TYPE.registerKey("partialTriggers", String[].class);
  static public final PropertyKey TYPE_KEY =
    TYPE.registerKey("type", String.class, "verticalBar");
  static public final PropertyKey TEMPLATE_SOURCE_KEY =
    TYPE.registerKey("templateSource", String.class);
  static public final PropertyKey PERSPECTIVE_KEY =
    TYPE.registerKey("perspective", Boolean.class, Boolean.TRUE);
  static public final PropertyKey LEGEND_POSITION_KEY =
    TYPE.registerKey("legendPosition", String.class, "bottom");
  static public final PropertyKey ANIMATION_DURATION_KEY =
    TYPE.registerKey("animationDuration", Integer.class, Integer.valueOf(1000));
  static public final PropertyKey YMAJOR_GRID_LINE_COUNT_KEY =
    TYPE.registerKey("YMajorGridLineCount", Integer.class, Integer.valueOf(3));
  static public final PropertyKey YMINOR_GRID_LINE_COUNT_KEY =
    TYPE.registerKey("YMinorGridLineCount", Integer.class, Integer.valueOf(-1));
  static public final PropertyKey XMAJOR_GRID_LINE_COUNT_KEY =
    TYPE.registerKey("XMajorGridLineCount", Integer.class, Integer.valueOf(-1));
  static public final PropertyKey MAX_PRECISION_KEY =
    TYPE.registerKey("maxPrecision", Integer.class, Integer.valueOf(0));
  static public final PropertyKey GRADIENTS_USED_KEY =
    TYPE.registerKey("gradientsUsed", Boolean.class, Boolean.TRUE);
  static public final PropertyKey TOOLTIPS_VISIBLE_KEY =
    TYPE.registerKey("tooltipsVisible", Boolean.class, Boolean.TRUE);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Chart";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CoreChart";

  /**
   * Construct an instance of the CoreChart.
   */
  public CoreChart()
  {
    super("org.apache.myfaces.trinidad.Chart");
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
   * Gets The type of chart. Possible Values are: verticalBar horizontalBar stackedVerticalBar stackedHorizontalBar pie area stackedArea line barLine XYLine scatterPlot radar radarArea funnel circularGauge semiCircularGauge.
   *
   * @return  the new type value
   */
  final public String getType()
  {
    return ComponentUtils.resolveString(getProperty(TYPE_KEY), "verticalBar");
  }

  /**
   * Sets The type of chart. Possible Values are: verticalBar horizontalBar stackedVerticalBar stackedHorizontalBar pie area stackedArea line barLine XYLine scatterPlot radar radarArea funnel circularGauge semiCircularGauge.
   * 
   * @param type  the new type value
   */
  final public void setType(String type)
  {
    setProperty(TYPE_KEY, (type));
  }

  /**
   * Gets Specifies URI for the template document from which the chart elements are cloned.
   *         If this attribute is null, the chart component uses a default template. The default template is chosen based
   *         on whether the useGradient attribute is true or false.
   *         The template document is useful for changing the Look and Feel of the chart.
   *         Some examples include:1)A developer may want to skin the chart to match its corporate Look and Feel.
   *         2)A developer may want to put water marks/background images inside the chart.
   *         3)A developer may want to change the template for the gauges used in the gauge charts.
   *         4)A developer may want to turn off gradients and instead use filters to set some interesting effects on the chart elements.
   *
   * @return  the new templateSource value
   */
  final public String getTemplateSource()
  {
    return ComponentUtils.resolveString(getProperty(TEMPLATE_SOURCE_KEY));
  }

  /**
   * Sets Specifies URI for the template document from which the chart elements are cloned.
   *         If this attribute is null, the chart component uses a default template. The default template is chosen based
   *         on whether the useGradient attribute is true or false.
   *         The template document is useful for changing the Look and Feel of the chart.
   *         Some examples include:1)A developer may want to skin the chart to match its corporate Look and Feel.
   *         2)A developer may want to put water marks/background images inside the chart.
   *         3)A developer may want to change the template for the gauges used in the gauge charts.
   *         4)A developer may want to turn off gradients and instead use filters to set some interesting effects on the chart elements.
   * 
   * @param templateSource  the new templateSource value
   */
  final public void setTemplateSource(String templateSource)
  {
    setProperty(TEMPLATE_SOURCE_KEY, (templateSource));
  }

  /**
   * Gets Specifies if the chart is drawn with a perspective (2.5D).
   *       By default the chart is draw with a perspective.
   *
   * @return  the new perspective value
   */
  final public boolean isPerspective()
  {
    return ComponentUtils.resolveBoolean(getProperty(PERSPECTIVE_KEY), true);
  }

  /**
   * Sets Specifies if the chart is drawn with a perspective (2.5D).
   *       By default the chart is draw with a perspective.
   * 
   * @param perspective  the new perspective value
   */
  final public void setPerspective(boolean perspective)
  {
    setProperty(PERSPECTIVE_KEY, perspective ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets Specified the location of the legend. The legend can be turned off by setting this attribute to none.
   *       Otherwise it can be drawn at top, start, end or bottom.
   *
   * @return  the new legendPosition value
   */
  final public String getLegendPosition()
  {
    return ComponentUtils.resolveString(getProperty(LEGEND_POSITION_KEY), "bottom");
  }

  /**
   * Sets Specified the location of the legend. The legend can be turned off by setting this attribute to none.
   *       Otherwise it can be drawn at top, start, end or bottom.
   * 
   * @param legendPosition  the new legendPosition value
   */
  final public void setLegendPosition(String legendPosition)
  {
    setProperty(LEGEND_POSITION_KEY, (legendPosition));
  }

  /**
   * Gets The duration of the animation for the chart components in milliseconds.
   *       Animation can be turned off if the animationDuration is set to 0. The default value is 1000ms.
   *
   * @return  the new animationDuration value
   */
  final public int getAnimationDuration()
  {
    return ComponentUtils.resolveInteger(getProperty(ANIMATION_DURATION_KEY), 1000);
  }

  /**
   * Sets The duration of the animation for the chart components in milliseconds.
   *       Animation can be turned off if the animationDuration is set to 0. The default value is 1000ms.
   * 
   * @param animationDuration  the new animationDuration value
   */
  final public void setAnimationDuration(int animationDuration)
  {
    setProperty(ANIMATION_DURATION_KEY, Integer.valueOf(animationDuration));
  }

  /**
   * Gets This attribute controls the number of horizontal major grid lines displayed in the chart.
   *       For horizontal charts(horizontalBar, stackedHorizontalBar) this attribute controls the horizontal major grid lines.
   *       The default is 3.
   *
   * @return  the new YMajorGridLineCount value
   */
  final public int getYMajorGridLineCount()
  {
    return ComponentUtils.resolveInteger(getProperty(YMAJOR_GRID_LINE_COUNT_KEY), 3);
  }

  /**
   * Sets This attribute controls the number of horizontal major grid lines displayed in the chart.
   *       For horizontal charts(horizontalBar, stackedHorizontalBar) this attribute controls the horizontal major grid lines.
   *       The default is 3.
   * 
   * @param YMajorGridLineCount  the new YMajorGridLineCount value
   */
  final public void setYMajorGridLineCount(int YMajorGridLineCount)
  {
    setProperty(YMAJOR_GRID_LINE_COUNT_KEY, Integer.valueOf(YMajorGridLineCount));
  }

  /**
   * Gets This attribute controls the number of minor grid lines displayed within a major grid section.
   *       The default value is -1, which means it varies per chart type. Currently it is used only for gauge charts
   *       with a default of 3.
   *
   * @return  the new YMinorGridLineCount value
   */
  final public int getYMinorGridLineCount()
  {
    return ComponentUtils.resolveInteger(getProperty(YMINOR_GRID_LINE_COUNT_KEY), -1);
  }

  /**
   * Sets This attribute controls the number of minor grid lines displayed within a major grid section.
   *       The default value is -1, which means it varies per chart type. Currently it is used only for gauge charts
   *       with a default of 3.
   * 
   * @param YMinorGridLineCount  the new YMinorGridLineCount value
   */
  final public void setYMinorGridLineCount(int YMinorGridLineCount)
  {
    setProperty(YMINOR_GRID_LINE_COUNT_KEY, Integer.valueOf(YMinorGridLineCount));
  }

  /**
   * Gets This attribute controls the number of vertical major grid lines displayed in the chart.
   *       The default value is -1, which implies that the vertical major grid lines are controlled by the groupLabels
   *       in the chart model. This parameter along with the groupLabels provide flexibility in labeling the
   *       groups. For e.g. one can display a vertical bar chart with 2 years data. Only quarters may be labeled and XMajorGridLineCount can
   *       be 1 for splitting the data into two sections.
   *
   * @return  the new XMajorGridLineCount value
   */
  final public int getXMajorGridLineCount()
  {
    return ComponentUtils.resolveInteger(getProperty(XMAJOR_GRID_LINE_COUNT_KEY), -1);
  }

  /**
   * Sets This attribute controls the number of vertical major grid lines displayed in the chart.
   *       The default value is -1, which implies that the vertical major grid lines are controlled by the groupLabels
   *       in the chart model. This parameter along with the groupLabels provide flexibility in labeling the
   *       groups. For e.g. one can display a vertical bar chart with 2 years data. Only quarters may be labeled and XMajorGridLineCount can
   *       be 1 for splitting the data into two sections.
   * 
   * @param XMajorGridLineCount  the new XMajorGridLineCount value
   */
  final public void setXMajorGridLineCount(int XMajorGridLineCount)
  {
    setProperty(XMAJOR_GRID_LINE_COUNT_KEY, Integer.valueOf(XMajorGridLineCount));
  }

  /**
   * Gets The maximum precision of the numbers displayed on the yAxis(xAxis for horizontal charts).
   *       The default is 0.
   *
   * @return  the new maxPrecision value
   */
  final public int getMaxPrecision()
  {
    return ComponentUtils.resolveInteger(getProperty(MAX_PRECISION_KEY), 0);
  }

  /**
   * Sets The maximum precision of the numbers displayed on the yAxis(xAxis for horizontal charts).
   *       The default is 0.
   * 
   * @param maxPrecision  the new maxPrecision value
   */
  final public void setMaxPrecision(int maxPrecision)
  {
    setProperty(MAX_PRECISION_KEY, Integer.valueOf(maxPrecision));
  }

  /**
   * Gets Specifies if gradients are used to display chart elements.
   *       By default the chart elements use gradients.
   *
   * @return  the new gradientsUsed value
   */
  final public boolean isGradientsUsed()
  {
    return ComponentUtils.resolveBoolean(getProperty(GRADIENTS_USED_KEY), true);
  }

  /**
   * Sets Specifies if gradients are used to display chart elements.
   *       By default the chart elements use gradients.
   * 
   * @param gradientsUsed  the new gradientsUsed value
   */
  final public void setGradientsUsed(boolean gradientsUsed)
  {
    setProperty(GRADIENTS_USED_KEY, gradientsUsed ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets Specifies if tooltips are displayed or not.
   *
   * @return  the new tooltipsVisible value
   */
  final public boolean isTooltipsVisible()
  {
    return ComponentUtils.resolveBoolean(getProperty(TOOLTIPS_VISIBLE_KEY), true);
  }

  /**
   * Sets Specifies if tooltips are displayed or not.
   * 
   * @param tooltipsVisible  the new tooltipsVisible value
   */
  final public void setTooltipsVisible(boolean tooltipsVisible)
  {
    setProperty(TOOLTIPS_VISIBLE_KEY, tooltipsVisible ? Boolean.TRUE : Boolean.FALSE);
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
   * Construct an instance of the CoreChart.
   */
  protected CoreChart(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Chart","org.apache.myfaces.trinidad.Chart");
  }
}
