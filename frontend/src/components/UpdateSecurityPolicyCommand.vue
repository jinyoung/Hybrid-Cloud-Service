<template>

    <v-card outlined>
        <v-card-title>
            UpdateSecurityPolicy
        </v-card-title>

        <v-card-text>
            <String label="PolicyId" v-model="value.policyId" :editMode="editMode"/>
            <String label="PolicyName" v-model="value.policyName" :editMode="editMode"/>
            <String label="PolicyDescription" v-model="value.policyDescription" :editMode="editMode"/>
            <Boolean label="PolicyEnforcement" v-model="value.policyEnforcement" :editMode="editMode"/>
            <String label="PolicyType" v-model="value.policyType" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="updateSecurityPolicy"
            >
                UpdateSecurityPolicy
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'UpdateSecurityPolicyCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.policyId = '';
            this.value.policyName = '';
            this.value.policyDescription = '';
            this.value.policyEnforcement = false;
            this.value.policyType = '';
        },
        watch: {
        },
        methods: {
            updateSecurityPolicy() {
                this.$emit('updateSecurityPolicy', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

