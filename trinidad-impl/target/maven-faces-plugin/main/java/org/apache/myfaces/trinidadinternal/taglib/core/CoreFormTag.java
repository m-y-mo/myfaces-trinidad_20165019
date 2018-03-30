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
import org.apache.myfaces.trinidad.component.core.CoreForm;
import org.apache.myfaces.trinidadinternal.taglib.UIXFormTag;

/**
 * Auto-generated tag class.
 */
public class CoreFormTag extends UIXFormTag
{

  /**
   * Construct an instance of the CoreFormTag.
   */
  public CoreFormTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreForm";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Form";
  }

  private String _targetFrame;
  final public void setTargetFrame(String targetFrame)
  {
    _targetFrame = targetFrame;
  }

  private String _usesUpload;
  final public void setUsesUpload(String usesUpload)
  {
    _usesUpload = usesUpload;
  }

  private String _autoComplete;
  final public void setAutoComplete(String autoComplete)
  {
    _autoComplete = autoComplete;
  }

  private String _defaultCommand;
  final public void setDefaultCommand(String defaultCommand)
  {
    _defaultCommand = defaultCommand;
  }

  private String _onsubmit;
  final public void setOnsubmit(String onsubmit)
  {
    _onsubmit = onsubmit;
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

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreForm.TARGET_FRAME_KEY, _targetFrame);
    setProperty(bean, CoreForm.SHORT_DESC_KEY, _shortDesc);
    setStringArrayProperty(bean, CoreForm.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreForm.ONCLICK_KEY, _onclick);
    setBooleanProperty(bean, CoreForm.USES_UPLOAD_KEY, _usesUpload);
    setProperty(bean, CoreForm.DEFAULT_COMMAND_KEY, _defaultCommand);
    setProperty(bean, CoreForm.AUTO_COMPLETE_KEY, _autoComplete);
    setProperty(bean, CoreForm.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreForm.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreForm.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreForm.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreForm.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreForm.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreForm.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreForm.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreForm.ONSUBMIT_KEY, _onsubmit);
    setProperty(bean, CoreForm.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreForm.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreForm.ONMOUSEOVER_KEY, _onmouseover);
  }

  @Override
  public void release()
  {
    super.release();
    _targetFrame = null;
    _shortDesc = null;
    _partialTriggers = null;
    _onclick = null;
    _usesUpload = null;
    _defaultCommand = null;
    _autoComplete = null;
    _onmouseout = null;
    _onmousedown = null;
    _onmousemove = null;
    _onmouseup = null;
    _styleClass = null;
    _onkeypress = null;
    _ondblclick = null;
    _onkeyup = null;
    _onsubmit = null;
    _onkeydown = null;
    _inlineStyle = null;
    _onmouseover = null;
  }
}
