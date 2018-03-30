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

import javax.faces.el.ValueBinding;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.nav.CoreCommandNavigationItem;
import org.apache.myfaces.trinidadinternal.taglib.UIXCommandTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreCommandNavigationItemTag extends UIXCommandTag
{

  /**
   * Construct an instance of the CoreCommandNavigationItemTag.
   */
  public CoreCommandNavigationItemTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreCommandNavigationItem";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.NavigationItem";
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

  private String _useWindow;
  final public void setUseWindow(String useWindow)
  {
    _useWindow = useWindow;
  }

  private String _windowHeight;
  final public void setWindowHeight(String windowHeight)
  {
    _windowHeight = windowHeight;
  }

  private String _windowWidth;
  final public void setWindowWidth(String windowWidth)
  {
    _windowWidth = windowWidth;
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

  private String _accessKey;
  final public void setAccessKey(String accessKey)
  {
    _accessKey = accessKey;
  }

  private String _destination;
  final public void setDestination(String destination)
  {
    _destination = destination;
  }

  private String _disabled;
  final public void setDisabled(String disabled)
  {
    _disabled = disabled;
  }

  private String _icon;
  final public void setIcon(String icon)
  {
    _icon = icon;
  }

  private String _partialSubmit;
  final public void setPartialSubmit(String partialSubmit)
  {
    _partialSubmit = partialSubmit;
  }

  private String _selected;
  final public void setSelected(String selected)
  {
    _selected = selected;
  }

  private String _visited;
  final public void setVisited(String visited)
  {
    _visited = visited;
  }

  private String _targetFrame;
  final public void setTargetFrame(String targetFrame)
  {
    _targetFrame = targetFrame;
  }

  private String _text;
  final public void setText(String text)
  {
    _text = text;
  }

  private String _textAndAccessKey;
  final public void setTextAndAccessKey(String textAndAccessKey)
  {
    _textAndAccessKey = textAndAccessKey;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreCommandNavigationItem.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreCommandNavigationItem.ONMOUSEOVER_KEY, _onmouseover);
    setBooleanProperty(bean, CoreCommandNavigationItem.DISABLED_KEY, _disabled);
    setCharacterProperty(bean, CoreCommandNavigationItem.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreCommandNavigationItem.ONMOUSEDOWN_KEY, _onmousedown);
    setBooleanProperty(bean, CoreCommandNavigationItem.SELECTED_KEY, _selected);
    setProperty(bean, CoreCommandNavigationItem.ONKEYDOWN_KEY, _onkeydown);
    setStringArrayProperty(bean, CoreCommandNavigationItem.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setIntegerProperty(bean, CoreCommandNavigationItem.WINDOW_HEIGHT_KEY, _windowHeight);
    setProperty(bean, CoreCommandNavigationItem.DESTINATION_KEY, _destination);
    setIntegerProperty(bean, CoreCommandNavigationItem.WINDOW_WIDTH_KEY, _windowWidth);
    setProperty(bean, CoreCommandNavigationItem.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreCommandNavigationItem.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreCommandNavigationItem.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreCommandNavigationItem.INLINE_STYLE_KEY, _inlineStyle);
    setBooleanProperty(bean, CoreCommandNavigationItem.PARTIAL_SUBMIT_KEY, _partialSubmit);
    setProperty(bean, CoreCommandNavigationItem.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreCommandNavigationItem.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreCommandNavigationItem.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreCommandNavigationItem.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreCommandNavigationItem.TARGET_FRAME_KEY, _targetFrame);
    if (_textAndAccessKey != null)
    {
      if (isValueReference(_textAndAccessKey))
      {
        ValueBinding vb = createValueBinding(_textAndAccessKey);
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          vb,
          CoreCommandNavigationItem.TEXT_KEY,
          CoreCommandNavigationItem.ACCESS_KEY_KEY);
      }
      else
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _textAndAccessKey,
          CoreCommandNavigationItem.TEXT_KEY,
          CoreCommandNavigationItem.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreCommandNavigationItem.SHORT_DESC_KEY, _shortDesc);
    setBooleanProperty(bean, CoreCommandNavigationItem.USE_WINDOW_KEY, _useWindow);
    setProperty(bean, CoreCommandNavigationItem.ICON_KEY, _icon);
    setBooleanProperty(bean, CoreCommandNavigationItem.VISITED_KEY, _visited);
    setProperty(bean, CoreCommandNavigationItem.TEXT_KEY, _text);
  }

  @Override
  public void release()
  {
    super.release();
    _onclick = null;
    _onmouseover = null;
    _disabled = null;
    _accessKey = null;
    _onmousedown = null;
    _selected = null;
    _onkeydown = null;
    _partialTriggers = null;
    _windowHeight = null;
    _destination = null;
    _windowWidth = null;
    _styleClass = null;
    _onkeyup = null;
    _onmousemove = null;
    _inlineStyle = null;
    _partialSubmit = null;
    _onmouseup = null;
    _ondblclick = null;
    _onmouseout = null;
    _onkeypress = null;
    _targetFrame = null;
    _textAndAccessKey = null;
    _shortDesc = null;
    _useWindow = null;
    _icon = null;
    _visited = null;
    _text = null;
  }
}
