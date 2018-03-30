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
import org.apache.myfaces.trinidad.component.core.input.CoreInputColor;
import org.apache.myfaces.trinidadinternal.taglib.UIXSelectInputTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreInputColorTag extends UIXSelectInputTag
{

  /**
   * Construct an instance of the CoreInputColorTag.
   */
  public CoreInputColorTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreInputColor";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Color";
  }

  private String _contentStyle;
  final public void setContentStyle(String contentStyle)
  {
    _contentStyle = contentStyle;
  }

  private String _compact;
  final public void setCompact(String compact)
  {
    _compact = compact;
  }

  private String _chooseId;
  final public void setChooseId(String chooseId)
  {
    _chooseId = chooseId;
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

  private String _columns;
  final public void setColumns(String columns)
  {
    _columns = columns;
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

  private String _autoSubmit;
  final public void setAutoSubmit(String autoSubmit)
  {
    _autoSubmit = autoSubmit;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreInputColor.STYLE_CLASS_KEY, _styleClass);
    setBooleanProperty(bean, CoreInputColor.SHOW_REQUIRED_KEY, _showRequired);
    setProperty(bean, CoreInputColor.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreInputColor.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreInputColor.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreInputColor.LABEL_KEY, _label);
    setProperty(bean, CoreInputColor.ONMOUSEMOVE_KEY, _onmousemove);
    setBooleanProperty(bean, CoreInputColor.COMPACT_KEY, _compact);
    setBooleanProperty(bean, CoreInputColor.DISABLED_KEY, _disabled);
    setProperty(bean, CoreInputColor.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreInputColor.ONFOCUS_KEY, _onfocus);
    setProperty(bean, CoreInputColor.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreInputColor.ONMOUSEUP_KEY, _onmouseup);
    setStringArrayProperty(bean, CoreInputColor.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreInputColor.ONMOUSEOVER_KEY, _onmouseover);
    setCharacterProperty(bean, CoreInputColor.ACCESS_KEY_KEY, _accessKey);
    setBooleanProperty(bean, CoreInputColor.AUTO_SUBMIT_KEY, _autoSubmit);
    setProperty(bean, CoreInputColor.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreInputColor.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreInputColor.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreInputColor.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreInputColor.CONTENT_STYLE_KEY, _contentStyle);
    if (_labelAndAccessKey != null)
    {
      if (isValueReference(_labelAndAccessKey))
      {
        ValueBinding vb = createValueBinding(_labelAndAccessKey);
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          vb,
          CoreInputColor.LABEL_KEY,
          CoreInputColor.ACCESS_KEY_KEY);
      }
      else
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _labelAndAccessKey,
          CoreInputColor.LABEL_KEY,
          CoreInputColor.ACCESS_KEY_KEY);
      }
    }
    setIntegerProperty(bean, CoreInputColor.COLUMNS_KEY, _columns);
    setProperty(bean, CoreInputColor.CHOOSE_ID_KEY, _chooseId);
    setProperty(bean, CoreInputColor.AUTO_COMPLETE_KEY, _autoComplete);
    setProperty(bean, CoreInputColor.ONCHANGE_KEY, _onchange);
    setBooleanProperty(bean, CoreInputColor.READ_ONLY_KEY, _readOnly);
    setProperty(bean, CoreInputColor.ONBLUR_KEY, _onblur);
    setBooleanProperty(bean, CoreInputColor.SIMPLE_KEY, _simple);
  }

  @Override
  public void release()
  {
    super.release();
    _styleClass = null;
    _showRequired = null;
    _inlineStyle = null;
    _shortDesc = null;
    _onkeydown = null;
    _label = null;
    _onmousemove = null;
    _compact = null;
    _disabled = null;
    _onkeypress = null;
    _onfocus = null;
    _onclick = null;
    _onmouseup = null;
    _partialTriggers = null;
    _onmouseover = null;
    _accessKey = null;
    _autoSubmit = null;
    _onmousedown = null;
    _onmouseout = null;
    _onkeyup = null;
    _ondblclick = null;
    _contentStyle = null;
    _labelAndAccessKey = null;
    _columns = null;
    _chooseId = null;
    _autoComplete = null;
    _onchange = null;
    _readOnly = null;
    _onblur = null;
    _simple = null;
  }
}
