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
import org.apache.myfaces.trinidad.component.core.data.CoreColumn;
import org.apache.myfaces.trinidadinternal.taglib.UIXColumnTag;

/**
 * Auto-generated tag class.
 */
public class CoreColumnTag extends UIXColumnTag
{

  /**
   * Construct an instance of the CoreColumnTag.
   */
  public CoreColumnTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreColumn";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Column";
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

  private String _align;
  final public void setAlign(String align)
  {
    _align = align;
  }

  private String _defaultSortOrder;
  final public void setDefaultSortOrder(String defaultSortOrder)
  {
    _defaultSortOrder = defaultSortOrder;
  }

  private String _width;
  final public void setWidth(String width)
  {
    _width = width;
  }

  private String _headerText;
  final public void setHeaderText(String headerText)
  {
    _headerText = headerText;
  }

  private String _noWrap;
  final public void setNoWrap(String noWrap)
  {
    _noWrap = noWrap;
  }

  private String _headerNoWrap;
  final public void setHeaderNoWrap(String headerNoWrap)
  {
    _headerNoWrap = headerNoWrap;
  }

  private String _sortable;
  final public void setSortable(String sortable)
  {
    _sortable = sortable;
  }

  private String _separateRows;
  final public void setSeparateRows(String separateRows)
  {
    _separateRows = separateRows;
  }

  private String _rowHeader;
  final public void setRowHeader(String rowHeader)
  {
    _rowHeader = rowHeader;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreColumn.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreColumn.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreColumn.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreColumn.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreColumn.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreColumn.ALIGN_KEY, _align);
    setProperty(bean, CoreColumn.ONMOUSEOVER_KEY, _onmouseover);
    setBooleanProperty(bean, CoreColumn.SORTABLE_KEY, _sortable);
    setProperty(bean, CoreColumn.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreColumn.ONKEYUP_KEY, _onkeyup);
    setBooleanProperty(bean, CoreColumn.NO_WRAP_KEY, _noWrap);
    setProperty(bean, CoreColumn.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreColumn.WIDTH_KEY, _width);
    setProperty(bean, CoreColumn.SHORT_DESC_KEY, _shortDesc);
    setStringArrayProperty(bean, CoreColumn.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setBooleanProperty(bean, CoreColumn.ROW_HEADER_KEY, _rowHeader);
    setProperty(bean, CoreColumn.HEADER_TEXT_KEY, _headerText);
    setProperty(bean, CoreColumn.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreColumn.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreColumn.DEFAULT_SORT_ORDER_KEY, _defaultSortOrder);
    setBooleanProperty(bean, CoreColumn.HEADER_NO_WRAP_KEY, _headerNoWrap);
    setProperty(bean, CoreColumn.STYLE_CLASS_KEY, _styleClass);
    setBooleanProperty(bean, CoreColumn.SEPARATE_ROWS_KEY, _separateRows);
  }

  @Override
  public void release()
  {
    super.release();
    _inlineStyle = null;
    _onmousedown = null;
    _onclick = null;
    _ondblclick = null;
    _onmouseup = null;
    _align = null;
    _onmouseover = null;
    _sortable = null;
    _onmouseout = null;
    _onkeyup = null;
    _noWrap = null;
    _onkeypress = null;
    _width = null;
    _shortDesc = null;
    _partialTriggers = null;
    _rowHeader = null;
    _headerText = null;
    _onkeydown = null;
    _onmousemove = null;
    _defaultSortOrder = null;
    _headerNoWrap = null;
    _styleClass = null;
    _separateRows = null;
  }
}
