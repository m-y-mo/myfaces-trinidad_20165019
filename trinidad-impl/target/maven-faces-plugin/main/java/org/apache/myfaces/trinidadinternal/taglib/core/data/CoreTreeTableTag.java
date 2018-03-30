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
import org.apache.myfaces.trinidad.component.core.data.CoreTreeTable;
import org.apache.myfaces.trinidadinternal.taglib.UIXTreeTableTag;

/**
 * Auto-generated tag class.
 */
public class CoreTreeTableTag extends UIXTreeTableTag
{

  /**
   * Construct an instance of the CoreTreeTableTag.
   */
  public CoreTreeTableTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreTreeTable";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.TreeTable";
  }

  private String _horizontalGridVisible;
  final public void setHorizontalGridVisible(String horizontalGridVisible)
  {
    _horizontalGridVisible = horizontalGridVisible;
  }

  private String _verticalGridVisible;
  final public void setVerticalGridVisible(String verticalGridVisible)
  {
    _verticalGridVisible = verticalGridVisible;
  }

  private String _emptyText;
  final public void setEmptyText(String emptyText)
  {
    _emptyText = emptyText;
  }

  private String _columnBandingInterval;
  final public void setColumnBandingInterval(String columnBandingInterval)
  {
    _columnBandingInterval = columnBandingInterval;
  }

  private String _rowBandingInterval;
  final public void setRowBandingInterval(String rowBandingInterval)
  {
    _rowBandingInterval = rowBandingInterval;
  }

  private String _rowSelection;
  final public void setRowSelection(String rowSelection)
  {
    _rowSelection = rowSelection;
  }

  private String _autoSubmit;
  final public void setAutoSubmit(String autoSubmit)
  {
    _autoSubmit = autoSubmit;
  }

  private String _width;
  final public void setWidth(String width)
  {
    _width = width;
  }

  private String _summary;
  final public void setSummary(String summary)
  {
    _summary = summary;
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

  private String _onclick;
  final public void setOnclick(String onclick)
  {
    _onclick = onclick;
  }

  private String _ondblclick;
  final public void setOndblclick(String ondblclick)
  {
    _ondblclick = ondblclick;
  }

  private String _onmousedown;
  final public void setOnmousedown(String onmousedown)
  {
    _onmousedown = onmousedown;
  }

  private String _onmouseup;
  final public void setOnmouseup(String onmouseup)
  {
    _onmouseup = onmouseup;
  }

  private String _onmouseover;
  final public void setOnmouseover(String onmouseover)
  {
    _onmouseover = onmouseover;
  }

  private String _onmousemove;
  final public void setOnmousemove(String onmousemove)
  {
    _onmousemove = onmousemove;
  }

  private String _onmouseout;
  final public void setOnmouseout(String onmouseout)
  {
    _onmouseout = onmouseout;
  }

  private String _onkeypress;
  final public void setOnkeypress(String onkeypress)
  {
    _onkeypress = onkeypress;
  }

  private String _onkeydown;
  final public void setOnkeydown(String onkeydown)
  {
    _onkeydown = onkeydown;
  }

  private String _onkeyup;
  final public void setOnkeyup(String onkeyup)
  {
    _onkeyup = onkeyup;
  }

  private String _expandAllEnabled;
  final public void setExpandAllEnabled(String expandAllEnabled)
  {
    _expandAllEnabled = expandAllEnabled;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreTreeTable.ONMOUSEDOWN_KEY, _onmousedown);
    setIntegerProperty(bean, CoreTreeTable.COLUMN_BANDING_INTERVAL_KEY, _columnBandingInterval);
    setStringArrayProperty(bean, CoreTreeTable.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreTreeTable.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreTreeTable.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreTreeTable.EMPTY_TEXT_KEY, _emptyText);
    setProperty(bean, CoreTreeTable.ONDBLCLICK_KEY, _ondblclick);
    setIntegerProperty(bean, CoreTreeTable.ROW_BANDING_INTERVAL_KEY, _rowBandingInterval);
    setProperty(bean, CoreTreeTable.ROW_SELECTION_KEY, _rowSelection);
    setProperty(bean, CoreTreeTable.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreTreeTable.ONKEYUP_KEY, _onkeyup);
    setBooleanProperty(bean, CoreTreeTable.EXPAND_ALL_ENABLED_KEY, _expandAllEnabled);
    setProperty(bean, CoreTreeTable.SUMMARY_KEY, _summary);
    setProperty(bean, CoreTreeTable.ONMOUSEOUT_KEY, _onmouseout);
    setBooleanProperty(bean, CoreTreeTable.VERTICAL_GRID_VISIBLE_KEY, _verticalGridVisible);
    setProperty(bean, CoreTreeTable.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreTreeTable.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreTreeTable.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreTreeTable.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreTreeTable.WIDTH_KEY, _width);
    setBooleanProperty(bean, CoreTreeTable.AUTO_SUBMIT_KEY, _autoSubmit);
    setProperty(bean, CoreTreeTable.ONMOUSEOVER_KEY, _onmouseover);
    setBooleanProperty(bean, CoreTreeTable.HORIZONTAL_GRID_VISIBLE_KEY, _horizontalGridVisible);
    setProperty(bean, CoreTreeTable.INLINE_STYLE_KEY, _inlineStyle);
  }

  @Override
  public void release()
  {
    super.release();
    _onmousedown = null;
    _columnBandingInterval = null;
    _partialTriggers = null;
    _shortDesc = null;
    _onkeydown = null;
    _emptyText = null;
    _ondblclick = null;
    _rowBandingInterval = null;
    _rowSelection = null;
    _onmousemove = null;
    _onkeyup = null;
    _expandAllEnabled = null;
    _summary = null;
    _onmouseout = null;
    _verticalGridVisible = null;
    _onclick = null;
    _onmouseup = null;
    _onkeypress = null;
    _styleClass = null;
    _width = null;
    _autoSubmit = null;
    _onmouseover = null;
    _horizontalGridVisible = null;
    _inlineStyle = null;
  }
}
