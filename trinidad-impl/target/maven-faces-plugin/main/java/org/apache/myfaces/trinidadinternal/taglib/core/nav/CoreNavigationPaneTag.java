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
package org.apache.myfaces.trinidadinternal.taglib.core.nav;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.nav.CoreNavigationPane;
import org.apache.myfaces.trinidadinternal.taglib.UIXNavigationLevelTag;

/**
 * Auto-generated tag class.
 */
public class CoreNavigationPaneTag extends UIXNavigationLevelTag
{

  /**
   * Construct an instance of the CoreNavigationPaneTag.
   */
  public CoreNavigationPaneTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreNavigationPane";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Pane";
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

  private String _disabled;
  final public void setDisabled(String disabled)
  {
    _disabled = disabled;
  }

  private String _hint;
  final public void setHint(String hint)
  {
    _hint = hint;
  }

  private String _title;
  final public void setTitle(String title)
  {
    _title = title;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreNavigationPane.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreNavigationPane.ONCLICK_KEY, _onclick);
    setStringArrayProperty(bean, CoreNavigationPane.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreNavigationPane.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreNavigationPane.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreNavigationPane.TITLE_KEY, _title);
    setProperty(bean, CoreNavigationPane.INLINE_STYLE_KEY, _inlineStyle);
    setBooleanProperty(bean, CoreNavigationPane.DISABLED_KEY, _disabled);
    setProperty(bean, CoreNavigationPane.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreNavigationPane.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreNavigationPane.HINT_KEY, _hint);
    setProperty(bean, CoreNavigationPane.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreNavigationPane.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreNavigationPane.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreNavigationPane.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreNavigationPane.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreNavigationPane.STYLE_CLASS_KEY, _styleClass);
  }

  @Override
  public void release()
  {
    super.release();
    _onkeypress = null;
    _onclick = null;
    _partialTriggers = null;
    _onkeyup = null;
    _onmousemove = null;
    _title = null;
    _inlineStyle = null;
    _disabled = null;
    _shortDesc = null;
    _ondblclick = null;
    _hint = null;
    _onmouseover = null;
    _onkeydown = null;
    _onmousedown = null;
    _onmouseup = null;
    _onmouseout = null;
    _styleClass = null;
  }
}
