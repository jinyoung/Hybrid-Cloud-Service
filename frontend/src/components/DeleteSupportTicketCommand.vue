<template>

    <v-card outlined>
        <v-card-title>
            DeleteSupportTicket
        </v-card-title>

        <v-card-text>
            <String label="TicketId" v-model="value.ticketId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="deleteSupportTicket"
            >
                DeleteSupportTicket
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
        name: 'DeleteSupportTicketCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.ticketId = '';
        },
        watch: {
        },
        methods: {
            deleteSupportTicket() {
                this.$emit('deleteSupportTicket', this.value);
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

