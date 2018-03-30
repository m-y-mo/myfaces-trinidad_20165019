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
package org.apache.myfaces.trinidadinternal.taglib.core.input;

import javax.faces.el.ValueBinding;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.input.CoreInputListOfValues;
import org.apache.myfaces.trinidadinternal.taglib.UIXSelectInputTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreInputListOfValuesTag extends UIXSelectInputTag
{

  /**
   * Construct an instance of the CoreInputListOfValuesTag.
   */
  public CoreInputListOfValuesTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreInputListOfValues";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Text";
  }

  private String _contentStyle;
  final public void setContentStyle(String contentStyle)
  {
    _contentStyle = contentStyle;
  }

  private String _searchDesc;
  final public void setSearchDesc(String searchDesc)
  {
    _searchDesc = searchDesc;
  }

  private String _icon;
  final public void setIcon(String icon)
  {
    _icon = icon;
  }

  private String _readOnly;
  final public void setReadOnly(String readOnly)
  {
    _readOnly = readOnly;
  }

  private String _disabled;
  final public void setDisabled(String disabled)
  {
    _disabled = disabled;
  }

  private String _autoComplete;
  final public void setAutoComplete(String autoComplete)
  {
    _autoComplete = autoComplete;
  }

  private String _label;
  final public void setLabel(String label)
  {
    _label = label;
  }

  private String _simple;
  final public void setSimple(String simple)
  {
    _simple = simple;
  }

  private String _onchange;
  final public void setOnchange(String onchange)
  {
    _onchange = onchange;
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

  private String _onblur;
  final public void setOnblur(String onblur)
  {
    _onblur = onblur;
  }

  private String _onfocus;
  final public void setOnfocus(String onfocus)
  {
    _onfocus = onfocus;
  }

  private String _showRequired;
  final public void setShowRequired(String showRequired)
  {
    _showRequired = showRequired;
  }

  private String _accessKey;
  final public void setAccessKey(String accessKey)
  {
    _accessKey = accessKey;
  }

  private String _labelAndAccessKey;
  final public void setLabelAndAccessKey(String labelAndAccessKey)
  {
    _labelAndAccessKey = labelAndAccessKey;
  }

  private String _onselect;
  final public void setOnselect(String onselect)
  {
    _onselect = onselect;
  }

  private String _columns;
  final public void setColumns(String columns)
  {
    _columns = columns;
  }

  private String _maximumLength;
  final public void setMaximumLength(String maximumLength)
  {
    _maximumLength = maximumLength;
  }

  private String _autoSubmit;
  final public void setAutoSubmit(String autoSubmit)
  {
    _autoSubmit = autoSubmit;
  }

  private String _windowWidth;
  final public void setWindowWidth(String windowWidth)
  {
    _windowWidth = windowWidth;
  }

  private String _windowHeight;
  final public void setWindowHeight(String windowHeight)
  {
    _windowHeight = windowHeight;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setIntegerProperty(bean, CoreInputListOfValues.WINDOW_HEIGHT_KEY, _windowHeight);
    setProperty(bean, CoreInputListOfValues.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreInputListOfValues.SEARCH_DESC_KEY, _searchDesc);
    setProperty(bean, CoreInputListOfValues.LABEL_KEY, _label);
    setProperty(bean, CoreInputListOfValues.ONKEYDOWN_KEY, _onkeydown);
    setCharacterProperty(bean, CoreInputListOfValues.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreInputListOfValues.ONCHANGE_KEY, _onchange);
    setProperty(bean, CoreInputListOfValues.SHORT_DESC_KEY, _shortDesc);
    setBooleanProperty(bean, CoreInputListOfValues.READ_ONLY_KEY, _readOnly);
    setProperty(bean, CoreInputListOfValues.CONTENT_STYLE_KEY, _contentStyle);
    setProperty(bean, CoreInputListOfValues.ONFOCUS_KEY, _onfocus);
    setIntegerProperty(bean, CoreInputListOfValues.WINDOW_WIDTH_KEY, _windowWidth);
    setProperty(bean, CoreInputListOfValues.ONMOUSEDOWN_KEY, _onmousedown);
    setBooleanProperty(bean, CoreInputListOfValues.DISABLED_KEY, _disabled);
    setProperty(bean, CoreInputListOfValues.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreInputListOfValues.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreInputListOfValues.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreInputListOfValues.AUTO_COMPLETE_KEY, _autoComplete);
    setIntegerProperty(bean, CoreInputListOfValues.MAXIMUM_LENGTH_KEY, _maximumLength);
    setProperty(bean, CoreInputListOfValues.ONDBLCLICK_KEY, _ondblclick);
    if (_labelAndAccessKey != null)
    {
      if (isValueReference(_labelAndAccessKey))
      {
        ValueBinding vb = createValueBinding(_labelAndAccessKey);
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          vb,
          CoreInputListOfValues.LABEL_KEY,
          CoreInputListOfValues.ACCESS_KEY_KEY);
      }
      else
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _labelAndAccessKey,
          CoreInputListOfValues.LABEL_KEY,
          CoreInputListOfValues.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreInputListOfValues.ICON_KEY, _icon);
    setProperty(bean, CoreInputListOfValues.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreInputListOfValues.ONMOUSEOVER_KEY, _onmouseover);
    setBooleanProperty(bean, CoreInputListOfValues.SIMPLE_KEY, _simple);
    setProperty(bean, CoreInputListOfValues.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreInputListOfValues.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreInputListOfValues.ONKEYUP_KEY, _onkeyup);
    setStringArrayProperty(bean, CoreInputListOfValues.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setBooleanProperty(bean, CoreInputListOfValues.AUTO_SUBMIT_KEY, _autoSubmit);
    setBooleanProperty(bean, CoreInputListOfValues.SHOW_REQUIRED_KEY, _showRequired);
    setIntegerProperty(bean, CoreInputListOfValues.COLUMNS_KEY, _columns);
    setProperty(bean, CoreInputListOfValues.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreInputListOfValues.ONSELECT_KEY, _onselect);
  }

  @Override
  public void release()
  {
    super.release();
    _windowHeight = null;
    _onmouseup = null;
    _searchDesc = null;
    _label = null;
    _onkeydown = null;
    _accessKey = null;
    _onchange = null;
    _shortDesc = null;
    _readOnly = null;
    _contentStyle = null;
    _onfocus = null;
    _windowWidth = null;
    _onmousedown = null;
    _disabled = null;
    _onmouseout = null;
    _onmousemove = null;
    _onkeypress = null;
    _autoComplete = null;
    _maximumLength = null;
    _ondblclick = null;
    _labelAndAccessKey = null;
    _icon = null;
    _inlineStyle = null;
    _onmouseover = null;
    _simple = null;
    _onclick = null;
    _onblur = null;
    _onkeyup = null;
    _partialTriggers = null;
    _autoSubmit = null;
    _showRequired = null;
    _columns = null;
    _styleClass = null;
    _onselect = null;
  }
}
