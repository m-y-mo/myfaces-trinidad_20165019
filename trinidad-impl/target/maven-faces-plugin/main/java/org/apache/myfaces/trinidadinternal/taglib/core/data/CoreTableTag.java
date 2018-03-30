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
import org.apache.myfaces.trinidad.component.core.data.CoreTable;
import org.apache.myfaces.trinidadinternal.taglib.UIXTableTag;

/**
 * Auto-generated tag class.
 */
public class CoreTableTag extends UIXTableTag
{

  /**
   * Construct an instance of the CoreTableTag.
   */
  public CoreTableTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreTable";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Table";
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

  private String _allDetailsEnabled;
  final public void setAllDetailsEnabled(String allDetailsEnabled)
  {
    _allDetailsEnabled = allDetailsEnabled;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreTable.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreTable.WIDTH_KEY, _width);
    setProperty(bean, CoreTable.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreTable.EMPTY_TEXT_KEY, _emptyText);
    setStringArrayProperty(bean, CoreTable.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setBooleanProperty(bean, CoreTable.ALL_DETAILS_ENABLED_KEY, _allDetailsEnabled);
    setIntegerProperty(bean, CoreTable.ROW_BANDING_INTERVAL_KEY, _rowBandingInterval);
    setProperty(bean, CoreTable.ONKEYPRESS_KEY, _onkeypress);
    setBooleanProperty(bean, CoreTable.VERTICAL_GRID_VISIBLE_KEY, _verticalGridVisible);
    setIntegerProperty(bean, CoreTable.COLUMN_BANDING_INTERVAL_KEY, _columnBandingInterval);
    setProperty(bean, CoreTable.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreTable.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreTable.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreTable.ONDBLCLICK_KEY, _ondblclick);
    setBooleanProperty(bean, CoreTable.AUTO_SUBMIT_KEY, _autoSubmit);
    setProperty(bean, CoreTable.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreTable.ONMOUSEDOWN_KEY, _onmousedown);
    setBooleanProperty(bean, CoreTable.HORIZONTAL_GRID_VISIBLE_KEY, _horizontalGridVisible);
    setProperty(bean, CoreTable.ROW_SELECTION_KEY, _rowSelection);
    setProperty(bean, CoreTable.SUMMARY_KEY, _summary);
    setProperty(bean, CoreTable.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreTable.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreTable.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreTable.ONKEYUP_KEY, _onkeyup);
  }

  @Override
  public void release()
  {
    super.release();
    _onkeydown = null;
    _width = null;
    _styleClass = null;
    _emptyText = null;
    _partialTriggers = null;
    _allDetailsEnabled = null;
    _rowBandingInterval = null;
    _onkeypress = null;
    _verticalGridVisible = null;
    _columnBandingInterval = null;
    _onmousemove = null;
    _inlineStyle = null;
    _onmouseover = null;
    _ondblclick = null;
    _autoSubmit = null;
    _shortDesc = null;
    _onmousedown = null;
    _horizontalGridVisible = null;
    _rowSelection = null;
    _summary = null;
    _onmouseup = null;
    _onmouseout = null;
    _onclick = null;
    _onkeyup = null;
  }
}
