/*
 * RHQ Management Platform
 *  Copyright [2005-2013] [Red Hat, Inc]
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.rhq.helpers.pluginGen;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.rhq.helpers.pluginAnnotations.agent.DataType;
import org.rhq.helpers.pluginAnnotations.agent.DisplayType;
import org.rhq.helpers.pluginAnnotations.agent.Units;

/**
 * The properties needed to generate a new plugin skeleton
 *
 * @author Heiko W. Rupp
 */
@SuppressWarnings("unused")
public class Props {

   /** What category is this ? */
   private ResourceCategory category = ResourceCategory.SERVICE;
   /** The name of this item */
   private String name;
   /** A description of the plugin */
   private String description;
   /** Package name prefix */
   private String packagePrefix;
   /** String package */
   private String pkg;
   /** The name of the DiscoveryClass */
   private String discoveryClass;
   /** The name of the Component class */
   private String componentClass;
   /** The type of the parent we run in */
   private String parentType;
   /** Filesytem root */
   private String fileSystemRoot;
   /** Should this service do monitoring ? */
   private boolean hasMetrics;
   /** Should this service do operations ? */
   private boolean hasOperations;
   /** Is this service a singleton (e.g. a XYZ subsystem) */
   private boolean singleton;
   /** Does the service support configuration ? */
   private boolean resourceConfiguration;
   /** Does the service support events */
   private boolean events;
   /** Does the service support the support facet? */
   private boolean supportFacet;
   /** Can the service create children ? */
   private boolean createChildren;
   /** Can the service delete children ? */
   private boolean deleteChildren;
   /** Use externals jars in the plugin jar ? */
   private boolean usesExternalJarsInPlugin;
   /** Does it support manual add of children ? */
   private boolean manualAddOfResourceType;
   /** Does it use the PluginLifecycleListener api ? */
   private boolean usePluginLifecycleListenerApi;
   /** Depends on JMX plugin ? */
   private boolean dependsOnJmxPlugin;
   /** Depends on AS7 plugin ? */
   private boolean dependsOnAs7Plugin;
   /** Directory with java files to scan for plugin annotations */
   private String scanForAnnotations;
   /** What version of RHQ should this plugin's pom use ? */
   private String rhqVersion = "4.8.0";

   /** Embedded children */
   private Set<Props> children = new HashSet<Props>();

   private Set<SimpleProperty> pluginConfig = new LinkedHashSet<SimpleProperty>();
   private Set<SimpleProperty> resourceConfig = new LinkedHashSet<SimpleProperty>();

   private Set<Template> templates = new HashSet<Template>();

   private Set<MetricProps> metrics = new LinkedHashSet<MetricProps>();

   private Set<OperationProps> operations = new LinkedHashSet<OperationProps>();

   private Set<TypeKey> runsInsides = new LinkedHashSet<TypeKey>();;

   private String pluginName;
   private String pluginDescription;

   public ResourceCategory getCategory() {
      return category;
   }

   public void setCategory(ResourceCategory category) {
      this.category = category;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDiscoveryClass() {
      return discoveryClass;
   }

   public void setDiscoveryClass(String discoveryClass) {
      this.discoveryClass = discoveryClass;
   }

   public String getComponentClass() {
      return componentClass;
   }

   public void setComponentClass(String componentClass) {
      this.componentClass = componentClass;
   }

   public String getParentType() {
      return parentType;
   }

   public void setParentType(String parentType) {
      this.parentType = parentType;
   }

   public boolean isHasMetrics() {
      return hasMetrics;
   }

   public void setHasMetrics(boolean hasMetrics) {
      this.hasMetrics = hasMetrics;
   }

   public boolean isHasOperations() {
      return hasOperations;
   }

   public void setHasOperations(boolean hasOperations) {
      this.hasOperations = hasOperations;
   }

   public boolean isSingleton() {
      return singleton;
   }

   public void setSingleton(boolean singleton) {
      this.singleton = singleton;
   }

   public boolean isResourceConfiguration() {
      return resourceConfiguration;
   }

   public void setResourceConfiguration(boolean resourceConfiguration) {
      this.resourceConfiguration = resourceConfiguration;
   }

   public boolean isEvents() {
      return events;
   }

   public void setEvents(boolean events) {
      this.events = events;
   }

   public boolean isSupportFacet() {
      return supportFacet;
   }

   public void setSupportFacet(boolean supportFacet) {
      this.supportFacet = supportFacet;
   }

   public boolean isCreateChildren() {
      return createChildren;
   }

   public void setCreateChildren(boolean createChildren) {
      this.createChildren = createChildren;
   }

   public Set<Props> getChildren() {
      return children;
   }

   public void setChildren(Set<Props> children) {
      this.children = children;
   }

   public String getPackagePrefix() {
      return packagePrefix;
   }

   public void setPackagePrefix(String packagePrefix) {
      this.packagePrefix = packagePrefix;
   }

   public String getFileSystemRoot() {
      return fileSystemRoot;
   }

   public void setFileSystemRoot(String fileSystemRoot) {
      this.fileSystemRoot = fileSystemRoot;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public boolean isUsesExternalJarsInPlugin() {
      return usesExternalJarsInPlugin;
   }

   public void setUsesExternalJarsInPlugin(boolean usesExternalJarsInPlugin) {
      this.usesExternalJarsInPlugin = usesExternalJarsInPlugin;
   }

   public boolean isDeleteChildren() {
      return deleteChildren;
   }

   public void setDeleteChildren(boolean deleteChildren) {
      this.deleteChildren = deleteChildren;
   }

   public boolean isManualAddOfResourceType() {
      return manualAddOfResourceType;
   }

   public void setManualAddOfResourceType(boolean manualAddOfResourceType) {
      this.manualAddOfResourceType = manualAddOfResourceType;
   }

   public void setPkg(String pkg) {
      this.pkg = pkg;
   }

   public String getPkg() {
      return this.pkg;
   }

   public boolean isUsePluginLifecycleListenerApi() {
      return usePluginLifecycleListenerApi;
   }

   public void setUsePluginLifecycleListenerApi(boolean usePluginLifecycleListenerApi) {
      this.usePluginLifecycleListenerApi = usePluginLifecycleListenerApi;
   }

   public boolean isDependsOnJmxPlugin() {
      return dependsOnJmxPlugin;
   }

   public void setDependsOnJmxPlugin(boolean dependsOnJmxPlugin) {
      this.dependsOnJmxPlugin = dependsOnJmxPlugin;
   }

   public String getRhqVersion() {
      return rhqVersion;
   }

   public void setRhqVersion(String rhqVersion) {
      this.rhqVersion = rhqVersion;
   }

   public Set<SimpleProperty> getPluginConfig() {
      return pluginConfig;
   }

   public void setPluginConfig(Set<SimpleProperty> pluginConfig) {
      this.pluginConfig = pluginConfig;
   }

   public Set<Template> getTemplates() {
      return templates;
   }

   public void setTemplates(Set<Template> templates) {
      this.templates = templates;
   }

    public Set<SimpleProperty> getResourceConfig() {
        return resourceConfig;
    }

    public void setResourceConfig(Set<SimpleProperty> resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    public Set<MetricProps> getMetrics() {
      return metrics;
   }

   public void setMetrics(Set<MetricProps> metricProps) {
      this.metrics = metricProps;
   }

   public Set<OperationProps> getOperations() {
      return operations;
   }

   public void setOperations(Set<OperationProps> opProps) {
      this.operations = opProps;
   }

   public String getPluginName() {
      return pluginName;
   }

   public void setPluginName(String pluginName) {
      this.pluginName = pluginName;
   }

   public String getPluginDescription() {
      return pluginDescription;
   }

   public void setPluginDescription(String pluginDescription) {
      this.pluginDescription = pluginDescription;
   }

    public Set<TypeKey> getRunsInsides() {
        return runsInsides;
    }

    public void setRunsInsides(Set<TypeKey> runsInsides) {
        this.runsInsides = runsInsides;
    }

    public boolean isDependsOnAs7Plugin() {
        return dependsOnAs7Plugin;
    }

    public void setDependsOnAs7Plugin(boolean dependsOnAs7Plugin) {
        this.dependsOnAs7Plugin = dependsOnAs7Plugin;
    }

    public String getScanForAnnotations() {
        return scanForAnnotations;
    }

    public void setScanForAnnotations(String scanForAnnotations) {
        this.scanForAnnotations = scanForAnnotations;
    }


    @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder();
      sb.append("Props");
      sb.append("{category=").append(category);
      sb.append(", name='").append(name).append('\'');
      sb.append(", description='").append(description).append('\'');
      sb.append(", packagePrefix='").append(packagePrefix).append('\'');
      sb.append(", pkg='").append(pkg).append('\'');
      sb.append(", discoveryClass='").append(discoveryClass).append('\'');
      sb.append(", componentClass='").append(componentClass).append('\'');
      sb.append(", parentType='").append(parentType).append('\'');
      sb.append(", fileSystemRoot='").append(fileSystemRoot).append('\'');
      sb.append(", monitoring=").append(hasMetrics);
      sb.append(", operations=").append(hasOperations);
      sb.append(", metricProps=").append(metrics);
      sb.append(", operationProps=").append(operations);
      sb.append(", singleton=").append(singleton);
      sb.append(", resourceConfiguration=").append(resourceConfiguration);
      sb.append(", events=").append(events);
      sb.append(", supportFacet=").append(supportFacet);
      sb.append(", createChildren=").append(createChildren);
      sb.append(", deleteChildren=").append(deleteChildren);
      sb.append(", usesExternalJarsInPlugin=").append(usesExternalJarsInPlugin);
      sb.append(", manualAddOfResourceType=").append(manualAddOfResourceType);
      sb.append(", usePluginLifecycleListenerApi=").append(usePluginLifecycleListenerApi);
      sb.append(", dependsOnJmxPlugin=").append(dependsOnJmxPlugin);
      sb.append(", rhqVersion='").append(rhqVersion).append('\'');
      sb.append(", children=").append(children);
      sb.append(", simpleProps=").append(pluginConfig);
      sb.append(", templates=").append(templates);
      sb.append(", runsInsides=").append(runsInsides);
      sb.append('}');
      return sb.toString();
   }

    public static class TypeKey {
       private String name;
       private String pluginName;

       public TypeKey(String name, String pluginName) {
           this.name = name;
           this.pluginName = pluginName;
       }

       public String getPluginName() {
           return pluginName;
       }

       public String getName() {
           return name;
       }

       @Override
       public String toString() {
           return "TypeKey{" +
               "name='" + name + '\'' +
               ", pluginName='" + pluginName + '\'' +
               '}';
       }
   }

   public static class SimpleProperty {
      private final String name;
      private String description;
      private String type;
      private boolean readOnly;
      private String displayName;
      private String defaultValue;

      public SimpleProperty(String name) {
         this.name = name;
      }

      public String getName() {
         return name;
      }

      public String getDescription() {
         return description;
      }

      public void setDescription(String description) {
         this.description = description;
      }

      public String getType() {
         return type;
      }

      public void setType(String type) {
         this.type = type;
      }

      public boolean isReadOnly() {
         return readOnly;
      }

      public void setReadOnly(boolean readOnly) {
         this.readOnly = readOnly;
      }

      public String getDisplayName() {
         return displayName;
      }

      public void setDisplayName(String displayName) {
         this.displayName = displayName;
      }

      public String getDefaultValue() {
         return defaultValue;
      }

      public void setDefaultValue(String defaultValue) {
         this.defaultValue = defaultValue;
      }
   }

   public static class Template {
      private final String name;
      private String description;
      private Set<SimpleProperty> simpleProps = new HashSet<SimpleProperty>();

      public Template(String name) {
         this.name = name;
      }

      public String getDescription() {
         return description;
      }

      public void setDescription(String description) {
         this.description = description;
      }

      public Set<SimpleProperty> getSimpleProps() {
         return simpleProps;
      }

      public void setSimpleProps(Set<SimpleProperty> simpleProps) {
         this.simpleProps = simpleProps;
      }

      public String getName() {
         return name;
      }
   }

   public static class MetricProps {
      private final String property;
      private String displayName;
      private String description;
      private DisplayType displayType;
      private DataType dataType;
      private Units units;

      public MetricProps(String property) {
         this.property = property;
      }

      public DataType getDataType() {
         return dataType;
      }

      public void setDataType(DataType dataType) {
         this.dataType = dataType;
      }

      public String getDisplayName() {
         return displayName;
      }

      public void setDisplayName(String displayName) {
         this.displayName = displayName;
      }

      public String getDescription() {
         return description;
      }

      public void setDescription(String description) {
         this.description = description;
      }

      public DisplayType getDisplayType() {
         return displayType;
      }

      public void setDisplayType(DisplayType displayType) {
         this.displayType = displayType;
      }

      public Units getUnits() {
         return units;
      }

      public void setUnits(Units units) {
         this.units = units;
      }

      public String getProperty() {
         return property;
      }
   }

   public static class OperationProps {
      private final String name;
      private String displayName;
      private String description;
      private Set<SimpleProperty> params = new LinkedHashSet<SimpleProperty>();
      private SimpleProperty result;

      public OperationProps(String name) {
         this.name = name;
      }

      public String getDisplayName() {
         return displayName;
      }

      public void setDisplayName(String displayName) {
         this.displayName = displayName;
      }

      public String getDescription() {
         return description;
      }

      public void setDescription(String description) {
         this.description = description;
      }

      public String getName() {
         return name;
      }

      public Set<SimpleProperty> getParams() {
         return params;
      }

      public SimpleProperty getResult() {
         return result;
      }

      public void setResult(SimpleProperty result) {
         this.result = result;
      }
   }
}
