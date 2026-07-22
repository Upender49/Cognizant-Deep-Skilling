import axios from "axios";
import GitClient from "./GitClient";
jest.mock("axios");

describe("Git client Tests",()=>{
    test("should return repository names",async ()=>{
        const mockData = [
            {
                name: "React"
            },
            {
                name: "SpringBoot"
            },
            {
                name: "Angular"
            }
        ];
        axios.get.mockResolvedValue({
            data : mockData
        })
        const response = await GitClient.getRepositories("techiesyed");
        expect(response.data).toEqual(mockData);
    })

})