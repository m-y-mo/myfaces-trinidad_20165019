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
package org.apache.myfaces.trinidadinternal.taglib.core;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.CoreDocument;
import org.apache.myfaces.trinidadinternal.taglib.UIXDocumentTag;

/**
 * Auto-generated tag class.
 */
public class CoreDocumentTag extends UIXDocumentTag
{

  /**
   * Construct an instance of the CoreDocumentTag.
   */
  public CoreDocumentTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreDocument";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Document";
  }

  private String _title;
  final public void setTitle(String title)
  {
    _title = title;
  }

  private String _mode;
  final public void setMode(String mode)
  {
    _mode = mode;
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

  private String _onload;
  final public void setOnload(String onload)
  {
    _onload = onload;
  }

  private String _onunload;
  final public void setOnunload(String onunload)
  {
    _onunload = onunload;
  }

  private String _initialFocusId;
  final public void setInitialFocusId(String initialFocusId)
  {
    _initialFocusId = initialFocusId;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreDocument.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreDocument.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreDocument.TITLE_KEY, _title);
    setProperty(bean, CoreDocument.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreDocument.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreDocument.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreDocument.ONLOAD_KEY, _onload);
    setProperty(bean, CoreDocument.MODE_KEY, _mode);
    setProperty(bean, CoreDocument.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreDocument.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreDocument.INITIAL_FOCUS_ID_KEY, _initialFocusId);
    setProperty(bean, CoreDocument.ONUNLOAD_KEY, _onunload);
    setProperty(bean, CoreDocument.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreDocument.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreDocument.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreDocument.SHORT_DESC_KEY, _shortDesc);
    setStringArrayProperty(bean, CoreDocument.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreDocument.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreDocument.ONMOUSEOVER_KEY, _onmouseover);
  }

  @Override
  public void release()
  {
    super.release();
    _onmousemove = null;
    _onkeypress = null;
    _title = null;
    _onkeydown = null;
    _ondblclick = null;
    _onmouseout = null;
    _onload = null;
    _mode = null;
    _onclick = null;
    _onmouseup = null;
    _initialFocusId = null;
    _onunload = null;
    _styleClass = null;
    _onkeyup = null;
    _inlineStyle = null;
    _shortDesc = null;
    _partialTriggers = null;
    _onmousedown = null;
    _onmouseover = null;
  }
}
