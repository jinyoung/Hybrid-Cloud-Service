<template>

    <v-card outlined>
        <v-card-title>
            DeleteSecurityPolicy
        </v-card-title>

        <v-card-text>
            <String label="PolicyId" v-model="value.policyId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="deleteSecurityPolicy"
            >
                DeleteSecurityPolicy
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
        name: 'DeleteSecurityPolicyCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.policyId = '';
        },
        watch: {
        },
        methods: {
            deleteSecurityPolicy() {
                this.$emit('deleteSecurityPolicy', this.value);
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

