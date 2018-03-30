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

import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.FacesEvent;
import javax.faces.event.PhaseId;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.event.DisclosureEvent;
import org.apache.myfaces.trinidad.event.DisclosureListener;
import org.apache.myfaces.trinidad.logging.TrinidadLogger;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.DisclosureEvent</code></td>
 * <td valign="top" nowrap>Apply Request Values<br>Invoke Application</td>
 * <td valign="top">The disclosure event is delivered when a node is
                       disclosed.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXShowDetail extends UIXComponentBase
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey DISCLOSED_KEY =
    TYPE.registerKey("disclosed", Boolean.class, Boolean.FALSE);
  static public final PropertyKey DISCLOSED_TRANSIENT_KEY =
    TYPE.registerKey("disclosedTransient", Boolean.class, Boolean.FALSE);
  static public final PropertyKey IMMEDIATE_KEY =
    TYPE.registerKey("immediate", Boolean.class, Boolean.FALSE);
  static public final PropertyKey DISCLOSURE_LISTENER_KEY =
    TYPE.registerKey("disclosureListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.ShowDetail";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.ShowDetail";

  /**
   * Construct an instance of the UIXShowDetail.
   */
  public UIXShowDetail()
  {
    super("org.apache.myfaces.trinidad.ShowDetail");
  }
  
  @Override
  public void processDecodes(FacesContext context)
  {
    // If we're not disclosed, only process ourselves
    if (!isDisclosed())
    {
      if (isRendered())
        decode(context);
    }
    else
      super.processDecodes(context);
  }

  @Override
  public void processValidators(FacesContext context)
  {
    if (isDisclosed())
      super.processValidators(context);
  }

  @Override
  public void processUpdates(FacesContext context)
  {
    if (isDisclosed())
      super.processUpdates(context);
  }

  @Override
  public void broadcast(FacesEvent event) throws AbortProcessingException
  {
    // Perform standard superclass processing
    super.broadcast(event);

    if (event instanceof DisclosureEvent)
    {
      // Do not update the disclosed if "transient"
      if (!isDisclosedTransient())
      {      
        // Expand or collapse this showDetail
        boolean isDisclosed = ((DisclosureEvent) event).isExpanded();
        // If the component is already in that disclosure state, we 
        // have a renderer bug.  Either it delivered an unnecessary event,
        // or even worse it set disclosed on its own instead of waiting 
        // for the disclosure event to do that, which will lead to lifecycle
        // problems.  So in either case, warn the developer.
        if (isDisclosed == isDisclosed())
        {
          _LOG.warning("EVENT_DELIVERED_ALREADY_IN_DISCLOSURE_STATE", event);
        }
        else
        {
          setDisclosed(isDisclosed);
        }
  
        //pu: Implicitly record a Change for 'disclosed' attribute
        addAttributeChange("disclosed",
                           isDisclosed ? Boolean.TRUE : Boolean.FALSE);
      }
      
      if (isImmediate())
        getFacesContext().renderResponse();

      // Notify the specified disclosure listener method (if any)
      broadcastToMethodBinding(event, getDisclosureListener());
    }
  }

  @Override
  public void queueEvent(FacesEvent e)
  {
    if ((e instanceof DisclosureEvent) && (e.getSource() == this))
    {
      if (isImmediate())
      {
        e.setPhaseId(PhaseId.ANY_PHASE);
      }
      else
      {
        e.setPhaseId(PhaseId.INVOKE_APPLICATION);
      }
    }

    super.queueEvent(e);
  }

  static private final TrinidadLogger _LOG = TrinidadLogger.createTrinidadLogger(UIXShowDetail.class);

  /**
   * Gets whether or not to disclose the children
   *
   * @return  the new disclosed value
   */
  final public boolean isDisclosed()
  {
    return ComponentUtils.resolveBoolean(getProperty(DISCLOSED_KEY), false);
  }

  /**
   * Sets whether or not to disclose the children
   * 
   * @param disclosed  the new disclosed value
   */
  final public void setDisclosed(boolean disclosed)
  {
    setProperty(DISCLOSED_KEY, disclosed ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets stops the local value of disclosed from being set
   *         by renderers. This allows the value to always be taken from the value of the disclosed
   *         value expression. Disclosed values must be updated in other ways (i.e. from a
   *         disclosure listener)
   *
   * @return  the new disclosedTransient value
   */
  final public boolean isDisclosedTransient()
  {
    return ComponentUtils.resolveBoolean(getProperty(DISCLOSED_TRANSIENT_KEY), false);
  }

  /**
   * Sets stops the local value of disclosed from being set
   *         by renderers. This allows the value to always be taken from the value of the disclosed
   *         value expression. Disclosed values must be updated in other ways (i.e. from a
   *         disclosure listener)
   * 
   * @param disclosedTransient  the new disclosedTransient value
   */
  final public void setDisclosedTransient(boolean disclosedTransient)
  {
    setProperty(DISCLOSED_TRANSIENT_KEY, disclosedTransient ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets whether data validation - client-side or
   *             server-side - should be skipped when
   *           events are generated by this component.
   * 
   *           When immediate is false (the default), the disclosure event will
   *           be delivered during the Invoke Application phase, which
   *           will trigger validation.  When set to true, the disclosure
   *           event will be executed during the Apply Request Values phase.
   *
   * @return  the new immediate value
   */
  final public boolean isImmediate()
  {
    return ComponentUtils.resolveBoolean(getProperty(IMMEDIATE_KEY), false);
  }

  /**
   * Sets whether data validation - client-side or
   *             server-side - should be skipped when
   *           events are generated by this component.
   * 
   *           When immediate is false (the default), the disclosure event will
   *           be delivered during the Invoke Application phase, which
   *           will trigger validation.  When set to true, the disclosure
   *           event will be executed during the Apply Request Values phase.
   * 
   * @param immediate  the new immediate value
   */
  final public void setImmediate(boolean immediate)
  {
    setProperty(IMMEDIATE_KEY, immediate ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets a method reference to a disclosure listener
   *
   * @return  the new disclosureListener value
   */
  final public MethodBinding getDisclosureListener()
  {
    return (MethodBinding)getProperty(DISCLOSURE_LISTENER_KEY);
  }

  /**
   * Sets a method reference to a disclosure listener
   * 
   * @param disclosureListener  the new disclosureListener value
   */
  final public void setDisclosureListener(MethodBinding disclosureListener)
  {
    setProperty(DISCLOSURE_LISTENER_KEY, (disclosureListener));
  }

  /**
   * Adds a disclosure listener.
   *
   * @param listener  the disclosure listener to add
   */
  final public void addDisclosureListener(
    DisclosureListener listener)
  {
    addFacesListener(listener);
  }

  /**
   * Removes a disclosure listener.
   *
   * @param listener  the disclosure listener to remove
   */
  final public void removeDisclosureListener(
    DisclosureListener listener)
  {
    removeFacesListener(listener);
  }

  /**
   * Returns an array of attached disclosure listeners.
   *
   * @return  an array of attached disclosure listeners.
   */
  final public DisclosureListener[] getDisclosureListeners()
  {
    return (DisclosureListener[])getFacesListeners(DisclosureListener.class);
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
   * Construct an instance of the UIXShowDetail.
   */
  protected UIXShowDetail(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.ShowDetail","org.apache.myfaces.trinidad.ShowDetail");
  }
}
