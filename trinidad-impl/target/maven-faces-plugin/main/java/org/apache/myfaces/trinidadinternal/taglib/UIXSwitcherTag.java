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
package org.apache.myfaces.trinidadinternal.taglib;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.UIXSwitcher;
import org.apache.myfaces.trinidad.webapp.UIXComponentTag;

/**
 * Auto-generated tag class.
 */
public class UIXSwitcherTag extends UIXComponentTag
{

  /**
   * Construct an instance of the UIXSwitcherTag.
   */
  public UIXSwitcherTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.Switcher";
  }

  public String getRendererType()
  {
    return null;
  }

  private String _facetName;
  final public void setFacetName(String facetName)
  {
    _facetName = facetName;
  }

  private String _defaultFacet;
  final public void setDefaultFacet(String defaultFacet)
  {
    _defaultFacet = defaultFacet;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, UIXSwitcher.FACET_NAME_KEY, _facetName);
    setProperty(bean, UIXSwitcher.DEFAULT_FACET_KEY, _defaultFacet);
  }

  @Override
  public void release()
  {
    super.release();
    _facetName = null;
    _defaultFacet = null;
  }
}
