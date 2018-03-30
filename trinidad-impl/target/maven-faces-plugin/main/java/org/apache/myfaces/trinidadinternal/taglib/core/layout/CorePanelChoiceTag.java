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

import javax.faces.el.ValueBinding;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.layout.CorePanelChoice;
import org.apache.myfaces.trinidadinternal.taglib.UIXShowOneTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CorePanelChoiceTag extends UIXShowOneTag
{

  /**
   * Construct an instance of the CorePanelChoiceTag.
   */
  public CorePanelChoiceTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelChoice";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Choice";
  }

  private String _label;
  final public void setLabel(String label)
  {
    _label = label;
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

  private String _position;
  final public void setPosition(String position)
  {
    _position = position;
  }

  private String _alignment;
  final public void setAlignment(String alignment)
  {
    _alignment = alignment;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CorePanelChoice.POSITION_KEY, _position);
    setProperty(bean, CorePanelChoice.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CorePanelChoice.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CorePanelChoice.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelChoice.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelChoice.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CorePanelChoice.ALIGNMENT_KEY, _alignment);
    setCharacterProperty(bean, CorePanelChoice.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CorePanelChoice.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CorePanelChoice.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelChoice.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CorePanelChoice.SHORT_DESC_KEY, _shortDesc);
    setStringArrayProperty(bean, CorePanelChoice.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelChoice.ONKEYPRESS_KEY, _onkeypress);
    if (_labelAndAccessKey != null)
    {
      if (isValueReference(_labelAndAccessKey))
      {
        ValueBinding vb = createValueBinding(_labelAndAccessKey);
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          vb,
          CorePanelChoice.LABEL_KEY,
          CorePanelChoice.ACCESS_KEY_KEY);
      }
      else
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _labelAndAccessKey,
          CorePanelChoice.LABEL_KEY,
          CorePanelChoice.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CorePanelChoice.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CorePanelChoice.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelChoice.LABEL_KEY, _label);
    setProperty(bean, CorePanelChoice.ONDBLCLICK_KEY, _ondblclick);
  }

  @Override
  public void release()
  {
    super.release();
    _position = null;
    _onmousemove = null;
    _onkeydown = null;
    _onmousedown = null;
    _styleClass = null;
    _onmouseout = null;
    _alignment = null;
    _accessKey = null;
    _onmouseup = null;
    _onclick = null;
    _inlineStyle = null;
    _shortDesc = null;
    _partialTriggers = null;
    _onkeypress = null;
    _labelAndAccessKey = null;
    _onkeyup = null;
    _onmouseover = null;
    _label = null;
    _ondblclick = null;
  }
}
