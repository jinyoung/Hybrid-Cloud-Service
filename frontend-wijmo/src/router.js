
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import HybridCloudServiceManager from "./grid/HybridCloudServiceGrid"
import HybridCloudServiceDetail from "./components/listers/HybridCloudServiceDetail"

import CloudServiceIntegrationManager from "./grid/CloudServiceIntegrationGrid"
import CloudServiceIntegrationDetail from "./components/listers/CloudServiceIntegrationDetail"

import SecurityPolicyManager from "./grid/SecurityPolicyGrid"
import SecurityPolicyDetail from "./components/listers/SecurityPolicyDetail"

import CustomerManager from "./grid/CustomerGrid"
import CustomerDetail from "./components/listers/CustomerDetail"

import SupportTicketManager from "./grid/SupportTicketGrid"
import SupportTicketDetail from "./components/listers/SupportTicketDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/hybridCloudServices',
                name: 'HybridCloudServiceManager',
                component: HybridCloudServiceManager
            },
            {
                path: '/hybridCloudServices/:id',
                name: 'HybridCloudServiceDetail',
                component: HybridCloudServiceDetail
            },

            {
                path: '/cloudServiceIntegrations',
                name: 'CloudServiceIntegrationManager',
                component: CloudServiceIntegrationManager
            },
            {
                path: '/cloudServiceIntegrations/:id',
                name: 'CloudServiceIntegrationDetail',
                component: CloudServiceIntegrationDetail
            },

            {
                path: '/securityPolicies',
                name: 'SecurityPolicyManager',
                component: SecurityPolicyManager
            },
            {
                path: '/securityPolicies/:id',
                name: 'SecurityPolicyDetail',
                component: SecurityPolicyDetail
            },

            {
                path: '/customers',
                name: 'CustomerManager',
                component: CustomerManager
            },
            {
                path: '/customers/:id',
                name: 'CustomerDetail',
                component: CustomerDetail
            },

            {
                path: '/supportTickets',
                name: 'SupportTicketManager',
                component: SupportTicketManager
            },
            {
                path: '/supportTickets/:id',
                name: 'SupportTicketDetail',
                component: SupportTicketDetail
            },



    ]
})
