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
package org.apache.myfaces.trinidadinternal.taglib.html;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.html.HtmlHead;
import org.apache.myfaces.trinidad.webapp.UIXComponentTag;

/**
 * Auto-generated tag class.
 */
public class HtmlHeadTag extends UIXComponentTag
{

  /**
   * Construct an instance of the HtmlHeadTag.
   */
  public HtmlHeadTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.HtmlHead";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Head";
  }

  private String _title;
  final public void setTitle(String title)
  {
    _title = title;
  }

  private String _partialTriggers;
  final public void setPartialTriggers(String partialTriggers)
  {
    _partialTriggers = partialTriggers;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setStringArrayProperty(bean, HtmlHead.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, HtmlHead.TITLE_KEY, _title);
  }

  @Override
  public void release()
  {
    super.release();
    _partialTriggers = null;
    _title = null;
  }
}
