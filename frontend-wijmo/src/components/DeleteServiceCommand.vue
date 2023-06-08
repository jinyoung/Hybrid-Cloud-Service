<template>

    <v-card outlined>
        <v-card-title>
            DeleteService
        </v-card-title>

        <v-card-text>
            <String label="ServiceId" v-model="value.serviceId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="deleteService"
            >
                DeleteService
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
        name: 'DeleteServiceCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.serviceId = '';
        },
        watch: {
        },
        methods: {
            deleteService() {
                this.$emit('deleteService', this.value);
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

