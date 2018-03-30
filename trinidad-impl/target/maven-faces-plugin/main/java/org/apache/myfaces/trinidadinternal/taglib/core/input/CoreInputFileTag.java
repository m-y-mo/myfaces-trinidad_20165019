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
import org.apache.myfaces.trinidad.component.core.input.CoreInputFile;
import org.apache.myfaces.trinidadinternal.taglib.UIXInputTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreInputFileTag extends UIXInputTag
{

  /**
   * Construct an instance of the CoreInputFileTag.
   */
  public CoreInputFileTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreInputFile";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.File";
  }

  private String _contentStyle;
  final public void setContentStyle(String contentStyle)
  {
    _contentStyle = contentStyle;
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

  private String _onchange;
  final public void setOnchange(String onchange)
  {
    _onchange = onchange;
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

  private String _labelAndAccessKey;
  final public void setLabelAndAccessKey(String labelAndAccessKey)
  {
    _labelAndAccessKey = labelAndAccessKey;
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

  private String _disabled;
  final public void setDisabled(String disabled)
  {
    _disabled = disabled;
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

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreInputFile.SHORT_DESC_KEY, _shortDesc);
    setIntegerProperty(bean, CoreInputFile.COLUMNS_KEY, _columns);
    setBooleanProperty(bean, CoreInputFile.SHOW_REQUIRED_KEY, _showRequired);
    setProperty(bean, CoreInputFile.ONFOCUS_KEY, _onfocus);
    setProperty(bean, CoreInputFile.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreInputFile.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreInputFile.ONSELECT_KEY, _onselect);
    setProperty(bean, CoreInputFile.LABEL_KEY, _label);
    setProperty(bean, CoreInputFile.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreInputFile.ONCLICK_KEY, _onclick);
    setStringArrayProperty(bean, CoreInputFile.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreInputFile.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreInputFile.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreInputFile.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreInputFile.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreInputFile.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreInputFile.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreInputFile.ONMOUSEUP_KEY, _onmouseup);
    setCharacterProperty(bean, CoreInputFile.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreInputFile.CONTENT_STYLE_KEY, _contentStyle);
    setProperty(bean, CoreInputFile.ONBLUR_KEY, _onblur);
    if (_labelAndAccessKey != null)
    {
      if (isValueReference(_labelAndAccessKey))
      {
        ValueBinding vb = createValueBinding(_labelAndAccessKey);
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          vb,
          CoreInputFile.LABEL_KEY,
          CoreInputFile.ACCESS_KEY_KEY);
      }
      else
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _labelAndAccessKey,
          CoreInputFile.LABEL_KEY,
          CoreInputFile.ACCESS_KEY_KEY);
      }
    }
    setBooleanProperty(bean, CoreInputFile.SIMPLE_KEY, _simple);
    setProperty(bean, CoreInputFile.ONCHANGE_KEY, _onchange);
    setBooleanProperty(bean, CoreInputFile.DISABLED_KEY, _disabled);
    setProperty(bean, CoreInputFile.ONMOUSEOVER_KEY, _onmouseover);
  }

  @Override
  public void release()
  {
    super.release();
    _shortDesc = null;
    _columns = null;
    _showRequired = null;
    _onfocus = null;
    _styleClass = null;
    _onkeypress = null;
    _onselect = null;
    _label = null;
    _onmousemove = null;
    _onclick = null;
    _partialTriggers = null;
    _ondblclick = null;
    _onmousedown = null;
    _onmouseout = null;
    _onkeyup = null;
    _inlineStyle = null;
    _onkeydown = null;
    _onmouseup = null;
    _accessKey = null;
    _contentStyle = null;
    _onblur = null;
    _labelAndAccessKey = null;
    _simple = null;
    _onchange = null;
    _disabled = null;
    _onmouseover = null;
  }
}
