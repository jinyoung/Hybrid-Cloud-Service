

<template>
    <v-app id="inspire">
        <div>
            <v-app-bar app clipped-left flat>
                <v-toolbar-title>
                    <span class="second-word font uppercase"
                        style="font-weight:700;"
                    >
                        <v-app-bar-nav-icon
                            @click="openSideBar()"
                            style="z-index:1;
                            height:56px;
                            width:30px;
                            margin-right:10px;
                            font-weight:300;
                            font-size:55px;"
                        >
                            <div style="line-height:100%;">≡</div>
                        </v-app-bar-nav-icon>
                        hybrid cloud service
                    </span>
                </v-toolbar-title>
                <span v-if="urlPath!=null" 
                    class="mdi mdi-home" 
                    key="" 
                    to="/" 
                    @click="goHome()"
                    style="margin-left:10px; font-size:20px; cursor:pointer;"
                    ></span> 
                <v-spacer></v-spacer>

            </v-app-bar>

            <v-navigation-drawer app clipped flat v-model="sideBar">
                <v-list>
                    <v-list-group>
                        <template v-slot:activator>
                            <v-list-item-content>
                                <v-list-item-title>Hybrid Cloud Service Design and Development</v-list-item-title>
                            </v-list-item-content>
                        </template>

                        <v-list-item
                            class="px-2"
                            key="hybridCloudServices"
                            to="/hybridCloudServices"
                            @click="changeUrl()"
                            style="font-weight:700;
                            font-size:14px;"
                        >
                            HybridCloudService
                        </v-list-item>
                    </v-list-group>
                </v-list>
                <v-list>
                    <v-list-group>
                        <template v-slot:activator>
                            <v-list-item-content>
                                <v-list-item-title>External Cloud Service Integration and Management</v-list-item-title>
                            </v-list-item-content>
                        </template>

                        <v-list-item
                            class="px-2"
                            key="cloudServiceIntegrations"
                            to="/cloudServiceIntegrations"
                            @click="changeUrl()"
                            style="font-weight:700;
                            font-size:14px;"
                        >
                            CloudServiceIntegration
                        </v-list-item>
                    </v-list-group>
                </v-list>
                <v-list>
                    <v-list-group>
                        <template v-slot:activator>
                            <v-list-item-content>
                                <v-list-item-title>Security Management and Monitoring</v-list-item-title>
                            </v-list-item-content>
                        </template>

                        <v-list-item
                            class="px-2"
                            key="securityPolicies"
                            to="/securityPolicies"
                            @click="changeUrl()"
                            style="font-weight:700;
                            font-size:14px;"
                        >
                            SecurityPolicy
                        </v-list-item>
                    </v-list-group>
                </v-list>
                <v-list>
                    <v-list-group>
                        <template v-slot:activator>
                            <v-list-item-content>
                                <v-list-item-title>Customer Relationship Management</v-list-item-title>
                            </v-list-item-content>
                        </template>

                        <v-list-item
                            class="px-2"
                            key="customers"
                            to="/customers"
                            @click="changeUrl()"
                            style="font-weight:700;
                            font-size:14px;"
                        >
                            Customer
                        </v-list-item>
                    </v-list-group>
                </v-list>
                <v-list>
                    <v-list-group>
                        <template v-slot:activator>
                            <v-list-item-content>
                                <v-list-item-title>Maintenance and Support Services</v-list-item-title>
                            </v-list-item-content>
                        </template>

                        <v-list-item
                            class="px-2"
                            key="supportTickets"
                            to="/supportTickets"
                            @click="changeUrl()"
                            style="font-weight:700;
                            font-size:14px;"
                        >
                            SupportTicket
                        </v-list-item>
                    </v-list-group>
                </v-list>
            </v-navigation-drawer>
        </div>

        <v-main>
            <v-container v-if="urlPath" style="max-width:100vw !important;" class="py-8 px-6 mt-10" fluid>
                <router-view></router-view>
            </v-container>
            <v-container v-else class="py-8 px-6 mt-10" fluid>
                <v-row>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="hybridCloudServices"
                                            to="/hybridCloudServices"
                                            @click="changeUrl()"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            HybridCloudService
                                        </v-btn>
                                    </template>
                                    <span>HybridCloudService</span>
                                </v-tooltip>
                            </v-card-actions>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="cloudServiceIntegrations"
                                            to="/cloudServiceIntegrations"
                                            @click="changeUrl()"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            CloudServiceIntegration
                                        </v-btn>
                                    </template>
                                    <span>CloudServiceIntegration</span>
                                </v-tooltip>
                            </v-card-actions>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="securityPolicies"
                                            to="/securityPolicies"
                                            @click="changeUrl()"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            SecurityPolicy
                                        </v-btn>
                                    </template>
                                    <span>SecurityPolicy</span>
                                </v-tooltip>
                            </v-card-actions>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="customers"
                                            to="/customers"
                                            @click="changeUrl()"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            Customer
                                        </v-btn>
                                    </template>
                                    <span>Customer</span>
                                </v-tooltip>
                            </v-card-actions>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="supportTickets"
                                            to="/supportTickets"
                                            @click="changeUrl()"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            SupportTicket
                                        </v-btn>
                                    </template>
                                    <span>SupportTicket</span>
                                </v-tooltip>
                            </v-card-actions>
                        </v-card>

                </v-row>
            </v-container>
        </v-main>
    </v-app>
</template>

<script>

export default {
    name: "App",

    data: () => ({
        useComponent: "",
        drawer: true,
        components: [],
        sideBar: true,
        urlPath: null,
    }),
    
    async created() {
      var path = document.location.href.split("#/")
      this.urlPath = path[1];

    },

    mounted() {
        var me = this;
        me.components = this.$ManagerLists;
    },

    methods: {
        openSideBar(){
            this.sideBar = !this.sideBar
        },
        changeUrl() {
            var path = document.location.href.split("#/")
            this.urlPath = path[1];
        },
        goHome() {
            this.urlPath = null;
        },
    }
};
</script>
<style>
</style>
