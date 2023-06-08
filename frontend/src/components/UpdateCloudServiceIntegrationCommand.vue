<template>

    <v-card outlined>
        <v-card-title>
            UpdateCloudServiceIntegration
        </v-card-title>

        <v-card-text>
            <String label="IntegrationId" v-model="value.integrationId" :editMode="editMode"/>
            <String label="IntegrationName" v-model="value.integrationName" :editMode="editMode"/>
            <String label="CloudServiceProvider" v-model="value.cloudServiceProvider" :editMode="editMode"/>
            <String label="CloudServiceType" v-model="value.cloudServiceType" :editMode="editMode"/>
            <String label="ConnectionString" v-model="value.connectionString" :editMode="editMode"/>
            <Boolean label="IntegrationStatus" v-model="value.integrationStatus" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="updateCloudServiceIntegration"
            >
                UpdateCloudServiceIntegration
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
        name: 'UpdateCloudServiceIntegrationCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.integrationId = '';
            this.value.integrationName = '';
            this.value.cloudServiceProvider = '';
            this.value.cloudServiceType = '';
            this.value.connectionString = '';
            this.value.integrationStatus = false;
        },
        watch: {
        },
        methods: {
            updateCloudServiceIntegration() {
                this.$emit('updateCloudServiceIntegration', this.value);
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

