
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import HybridCloudServiceManager from "./components/listers/HybridCloudServiceCards"
import HybridCloudServiceDetail from "./components/listers/HybridCloudServiceDetail"

import CloudServiceIntegrationManager from "./components/listers/CloudServiceIntegrationCards"
import CloudServiceIntegrationDetail from "./components/listers/CloudServiceIntegrationDetail"

import SecurityPolicyManager from "./components/listers/SecurityPolicyCards"
import SecurityPolicyDetail from "./components/listers/SecurityPolicyDetail"

import CustomerManager from "./components/listers/CustomerCards"
import CustomerDetail from "./components/listers/CustomerDetail"

import SupportTicketManager from "./components/listers/SupportTicketCards"
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
