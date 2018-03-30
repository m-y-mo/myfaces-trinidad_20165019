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
package org.apache.myfaces.trinidad.component;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.FacesEvent;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.logging.TrinidadLogger;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * This component inserts a component (defined by a separate page
 *           that starts with &lt;tr:componentDef&gt;)
 *           into the current page. The &quot;id&quot; attribute is required on this
 *           component, which implements NamingContainer.  This component may have
 *           a value, custom attributes, or both.  The value will be
 *           made available to within component definition using the &quot;binding&quot;
 *           EL attribute.  Custom attributes, defined with
 *           &lt;f:attribute&gt; or &lt;tr:attribute&gt;, will also
 *           be made available within the component definition - see the
 *           &lt;tr:componentDef&gt; tag documentation for more information.
 * 
 *           This component may also have facets. Each facet may be referenced
 *           exactly once from within a &lt;tr:componentDef&gt; tag by
 *           using a &lt;tr:facetRef&gt; - see the
 *           &lt;tr:componentRef&gt; tag documentation for more information.
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXComponentRef extends UIXComponentBase
                             implements NamingContainer
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey VALUE_KEY =
    TYPE.registerKey("value");
  static public final PropertyKey COMPONENT_TYPE_KEY =
    TYPE.registerKey("componentType", String.class);
  static public final PropertyKey VAR_KEY =
    TYPE.registerKey("var", String.class);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.ComponentRef";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.ComponentRef";

  /**
   * Construct an instance of the UIXComponentRef.
   */
  public UIXComponentRef()
  {
    super(null);
  }
  
  @Override
  public void queueEvent(FacesEvent event)
  {
    // we want to wrap up
    // the event so we can execute it in the correct context (with the correct
    // pageDefinition):
    event = new WrapperEvent(this, event);
    super.queueEvent(event);
  }

  @Override
  public void broadcast(FacesEvent event)
    throws AbortProcessingException
  {
    if (event instanceof WrapperEvent)
    {
      WrapperEvent wrapper = (WrapperEvent) event;
      final FacesEvent wrapped = wrapper.getEvent();
      Runnable runner = new Runnable()
      {
        public void run()
        {
          wrapped.getComponent().broadcast(wrapped);
        }
      };
      FacesContext context = FacesContext.getCurrentInstance();
      _processPhase(context, runner);
    }
    else
    {
      super.broadcast(event);
    }
  }

  @Override
  public void processDecodes(final FacesContext context)
  {
    Runnable runner = new Runnable()
    {
      public void run()
      {
        UIXComponentRef.super.processDecodes(context);
      }
    };
    _processPhase(context, runner);
  }

  @Override
  public void processValidators(final FacesContext context)
  {
    Runnable runner = new Runnable()
    {
      public void run()
      {
        UIXComponentRef.super.processValidators(context);
      }
    };
    _processPhase(context, runner);
  }

  @Override
  public void processUpdates(final FacesContext context)
  {
    Runnable runner = new Runnable()
    {
      public void run()
      {
        UIXComponentRef.super.processUpdates(context);
      }
    };
    _processPhase(context, runner);
  }

  @Override
  public void encodeBegin(FacesContext context) throws IOException
  {
    _setupEL(context);
    super.encodeBegin(context);
  }

  @Override
  public void encodeEnd(final FacesContext context) throws IOException
  {
    super.encodeEnd(context);
    _resetEL(context);
  }

  private void _setupEL(FacesContext context)
  {
    UIXComponentRef region = _getParent();
    // in the JSP VE we try to display a regiondef page. so we can't
    // blow up if there isn't a parent region component.
    if (region != null)
    {
      Object newValue = region.getValue();
      _oldValue =
        TableUtils.setupELVariable(context, _BINDINGS_VAR, newValue);

      String var = _getVar();
      _oldVar =
        TableUtils.setupELVariable(context, var, new AttrMap());
    }
  }

  private void _resetEL(FacesContext context)
  {
    TableUtils.setupELVariable(context, _BINDINGS_VAR, _oldValue);
    String var = _getVar();
    TableUtils.setupELVariable(context, var, _oldVar);

    _oldValue = Boolean.FALSE; // GC
    _oldVar = null; // GC
  }

  private void _processPhase(FacesContext context, Runnable runner)
  {
    assert context != null : "FacesContext is null";

    if (!isRendered())
      return;

    _setupEL(context);

    try
    {
      runner.run();
    }
    finally
    {
      _resetEL(context);
    }
  }

  private UIXComponentRef _getParent()
  {
    for(UIComponent test = this; test != null; test = test.getParent())
    {
      if (test instanceof UIXComponentRef)
        return (UIXComponentRef) test;
    }

    _LOG.severe("NO_PARENT_COMPONENTREF_FOUND");
    return null;
  }

  private String _getVar()
  {
    if (_var == null)
    {
      _var = getVar();
      if (_var == null)
      {
        _LOG.fine("var not set");
        _var = "null"; // initialize so that we don't keep checking.
      }
    }
    return _var;
  }

  private final class AttrMap extends AbstractMap<Object, Object>
  {
    @Override
    public Object get(final Object key)
    {
      FacesContext context = FacesContext.getCurrentInstance();

      assert _oldValue != Boolean.FALSE : "EL variables have not been setup";

      // when evaluating an attribute value on the parent, we need to reset the
      // EL variables, evaluate the attribute value and then restore the EL variables:
      Object currentValue = TableUtils.setupELVariable(context, _BINDINGS_VAR, _oldValue);
      String var = _getVar();
      Object currentVar = TableUtils.setupELVariable(context, var, _oldVar);

      UIXComponentRef region =_getParent();
      Object result = region.getAttributes().get(key);

      TableUtils.setupELVariable(context, _BINDINGS_VAR, currentValue);
      TableUtils.setupELVariable(context, var, currentVar);
      return result;
    }

    @Override
    public Set<Map.Entry<Object, Object>> entrySet()
    {
      return Collections.emptySet();
    }
  }

  // Local backing for the actual Var
  private transient String _var = null;
  private transient Object _oldValue = Boolean.FALSE;
  private transient Object _oldVar = null;
  private static final String _BINDINGS_VAR = "bindings";
  private static final TrinidadLogger _LOG = TrinidadLogger.createTrinidadLogger(UIXComponentRef.class);

  /**
   * Gets the value of the component.  This value be evaluated during
   *               all lifecycle processing and
   *               made available to the componentDef as an EL variable named "bindings".
   *
   * @return  the new value value
   */
  final public Object getValue()
  {
    return getProperty(VALUE_KEY);
  }

  /**
   * Sets the value of the component.  This value be evaluated during
   *               all lifecycle processing and
   *               made available to the componentDef as an EL variable named "bindings".
   * 
   * @param value  the new value value
   */
  final public void setValue(Object value)
  {
    setProperty(VALUE_KEY, (value));
  }

  /**
   * Gets <html> which componnet to use. This should match a
   * &lt;component-type&gt; string in a region metadata file.
   * An example might look like "org.apache.myfaces.trinidaddemo.region.stock".
   * This attribute can be bound to an EL expression or manually
   * set, which will change the region definition used the next
   * time the page renders.</html>
   *
   * @return  the new componentType value
   */
  final public String getComponentType()
  {
    return ComponentUtils.resolveString(getProperty(COMPONENT_TYPE_KEY));
  }

  /**
   * Sets <html> which componnet to use. This should match a
   * &lt;component-type&gt; string in a region metadata file.
   * An example might look like "org.apache.myfaces.trinidaddemo.region.stock".
   * This attribute can be bound to an EL expression or manually
   * set, which will change the region definition used the next
   * time the page renders.</html>
   * 
   * @param componentType  the new componentType value
   */
  final public void setComponentType(String componentType)
  {
    setProperty(COMPONENT_TYPE_KEY, (componentType));
  }

  /**
   * Gets <html> The name of the EL variable that will be set when encoding the component.
   *         This attribute is set by the tr:componentDef on behalf of the UIXComponentRef, and not the tr:componentRef.
   *         For example,
   *               let's say this "var" attribute is set to the value "attrs";
   *               if the &lt;tr:componentRef&gt; tag has an attribute called "bar",
   *               The value of "bar" can be referenced from a child within
   *               &lt;tr:componentDef&gt; using the expression
   *               <code>#{attrs.bar}</code>.</html>
   *
   * @return  the new var value
   */
  final public String getVar()
  {
    return ComponentUtils.resolveString(getProperty(VAR_KEY));
  }

  /**
   * Sets <html> The name of the EL variable that will be set when encoding the component.
   *         This attribute is set by the tr:componentDef on behalf of the UIXComponentRef, and not the tr:componentRef.
   *         For example,
   *               let's say this "var" attribute is set to the value "attrs";
   *               if the &lt;tr:componentRef&gt; tag has an attribute called "bar",
   *               The value of "bar" can be referenced from a child within
   *               &lt;tr:componentDef&gt; using the expression
   *               <code>#{attrs.bar}</code>.</html>
   * 
   * @param var  the new var value
   */
  final public void setVar(String var)
  {
    setProperty(VAR_KEY, (var));
  }

  @Override
  public String getFamily()
  {
    return COMPONENT_FAMILY;
  }

  @Override
  protected FacesBean.Type getBeanType()
  {
    return TYPE;
  }

  /**
   * Construct an instance of the UIXComponentRef.
   */
  protected UIXComponentRef(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lock();
  }
}
