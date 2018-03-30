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
import org.apache.myfaces.trinidad.component.core.layout.CorePanelRadio;
import org.apache.myfaces.trinidadinternal.taglib.UIXShowOneTag;

/**
 * Auto-generated tag class.
 */
public class CorePanelRadioTag extends UIXShowOneTag
{

  /**
   * Construct an instance of the CorePanelRadioTag.
   */
  public CorePanelRadioTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelRadio";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Radio";
  }

  private String _label;
  final public void setLabel(String label)
  {
    _label = label;
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
    setStringArrayProperty(bean, CorePanelRadio.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelRadio.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelRadio.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CorePanelRadio.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CorePanelRadio.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CorePanelRadio.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelRadio.ALIGNMENT_KEY, _alignment);
    setProperty(bean, CorePanelRadio.LABEL_KEY, _label);
    setProperty(bean, CorePanelRadio.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CorePanelRadio.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CorePanelRadio.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelRadio.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelRadio.POSITION_KEY, _position);
    setProperty(bean, CorePanelRadio.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelRadio.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CorePanelRadio.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CorePanelRadio.ONDBLCLICK_KEY, _ondblclick);
  }

  @Override
  public void release()
  {
    super.release();
    _partialTriggers = null;
    _onmousedown = null;
    _onmouseup = null;
    _onmousemove = null;
    _onkeypress = null;
    _onclick = null;
    _alignment = null;
    _label = null;
    _inlineStyle = null;
    _onkeyup = null;
    _shortDesc = null;
    _onmouseover = null;
    _position = null;
    _styleClass = null;
    _onmouseout = null;
    _onkeydown = null;
    _ondblclick = null;
  }
}
