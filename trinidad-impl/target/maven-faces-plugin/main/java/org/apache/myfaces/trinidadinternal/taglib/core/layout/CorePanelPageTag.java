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
import org.apache.myfaces.trinidad.component.core.layout.CorePanelPage;
import org.apache.myfaces.trinidadinternal.taglib.UIXPanelTag;

/**
 * Auto-generated tag class.
 */
public class CorePanelPageTag extends UIXPanelTag
{

  /**
   * Construct an instance of the CorePanelPageTag.
   */
  public CorePanelPageTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelPage";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Page";
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

  private String _auxiliary1Size;
  final public void setAuxiliary1Size(String auxiliary1Size)
  {
    _auxiliary1Size = auxiliary1Size;
  }

  private String _auxiliary2Size;
  final public void setAuxiliary2Size(String auxiliary2Size)
  {
    _auxiliary2Size = auxiliary2Size;
  }

  private String _auxiliaryGlobalSize;
  final public void setAuxiliaryGlobalSize(String auxiliaryGlobalSize)
  {
    _auxiliaryGlobalSize = auxiliaryGlobalSize;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CorePanelPage.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelPage.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CorePanelPage.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CorePanelPage.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelPage.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelPage.ONKEYDOWN_KEY, _onkeydown);
    setIntegerProperty(bean, CorePanelPage.AUXILIARY_GLOBAL_SIZE_KEY, _auxiliaryGlobalSize);
    setIntegerProperty(bean, CorePanelPage.AUXILIARY1SIZE_KEY, _auxiliary1Size);
    setProperty(bean, CorePanelPage.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelPage.ONKEYPRESS_KEY, _onkeypress);
    setIntegerProperty(bean, CorePanelPage.AUXILIARY2SIZE_KEY, _auxiliary2Size);
    setProperty(bean, CorePanelPage.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelPage.INLINE_STYLE_KEY, _inlineStyle);
    setStringArrayProperty(bean, CorePanelPage.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelPage.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CorePanelPage.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CorePanelPage.ONKEYUP_KEY, _onkeyup);
  }

  @Override
  public void release()
  {
    super.release();
    _onmouseover = null;
    _ondblclick = null;
    _onmousemove = null;
    _onmousedown = null;
    _styleClass = null;
    _onkeydown = null;
    _auxiliaryGlobalSize = null;
    _auxiliary1Size = null;
    _shortDesc = null;
    _onkeypress = null;
    _auxiliary2Size = null;
    _onclick = null;
    _inlineStyle = null;
    _partialTriggers = null;
    _onmouseout = null;
    _onmouseup = null;
    _onkeyup = null;
  }
}
