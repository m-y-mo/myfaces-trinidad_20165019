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
import org.apache.myfaces.trinidad.component.core.layout.CorePanelCaptionGroup;
import org.apache.myfaces.trinidadinternal.taglib.UIXPanelTag;

/**
 * Auto-generated tag class.
 */
public class CorePanelCaptionGroupTag extends UIXPanelTag
{

  /**
   * Construct an instance of the CorePanelCaptionGroupTag.
   */
  public CorePanelCaptionGroupTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelCaptionGroup";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.PanelCaptionGroup";
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

  private String _captionText;
  final public void setCaptionText(String captionText)
  {
    _captionText = captionText;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CorePanelCaptionGroup.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CorePanelCaptionGroup.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelCaptionGroup.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelCaptionGroup.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CorePanelCaptionGroup.ONMOUSEUP_KEY, _onmouseup);
    setStringArrayProperty(bean, CorePanelCaptionGroup.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelCaptionGroup.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CorePanelCaptionGroup.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CorePanelCaptionGroup.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CorePanelCaptionGroup.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelCaptionGroup.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CorePanelCaptionGroup.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CorePanelCaptionGroup.CAPTION_TEXT_KEY, _captionText);
    setProperty(bean, CorePanelCaptionGroup.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelCaptionGroup.ONMOUSEOVER_KEY, _onmouseover);
  }

  @Override
  public void release()
  {
    super.release();
    _ondblclick = null;
    _onclick = null;
    _onmousedown = null;
    _onkeydown = null;
    _onmouseup = null;
    _partialTriggers = null;
    _onkeypress = null;
    _onmousemove = null;
    _inlineStyle = null;
    _shortDesc = null;
    _onkeyup = null;
    _onmouseout = null;
    _captionText = null;
    _styleClass = null;
    _onmouseover = null;
  }
}
