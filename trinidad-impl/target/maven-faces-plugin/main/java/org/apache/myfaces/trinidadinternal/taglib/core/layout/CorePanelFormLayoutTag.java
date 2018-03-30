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
package org.apache.myfaces.trinidadinternal.taglib.core.layout;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.layout.CorePanelFormLayout;
import org.apache.myfaces.trinidadinternal.taglib.UIXPanelTag;

/**
 * Auto-generated tag class.
 */
public class CorePanelFormLayoutTag extends UIXPanelTag
{

  /**
   * Construct an instance of the CorePanelFormLayoutTag.
   */
  public CorePanelFormLayoutTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelFormLayout";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.FormLayout";
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

  private String _fieldWidth;
  final public void setFieldWidth(String fieldWidth)
  {
    _fieldWidth = fieldWidth;
  }

  private String _labelWidth;
  final public void setLabelWidth(String labelWidth)
  {
    _labelWidth = labelWidth;
  }

  private String _maxColumns;
  final public void setMaxColumns(String maxColumns)
  {
    _maxColumns = maxColumns;
  }

  private String _rows;
  final public void setRows(String rows)
  {
    _rows = rows;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CorePanelFormLayout.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelFormLayout.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CorePanelFormLayout.LABEL_WIDTH_KEY, _labelWidth);
    setProperty(bean, CorePanelFormLayout.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelFormLayout.FIELD_WIDTH_KEY, _fieldWidth);
    setProperty(bean, CorePanelFormLayout.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CorePanelFormLayout.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelFormLayout.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CorePanelFormLayout.ONKEYPRESS_KEY, _onkeypress);
    setStringArrayProperty(bean, CorePanelFormLayout.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelFormLayout.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CorePanelFormLayout.STYLE_CLASS_KEY, _styleClass);
    setIntegerProperty(bean, CorePanelFormLayout.MAX_COLUMNS_KEY, _maxColumns);
    setIntegerProperty(bean, CorePanelFormLayout.ROWS_KEY, _rows);
    setProperty(bean, CorePanelFormLayout.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CorePanelFormLayout.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelFormLayout.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CorePanelFormLayout.ONKEYUP_KEY, _onkeyup);
  }

  @Override
  public void release()
  {
    super.release();
    _onclick = null;
    _onmouseup = null;
    _labelWidth = null;
    _onmousedown = null;
    _fieldWidth = null;
    _onmousemove = null;
    _shortDesc = null;
    _onmouseout = null;
    _onkeypress = null;
    _partialTriggers = null;
    _ondblclick = null;
    _styleClass = null;
    _maxColumns = null;
    _rows = null;
    _inlineStyle = null;
    _onmouseover = null;
    _onkeydown = null;
    _onkeyup = null;
  }
}
