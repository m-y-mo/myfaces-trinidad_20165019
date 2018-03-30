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
package org.apache.myfaces.trinidadinternal.taglib.core.data;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.data.CoreChart;
import org.apache.myfaces.trinidadinternal.taglib.UIXChartTag;

/**
 * Auto-generated tag class.
 */
public class CoreChartTag extends UIXChartTag
{

  /**
   * Construct an instance of the CoreChartTag.
   */
  public CoreChartTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreChart";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Chart";
  }

  private String _inlineStyle;
  final public void setInlineStyle(String inlineStyle)
  {
    _inlineStyle = inlineStyle;
  }

  private String _styleClass;
  final public void setStyleClass(String styleClass)
  {
    _styleClass = styleClass;
  }

  private String _shortDesc;
  final public void setShortDesc(String shortDesc)
  {
    _shortDesc = shortDesc;
  }

  private String _partialTriggers;
  final public void setPartialTriggers(String partialTriggers)
  {
    _partialTriggers = partialTriggers;
  }

  private String _type;
  final public void setType(String type)
  {
    _type = type;
  }

  private String _templateSource;
  final public void setTemplateSource(String templateSource)
  {
    _templateSource = templateSource;
  }

  private String _perspective;
  final public void setPerspective(String perspective)
  {
    _perspective = perspective;
  }

  private String _legendPosition;
  final public void setLegendPosition(String legendPosition)
  {
    _legendPosition = legendPosition;
  }

  private String _animationDuration;
  final public void setAnimationDuration(String animationDuration)
  {
    _animationDuration = animationDuration;
  }

  private String _YMajorGridLineCount;
  final public void setYMajorGridLineCount(String YMajorGridLineCount)
  {
    _YMajorGridLineCount = YMajorGridLineCount;
  }

  private String _YMinorGridLineCount;
  final public void setYMinorGridLineCount(String YMinorGridLineCount)
  {
    _YMinorGridLineCount = YMinorGridLineCount;
  }

  private String _XMajorGridLineCount;
  final public void setXMajorGridLineCount(String XMajorGridLineCount)
  {
    _XMajorGridLineCount = XMajorGridLineCount;
  }

  private String _maxPrecision;
  final public void setMaxPrecision(String maxPrecision)
  {
    _maxPrecision = maxPrecision;
  }

  private String _gradientsUsed;
  final public void setGradientsUsed(String gradientsUsed)
  {
    _gradientsUsed = gradientsUsed;
  }

  private String _tooltipsVisible;
  final public void setTooltipsVisible(String tooltipsVisible)
  {
    _tooltipsVisible = tooltipsVisible;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreChart.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreChart.TEMPLATE_SOURCE_KEY, _templateSource);
    setProperty(bean, CoreChart.LEGEND_POSITION_KEY, _legendPosition);
    setBooleanProperty(bean, CoreChart.PERSPECTIVE_KEY, _perspective);
    setIntegerProperty(bean, CoreChart.YMINOR_GRID_LINE_COUNT_KEY, _YMinorGridLineCount);
    setBooleanProperty(bean, CoreChart.TOOLTIPS_VISIBLE_KEY, _tooltipsVisible);
    setIntegerProperty(bean, CoreChart.ANIMATION_DURATION_KEY, _animationDuration);
    setProperty(bean, CoreChart.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreChart.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreChart.TYPE_KEY, _type);
    setIntegerProperty(bean, CoreChart.YMAJOR_GRID_LINE_COUNT_KEY, _YMajorGridLineCount);
    setBooleanProperty(bean, CoreChart.GRADIENTS_USED_KEY, _gradientsUsed);
    setStringArrayProperty(bean, CoreChart.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setIntegerProperty(bean, CoreChart.MAX_PRECISION_KEY, _maxPrecision);
    setIntegerProperty(bean, CoreChart.XMAJOR_GRID_LINE_COUNT_KEY, _XMajorGridLineCount);
  }

  @Override
  public void release()
  {
    super.release();
    _inlineStyle = null;
    _templateSource = null;
    _legendPosition = null;
    _perspective = null;
    _YMinorGridLineCount = null;
    _tooltipsVisible = null;
    _animationDuration = null;
    _styleClass = null;
    _shortDesc = null;
    _type = null;
    _YMajorGridLineCount = null;
    _gradientsUsed = null;
    _partialTriggers = null;
    _maxPrecision = null;
    _XMajorGridLineCount = null;
  }
}
